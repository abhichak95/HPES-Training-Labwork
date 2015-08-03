/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.action;

import com.hp.j2sh.project.entity.AllCommunities;
import com.hp.j2sh.project.entity.AllUsers;
import com.hp.j2sh.project.entity.CommunityUsers;
import com.hp.j2sh.project.util.MyHibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Abhishek
 */
public class AuthenticateLogin extends ActionSupport implements SessionAware {
    
    private String username;
    private String password;
    private SessionMap sessionMap;

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
    
    public AuthenticateLogin() {
    }
    
    @Override
    public String execute() throws Exception {
        Session session = MyHibernateUtil.getSession();
        Criteria criteria = session.createCriteria(AllUsers.class);
        Criterion usernameCriterion = Restrictions.eq("username", username);
        Criterion passwordCriterion = Restrictions.eq("password", password);
        criteria.add(Restrictions.and(usernameCriterion, passwordCriterion));
        AllUsers user = (AllUsers) criteria.uniqueResult();
        if (user != null) {
            System.out.println("user_id : " + user.getUserId());
            sessionMap.put("user_id", user.getUserId());
            System.out.println("user_id : " + (Integer)sessionMap.get("user_id"));
            
            Query query = session.createQuery("FROM CommunityUsers c WHERE c.userId = ?");
            query.setParameter(0, user.getUserId());
            System.out.println("query :: " + query.getQueryString());
            List<CommunityUsers> tempList = query.list();
            List<AllCommunities> listUser = new ArrayList<AllCommunities>();
            for (CommunityUsers communityUsers : tempList) {
                Criteria criteria2 = session.createCriteria(AllCommunities.class);
                criteria2.add(Restrictions.eq("communityId", communityUsers.getCommunityId()));
                AllCommunities allCommunities = (AllCommunities) criteria2.uniqueResult();
                listUser.add(allCommunities);
            }
            sessionMap.put("communityListUser", listUser);

            List<AllCommunities> listAll = new ArrayList<AllCommunities>();
            List<Integer> userIds = new ArrayList<Integer>();
            for (AllCommunities allCommunities : listUser) {
                userIds.add(allCommunities.getCommunityId());
            }
            System.out.println("userIDs :: " + userIds);
            Criteria criteria1 = session.createCriteria(AllCommunities.class);
            ArrayList<AllCommunities> tempListAll = (ArrayList<AllCommunities>)criteria1.list();
            for (AllCommunities ac : tempListAll) {
                boolean found = false;
                for (Integer i : userIds) {
                    if (ac.getCommunityId().equals(i)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    listAll.add(ac);
                }
            }
            sessionMap.put("communityListAll", listAll);
            return SUCCESS;
        }
        else {
            sessionMap.put("loginErrorMessage", "Invalid username and/or password!");
            return INPUT;
        }
    }    

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }
}
