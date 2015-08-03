/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh.actions;

import com.hp.stp.j2sh.mysql.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletContext;

/**
 *
 * @author Abhishek
 */
public class LoginAction {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    public LoginAction() {
    }
    
    public String execute() throws Exception {
        
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user_db_project";
            String dbuser = "root";
            String dbpass = "password";
            Connection con = MySQLConnection.getMySQLConnection(driver, url, dbuser, dbpass);
            PreparedStatement ps = con.prepareStatement("select * from user where username = ? and password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "success";
            }
        }
        catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        
        return "failure";
    }
    
}
