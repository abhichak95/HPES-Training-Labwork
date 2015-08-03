/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.action;

import com.hp.j2sh.entity.Voter;
import com.hp.j2sh.mysql.MYSQLConnection;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Abhishek
 */
public class Authenticate extends ActionSupport implements ServletRequestAware {
    
    private String username;
    private String password;
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/assignment";
    private static final String USER = "root";
    private static final String PASS = "password";

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
    
    public Authenticate() {
    }
    
    public String execute() throws Exception {
        return "";
    }
    
    public String check() {
        try {
            HttpSession session = request.getSession(true);
            Connection con = MYSQLConnection.getMySQLConnection(JDBC_DRIVER, DB_URL, USER, PASS);
            PreparedStatement ps1 = con.prepareStatement("select * from voter where email_id=? and password=?");
            ps1.setString(1, username);
            ps1.setString(2, password);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()) {
                System.out.println("Authenticated");
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
                return SUCCESS;
            }
            else {
                String sql1 = "select * from voter where email_id=?";
                PreparedStatement ps2 = con.prepareStatement(sql1);
                ps2.setString(1, username);
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) session.setAttribute("msgPass", "Invalid Password!");
                else session.setAttribute("msgUser", "Invalid Username!");
                return INPUT;
            }
        }
        catch(Exception e) {
            System.out.println("Exception :: " + e);
        }
        return ERROR;
    }

    private HttpServletRequest request;
    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }
    
}
