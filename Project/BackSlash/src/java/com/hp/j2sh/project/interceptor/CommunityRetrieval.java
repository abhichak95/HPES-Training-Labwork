/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.interceptor;

import com.hp.j2sh.project.entity.AllCommunities;
import com.hp.j2sh.project.entity.CommunityUsers;
import com.hp.j2sh.project.util.MyHibernateUtil;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.List;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Abhishek
 */
public class CommunityRetrieval implements Interceptor, SessionAware {
    
    private SessionMap sessionMap;
    
    public CommunityRetrieval() {
    }
    
    public void destroy() {
        
    }
    
    public void init() {
        
    }
    
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Session session = MyHibernateUtil.getSession();
        
        Query query = session.createQuery("FROM CommunityUsers c WHERE c.userId = :user_id");
        query.setInteger("user_id", (Integer)sessionMap.get("user_id"));
        List<CommunityUsers> tempList = query.list();
        List<AllCommunities> listUser = null;
        for (CommunityUsers communityUsers : tempList) {
            Criteria criteria2 = session.createCriteria(AllCommunities.class);
            criteria2.add(Restrictions.eq("communityId", communityUsers.getCommunityId()));
            AllCommunities allCommunities = (AllCommunities) criteria2.uniqueResult();
            listUser.add(allCommunities);
        }
        sessionMap.put("communityListUser", listUser);
        
        List<AllCommunities> listAll = null;
        List<Integer> userIds = null;
        for (AllCommunities allCommunities : listUser) {
            userIds.add(allCommunities.getCommunityId());
        }
        Criteria criteria1 = session.createCriteria(AllCommunities.class);
        List<AllCommunities> tempListAll = criteria1.list();
        for (AllCommunities ac : tempListAll) {
            boolean found = false;
            for (Integer i : userIds) {
                if (ac.getCommunityId() == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                listAll.add(ac);
            }
        }
        sessionMap.put("communityListAll", listAll);
                
        
        actionInvocation.invoke();
        
        return "";
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }

    
}
