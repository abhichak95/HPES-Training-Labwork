/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2eeshf;

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
public class TestServlet implements Servlet {
    ServletConfig config = null;

    public void init(ServletConfig sc) throws ServletException {
        this.config = sc;
    }

    public ServletConfig getServletConfig() {
        return this.config;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><h1>Welcome to My Servlet :: Test Servlet</h1></html>");
        out.close();
    }

    public String getServletInfo() {
        return "Test Servlet";
    }

    public void destroy() {
        
    }
    
}
