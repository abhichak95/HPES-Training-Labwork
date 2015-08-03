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
public class GetVote extends HttpServlet {
    
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
        System.out.println("GetVote Init");
        HttpSession session = request.getSession();
        try {
            System.out.println("GetVote 1");
            Voter _voter = (Voter) session.getAttribute("VoterObject");
            System.out.println("GetVote 2");
            String email_id = _voter.getEmail_id();
            String password = _voter.getPassword();
            Connection con = MYSQLConnection.getMySQLConnection(JDBC_DRIVER, DB_URL, USER, PASS);
            PreparedStatement ps1 = con.prepareStatement("update voter set vote_status=1 where email_id=? and password=?");
            ps1.setString(1, email_id);
            ps1.setString(2, password);
            ps1.executeUpdate();
            session.setAttribute("msg", "Your vote has been counted...");
            _voter.setVote_status(new Short("1"));
            session.setAttribute("VoterObject", _voter);
            request.getRequestDispatcher("infoPage.jsp").forward(request, response);
        }
        catch(Exception e) {
            System.out.println("GetVote Exception :: " + e);
        }
        finally {
            
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
