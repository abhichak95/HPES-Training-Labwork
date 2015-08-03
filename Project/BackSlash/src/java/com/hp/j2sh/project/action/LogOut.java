/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Abhishek
 */
public class LogOut extends ActionSupport implements SessionAware {
    
    private SessionMap sessionMap;
    
    public LogOut() {
    }
    
    @Override
    public String execute() throws Exception {
        sessionMap.invalidate();
        return SUCCESS;
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }
    
}
