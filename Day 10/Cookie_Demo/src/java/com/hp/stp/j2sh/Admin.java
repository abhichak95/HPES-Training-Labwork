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
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class Admin extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Admin</title>");
            out.println("<style type='text/css'>"
                    + "table {"
                    + "border-collapse: collapse;"
                    + "}"
                    + "table, th, td {"
                    + "border: 2px dashed black;"
                    + "text-align: center;"
                    + "width: 1000px;"
                    + "height: 30px;"
                    + "}"
                    + "</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center><h1>ADMIN Page</h1></center>");
            String UpdationMsg = (String)request.getAttribute("UpdationMsg");
            if (UpdationMsg != null)
                out.println("<h3>" + UpdationMsg + "</h3><br>");
            
            //Cookie reading
            try {
                Cookie[] cookies = request.getCookies();
                for (Cookie ck : cookies) {
                    //System.out.println("ck: " + ck.getName());
                    if ("AdminCookie".equalsIgnoreCase(ck.getName())) {
                        out.println("AdminCookie Counter : " + ck.getValue());
                        Integer value = Integer.parseInt(ck.getValue());
                        value++;
                        ck.setValue(value.toString());
                        response.addCookie(ck);
                        break;
                    }
                }
            }
            catch(Exception e) {
                System.out.println(e + " : " + e.getMessage());
            }
            
            out.println("<h3>Details of all users are:</h3><br><br>");
            
            ServletContext context = getServletConfig().getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String dbuser = context.getInitParameter("dbUser");
            String dbpass = context.getInitParameter("dbPass");
            con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            PreparedStatement ps = con.prepareStatement("select * from user;");
            ResultSet rs = ps.executeQuery();
            
            out.println("<form action='DBUpdate' method='POST'>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td></td>");
            out.println("<td><h2>User ID</h2></td>");
            out.println("<td><h2>User Name</h2></td>");
            out.println("<td><h2>Password</h2></td>");
            out.println("<td><h2>Status</h2></td>");
            out.println("<td><h2>User Type</h2></td>");
            out.println("</tr>");
            while(rs.next()) {
                int userid = rs.getInt(1);
                String user = rs.getString(2);
                String pass = rs.getString(3);
                int status = rs.getInt(4);
                String type = rs.getString(5);
                out.println("<tr>");
                out.println("<td><input type='radio' name='entryID' value='" + userid + "'></td>");
                out.println("<td>" + userid + "</td>");
                out.println("<td>" + user + "</td>");
                out.println("<td>" + pass + "</td>");
                out.println("<td>" + status + "</td>");
                out.println("<td>" + type + "</td>");
                out.println("</tr>");
            }
            out.println("</table><br><br>");
            
            out.println("<h3>Database Update Options:</h3>");
            out.println("<input type='radio' name='option' value='insert'> Insert Entry");
            out.println("<br><input type='radio' name='option' value='delete'> Delete Entry");
            out.println("<br><input type='radio' name='option' value='update'> Update Entry");
            out.println("<br><br><input type='submit' value='Submit'>");
            out.println("</form>");
            
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Exception1: " + e.getMessage());
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
