/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh;

import com.hp.j2sh.entity.Voter;
import com.hp.j2sh.mysql.MYSQLConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        try {
            /* TODO output your page here. You may use following sample code. */
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            HttpSession session = request.getSession(true);
            Connection con = MYSQLConnection.getMySQLConnection(JDBC_DRIVER, DB_URL, USER, PASS);
            PreparedStatement ps1 = con.prepareStatement("select * from voter where email_id=? and password=?");
            ps1.setString(1, username);
            ps1.setString(2, password);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()) {
                System.out.println("LoginAuthenticated");
                session.setAttribute("user", rs1.getString(1));
                Voter _voter = new Voter();
                _voter.setName(rs1.getString(1));
                _voter.setAge(rs1.getShort(2));
                _voter.setGender(rs1.getString(3));
                _voter.setDob(rs1.getString(4));
                _voter.setEmail_id(rs1.getString(5));
                _voter.setPassword(rs1.getString(6));
                _voter.setVote_status(rs1.getShort(7));
                session.setAttribute("VoterObject", _voter);
                request.getRequestDispatcher("infoPage.jsp").forward(request, response);
            }
            else {
                String sql1 = "select * from voter where email_id=?";
                PreparedStatement ps2 = con.prepareStatement(sql1);
                ps2.setString(1, username);
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) session.setAttribute("msgPass", "Invalid Password!");
                else session.setAttribute("msgUser", "Invalid Username!");
                request.getRequestDispatcher("loginPage.jsp").forward(request, response);
            }
        }
        catch(Exception e) {
            System.out.println("Login Exception :: " + e);
        } 
        finally {
            out.close();
        }
        request.getRequestDispatcher("errorPage.jsp").forward(request, response);
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
