/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import com.hp.stp.j2sh.entity.User;
import com.hp.stp.j2sh.mysql.MySQLConnection;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    private List<User> userList = new ArrayList<User>();
    
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

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
        System.out.println("LoginActionSupport :: login() method start...");
        System.out.println("LoginActionSupport :: username: " + username);
        System.out.println("LoginActionSupport :: password: " + password);
        
        try {
            Connection con = MySQLConnection.getMySQLConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from user where username=? and password=?");
            ps1.setString(1, username);
            ps1.setString(2, password);
            ResultSet rs1 = ps1.executeQuery();
            
            if (rs1.next()) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", rs1.getString(2));
            if (rs1.getString(5).equalsIgnoreCase("admin")) {
                PreparedStatement ps2 = con.prepareStatement("select * from user");
                ResultSet rs2 = ps2.executeQuery();
//                request.setAttribute("rs", rs2);
                while(rs2.next()) {
                    User _user = new User();
                    _user.setUserID(rs2.getInt(1));
                    _user.setUsername(rs2.getString(2));
                    _user.setPassword(rs2.getString(3));
                    _user.setStatus(rs2.getInt(4));
                    _user.setUserType(rs2.getString(5));
                    userList.add(_user);
                }
//                request.setAttribute("userList", list);
                System.out.println("LoginActionSupport :: login() method end...");
                return "admin";
            }
            else {
                rs1.previous();
//                request.setAttribute("rs", rs1);
                while(rs1.next()) {
                    User _user = new User();
                    _user.setUserID(rs1.getInt(1));
                    _user.setUsername(rs1.getString(2));
                    _user.setPassword(rs1.getString(3));
                    _user.setStatus(rs1.getInt(4));
                    _user.setUserType(rs1.getString(5));
                    userList.add(_user);
                }
//                request.setAttribute("userList", list);
                System.out.println("LoginActionSupport :: login() method end...");
                return "user";
            }
            }
            else return "notFound";
        }
        catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }
        System.out.println("LoginActionSupport :: login() method end...");
        return ERROR;
    }

    HttpServletRequest request;

    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }
    
}
