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
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class RegisterUser extends HttpServlet {

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
        Connection con = null;
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registration Status</title>");            
            out.println("</head>");
            out.println("<body>");
            
            ServletContext context = getServletConfig().getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String dbuser = context.getInitParameter("dbUser");
            String dbpass = context.getInitParameter("dbPass");
            con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            int userid = Integer.parseInt(request.getParameter("userid"));
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            int status = Integer.parseInt(request.getParameter("status"));
            String usertype = request.getParameter("usertype");
            
            String sql = "insert into user values (?, ?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userid);
            ps.setString(2, user);
            ps.setString(3, pass);
            ps.setInt(4, status);
            ps.setString(5, usertype);
            ps.execute();
            
            out.println("<h1>User Registration Status: Success</h1><br><br>");
            out.println("<a href='" + request.getContextPath() + "/Welcome'>Click here</a> to return to welcome page...");
            
            con.close();
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            
            out.println("<h1>User Registration Status: Failed</h1>");
            out.println("<h3>Cause:</h3> " + e.getMessage());
            out.println("<br><br><a href='" + request.getContextPath() + "/Welcome'>Click here</a> to return to welcome page...");
        }
        catch(NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            
            out.println("<h1>User Registration Status: Failed</h1>");
            out.println("<h3>Cause:</h3> <b>NumberFormatException</b> " + e.getMessage());
            out.println("<br><br><a href='" + request.getContextPath() + "/Welcome'>Click here</a> to return to welcome page...");
        }
        finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
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
