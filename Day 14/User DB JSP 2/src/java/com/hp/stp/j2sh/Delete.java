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
public class Delete extends HttpServlet {

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
        ServletConfig config = getServletConfig();
        String homepage = (String) config.getInitParameter("homepage");
        String adminPage = (String) config.getInitParameter("admin");
        HttpSession session = request.getSession(false);
        try {
            /* TODO output your page here. You may use following sample code. */
//            HttpSession session = request.getSession(false);
//            String usertypeString = (String) session.getAttribute("userType");
//            if (usertypeString.equals("") || usertypeString.equalsIgnoreCase("other")) {
//                session.invalidate();
//                response.sendRedirect(homepage);
//            }
            
            int id = Integer.parseInt((String)session.getAttribute("id"));
            ServletContext context = getServletConfig().getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String dbuser = context.getInitParameter("dbUser");
            String dbpass = context.getInitParameter("dbPass");
            Connection con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            PreparedStatement ps = con.prepareStatement("delete from user where userID=?;");
            ps.setInt(1, id);
            ps.execute();
            request.setAttribute("UpdationMsg", "Deletion Successful!");
            request.getRequestDispatcher(adminPage).forward(request, response);
            
        }
        catch(NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            request.setAttribute("UpdationMsg", "Deletion UnSuccessful!");
            request.getRequestDispatcher(adminPage).forward(request, response);
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            request.setAttribute("UpdationMsg", "Deletion UnSuccessful!");
            request.getRequestDispatcher(adminPage).forward(request, response);
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            request.setAttribute("UpdationMsg", "Deletion UnSuccessful!");
            request.getRequestDispatcher(adminPage).forward(request, response);
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
