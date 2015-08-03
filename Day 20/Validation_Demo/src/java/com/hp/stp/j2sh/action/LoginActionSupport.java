/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Abhishek
 */
public class LoginActionSupport extends ActionSupport {
    
    private String username;
    private String password;
    private String email;
    private int userid;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    
    public LoginActionSupport() {
    }
    
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
