/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh.entity;

/**
 *
 * @author Abhishek
 */
public class User {
    private Integer userIDInteger;
    private String usernameString;
    private String passwordString;
    private Short statusShort;
    private String userTypeString;

    public Integer getUserIDInteger() {
        return userIDInteger;
    }

    public void setUserIDInteger(Integer userIDInteger) {
        this.userIDInteger = userIDInteger;
    }

    public String getUsernameString() {
        return usernameString;
    }

    public void setUsernameString(String usernameString) {
        this.usernameString = usernameString;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public void setPasswordString(String passwordString) {
        this.passwordString = passwordString;
    }

    public Short getStatusShort() {
        return statusShort;
    }

    public void setStatusShort(Short statusShort) {
        this.statusShort = statusShort;
    }

    public String getUserTypeString() {
        return userTypeString;
    }

    public void setUserTypeString(String userTypeString) {
        this.userTypeString = userTypeString;
    }
    
}
