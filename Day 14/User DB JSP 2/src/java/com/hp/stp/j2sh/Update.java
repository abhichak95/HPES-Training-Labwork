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
public class Update extends HttpServlet {

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
        ServletConfig cnf = getServletConfig();
        HttpSession session = request.getSession(false);
        String adminPage = cnf.getInitParameter("admin");
        String userPage = cnf.getInitParameter("user");
        try {
            
            int id = Integer.parseInt((String)request.getParameter("userid"));
            System.out.println("sout2=" + id);
            ServletContext context = getServletConfig().getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String dbuser = context.getInitParameter("dbUser");
            String dbpass = context.getInitParameter("dbPass");
            Connection con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            String usernameString = request.getParameter("username");
            String passwordString = request.getParameter("password");
            int status = Integer.parseInt(request.getParameter("status"));
            String usertypeString = request.getParameter("usertype");
            PreparedStatement ps = con.prepareStatement("UPDATE user SET userid=?, username=?, password=?, status=?, userType=? where userID=?;");
            ps.setInt(1, id);
            ps.setString(2, usernameString);
            ps.setString(3, passwordString);
            ps.setInt(4, status);
            ps.setString(5, usertypeString);
            ps.setInt(6, id);
            ps.execute();
            request.setAttribute("UpdationMsg", "Updation Successful!");
            
        }
        catch(NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            request.setAttribute("UpdationMsg", "Updation UnSuccessful!");
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            request.setAttribute("UpdationMsg", "Updation UnSuccessful!");
        }
        finally {
            out.println("</body>");
            out.println("</html>");
            if (session.getAttribute("userType").equals("admin")) {
                request.getRequestDispatcher(adminPage).forward(request, response);
            }
            else if (session.getAttribute("userType").equals("other")) {
                request.getRequestDispatcher(userPage).forward(request, response);
            }
            
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
