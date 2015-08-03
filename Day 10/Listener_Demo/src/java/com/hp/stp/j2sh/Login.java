/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import com.hp.stp.j2sh.mysql.MySQLConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek
 */
public class Login extends HttpServlet {
    private static Connection con = null;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Status</title>");            
        out.println("</head>");
        out.println("<body>");
        try {
            ServletContext context = getServletConfig().getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String dbuser = context.getInitParameter("dbUser");
            String dbpass = context.getInitParameter("dbPass");
            con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            String sql = "select userType from user where username=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            ServletConfig cnf = getServletConfig();
            String otherUser = cnf.getInitParameter("user");
            String adminUser = cnf.getInitParameter("admin");
            String homepage = cnf.getInitParameter("home");
            if (!rs.next()) {
                /*out.println("<h3>You are NOT a registered user !!!</h3>");
                out.println("<br>Please wait while we redirect you to the Registration Page...");
                try {
                    Thread.sleep(3000);
                }
                catch(InterruptedException e) {
                    System.out.println("InterruptedException: " + e.getMessage());
                }
                request.getRequestDispatcher("/Register").forward(request, response);*/
                String sql1 = "select * from user where username=?";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setString(1, user);
                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()) {
                    String usrnm = rs1.getString(2);
                    //String pswrd = rs1.getString(3);
                    if (usrnm.equalsIgnoreCase(user)) request.setAttribute("msgPass", "Invalid Password!");
                }
                else request.setAttribute("msgUser", "Invalid Username!");
                request.getRequestDispatcher(homepage).forward(request, response);
            }
            else {
                String userTypeString = rs.getString(1);
                
                // Session management
                
                HttpSession session = request.getSession();
                session.setAttribute("userType", userTypeString);
                
                //out.println("usertype: " + userTypeString);
                if (userTypeString.equalsIgnoreCase("admin")) {
                    //out.println("<h3>You are an ADMINISTRATOR !!!</h3>");
                    //out.println("<a href='/User_DB_Project/Admin'>Click here</a> to go to Admin Page...");
                    //out.println("<br>Please wait while we redirect you to the Admin Page...");
                    
//                    session.invalidate();
                    request.getRequestDispatcher(adminUser).forward(request, response);
                }
                else {
                    //out.println("<h3>You are a standard user !!!</h3>");
                    //out.println("<a href='/User_DB_Project/Other'>Click here</a> to go to your page...");
                    //out.println("<br>Please wait while we redirect you to your page...");
                    
                    request.getRequestDispatcher(otherUser).forward(request, response);
                }
            }
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        out.println("</body>");
        out.println("</html>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
