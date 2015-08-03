/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Abhishek
 */
public class Welcome implements Servlet {
    private ServletConfig config = null;

    public void init(ServletConfig config) throws ServletException {
        System.out.println("IN init method");
        this.config = config;
    }

    public ServletConfig getServletConfig() {
        System.out.println("IN getServletConfig metohod");
        return config;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("IN service method");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String msgUser = (String) req.getAttribute("msgUser");
        String msgPass = (String) req.getAttribute("msgPass");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='utf-8'>");
        out.println("<title>Welcome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1><center>Welcome to User DB Project</center></h1>");
        out.println("<br><br>");
        out.println("<center>");
        out.println("<form action='Login' method='POST'><br>");
        if (msgUser != null) out.println(msgUser);
        out.println("<br>UserName : <input name='username' type='input' width='50' autofocus> <br><br>");
        if (msgPass != null) out.println(msgPass);
        out.println("<br>Password : <input name='password' type='password' width='50'> <br><br>");
        out.println("<a href='Register'>New User?</a><br><br>");
        out.println("<input type='submit' value='Submit'>&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("<input type='reset' value='Reset'>");
        out.println("</form>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public String getServletInfo() {
        System.out.println("IN getServletInfo method");
        return "Welcome Servlet";
    }

    public void destroy() {
        System.out.println("IN destroy method");
    }
    
}
