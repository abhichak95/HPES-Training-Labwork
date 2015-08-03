/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh;

import com.hp.j2sh.mysql.MYSQLConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class RegisterVoter extends HttpServlet {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/assignment";
    private static final String USER = "root";
    private static final String PASS = "password";


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
        System.out.println("RegisterVoter 1");
        try {
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("dob");
            String email_id = request.getParameter("email_id");
            String password = request.getParameter("password");
            Connection con = MYSQLConnection.getMySQLConnection(JDBC_DRIVER, DB_URL, USER, PASS);
            PreparedStatement ps1 = con.prepareStatement("insert into voter values(?,?,?,?,?,?,0)");
            ps1.setString(1, name);
            ps1.setString(2, age);
            ps1.setString(3, gender);
            ps1.setString(4, dob);
            ps1.setString(5, email_id);
            ps1.setString(6, password);
            ps1.executeUpdate();
            System.out.println("RegisterVoter 2");
            request.getRequestDispatcher("loginPage.jsp").forward(request, response);
        }
        catch(Exception e) {
            System.out.println("RegisterVoter Exception :: " + e);
        }
        finally {
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
