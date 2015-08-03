/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.action;

import com.hp.j2sh.project.entity.AllCommunities;
import com.hp.j2sh.project.entity.CommunityUsers;
import com.hp.j2sh.project.util.MyHibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Abhishek
 */
public class JoinCommunity extends ActionSupport implements SessionAware, ServletRequestAware  {
    
    private SessionMap sessionMap;
    private HttpServletRequest request;
    private String communityId;

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
    
    public JoinCommunity() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            Integer community_id = Integer.parseInt(communityId);
            Integer user = (Integer)sessionMap.get("user_id");
            System.out.println("Join :: " + community_id);
            System.out.println("user :: " + user);
            
            Session session = MyHibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            
            CommunityUsers communityUsers = new CommunityUsers(community_id, (Integer)sessionMap.get("user_id"));
            
            session.save(communityUsers);
            transaction.commit();
            
            sessionMap.put("RegisterMessage", "Community successfully joined !!!");
            
            try {
            Query query = session.createQuery("FROM CommunityUsers c WHERE c.userId = :user");
            query.setInteger("user", user);
            System.out.println("query :: " + query.getQueryString());
            List<CommunityUsers> tempList = query.list();
            List<AllCommunities> listUser = new ArrayList<AllCommunities>();
            for (CommunityUsers communityUsers1 : tempList) {
                Criteria criteria2 = session.createCriteria(AllCommunities.class);
                criteria2.add(Restrictions.eq("communityId", communityUsers1.getCommunityId()));
                AllCommunities allCommunities1 = (AllCommunities) criteria2.list().iterator().next();
                listUser.add(allCommunities1);
            }
            sessionMap.put("communityListUser", listUser);

            List<AllCommunities> listAll = new ArrayList<AllCommunities>();
            List<Integer> userIds = new ArrayList<Integer>();
            for (AllCommunities allCommunities1 : listUser) {
                userIds.add(allCommunities1.getCommunityId());
            }
            System.out.println("userIDs :: " + userIds);
            Criteria criteria1 = session.createCriteria(AllCommunities.class);
            List<AllCommunities> tempListAll = criteria1.list();
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
            }
            catch(Exception e) {
                System.out.println("Join :: query :: " + e);
            }
            return SUCCESS;
        }
        finally {
            
        }
//        catch (Exception e) {
//            System.out.println("( JoinCommunity ) Exception :: " + e);
//            sessionMap.put("RegisterMessage", "Community joining unsuccessful !!!");
//            return ERROR;
//        }
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }

    
}
