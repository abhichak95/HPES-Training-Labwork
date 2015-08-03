/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import com.hp.stp.j2sh.mysql.MySQLConnection;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Abhishek
 */
public class LoginActionSupport extends ActionSupport implements ServletRequestAware {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    public LoginActionSupport() {
    }
    
    public String login() {
        try {
            Connection con = MySQLConnection.getMySQLConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from user where username=? and password=?");
            ps1.setString(1, username);
            ps1.setString(2, password);
            ResultSet rs1 = ps1.executeQuery();
            rs1.next();
            
            HttpSession session = request.getSession(true);
            session.setAttribute("user", rs1.getString(2));
            if (rs1.getString(5).equalsIgnoreCase("admin")) {
                PreparedStatement ps2 = con.prepareStatement("select * from user");
                ResultSet rs2 = ps2.executeQuery();
                request.setAttribute("rs", rs2);
                return "admin";
            }
            else {
                rs1.previous();
                request.setAttribute("rs", rs1);
                return "user";
            }
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e);
        }
        return ERROR;
    }

    HttpServletRequest request;

    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }
    
}
