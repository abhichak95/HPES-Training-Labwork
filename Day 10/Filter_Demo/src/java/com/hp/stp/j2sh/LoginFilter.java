/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Abhishek
 */
public class LoginFilter implements Filter {
    private FilterConfig filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("IN LoginFilter INIT");
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("IN LoginFilter doFilter");
        String usernameString = request.getParameter("username").toUpperCase();
        System.out.println("IN LoginFilter :: Username : " + usernameString);
        chain.doFilter(request, response);
    }

    public void destroy() {
        System.out.println("IN LoginFilter Destroy");
    }
    
        
}
