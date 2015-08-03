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

/**
 *
 * @author Abhishek
 */
public class UpdatePage extends HttpServlet {

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
        String update = cnf.getInitParameter("update");
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdatePage</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int id = Integer.parseInt((String)request.getAttribute("id"));
            ServletContext context = getServletConfig().getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String dbuser = context.getInitParameter("dbUser");
            String dbpass = context.getInitParameter("dbPass");
            Connection con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            PreparedStatement ps = con.prepareStatement("select * from user where userID=?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String usernameString = rs.getString(2);
            String passwordString = rs.getString(3);
            int status = rs.getInt(4);
            String typeString = rs.getString(5);
            out.println("<center>");
            out.println("<h1>User Updation</h1><br><br><br>");
            out.println("<form method='post' action='" + update + "'>");
            out.println("<h3>:-: Update the following details :-:</h3><br><br><br>");
            out.println("<label>User ID</label>: <input type='text' name='userid' value='" + id + "'><br><br>");
            out.println("<label>Username</label>: <input type='text' name='username' value='" + usernameString + "'><br><br>");
            out.println("<label>Password</label>: <input type='text' name='password' value='" + passwordString + "'><br><br>");
            out.println("<label>Status</label>: <input type='number' name='status' value='" + status + "'><br><br>");
            if (typeString.equalsIgnoreCase("admin"))
                out.println("<label>User Type</label>: <input type='radio' name='usertype' value='admin' checked='checked'>Admin <input type='radio' name='usertype' value='other'>Other<br><br>");
            else
                out.println("<label>User Type</label>: <input type='radio' name='usertype' value='admin'>Admin <input type='radio' name='usertype' value='other' checked='checked'>Other<br><br>");
            out.println("<input type='submit' value='Submit'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
            out.println("<input type='reset' value='Reset'>");
            out.println("</form>");
            out.println("</center>");
            
        }
        catch(NumberFormatException e) {
            out.println("NumberFormatException: " + e.getMessage());
        }
        catch(SQLException e) {
            out.println("SQLException: " + e.getMessage());
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
