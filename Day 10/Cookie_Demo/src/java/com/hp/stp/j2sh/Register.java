/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class Register extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<center>");
            out.println("<h1>User Registration</h1><br><br><br>");
            out.println("<form method='get' action='RegisterUser'>");
            out.println("<h3>:-: Fill-up the following details :-:</h3><br><br><br>");
            out.println("<label>User ID</label>: <input type='text' name='userid'><br><br>");
            String usrString = request.getParameter("username");
            if (usrString != null)
                out.println("<label>Username</label>: <input type='text' name='username' value='" + usrString + "'><br><br>");
            else
                out.println("<label>Username</label>: <input type='text' name='username'><br><br>");
            out.println("<label>Password</label>: <input type='password' name='password'><br><br>");
            out.println("<label>Status</label>: <input type='number' name='status'><br><br>");
            out.println("<label>User Type</label>: <input type='radio' name='usertype' value='admin'>Admin <input type='radio' name='usertype' value='other'>Other<br><br>");
            out.println("<input type='submit' value='Submit'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
            out.println("<input type='reset' value='Reset'>");
            out.println("</form>");
            out.println("</center>");
            
            out.println("</body>");
            out.println("</html>");
        } finally {
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
