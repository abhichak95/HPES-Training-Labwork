/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.action;

import com.hp.j2sh.project.entity.AllUsers;
import com.hp.j2sh.project.util.MyHibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Abhishek
 */
public class ProfileData extends ActionSupport implements SessionAware {
    
    private SessionMap sessionMap;
    
    public ProfileData() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            Integer userId = (Integer) sessionMap.get("user_id");
            
            Session session = MyHibernateUtil.getSession();
            
            Criteria c = session.createCriteria(AllUsers.class);
            c.add(Restrictions.eq("userId", userId));
            AllUsers allUsers = (AllUsers) c.uniqueResult();
            
            sessionMap.put("userDataObject", allUsers);
            
            return SUCCESS;
        }
        catch (Exception e) {
            System.out.println("( ProfileData ) Exception :: " + e);
            return ERROR;
        }
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }
    
}
