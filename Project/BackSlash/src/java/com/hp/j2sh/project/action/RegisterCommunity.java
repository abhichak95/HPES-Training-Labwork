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
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Abhishek
 */
public class RegisterCommunity extends ActionSupport implements SessionAware{
    
    private String community_name;
    private SessionMap sessionMap;

    public String getCommunity_name() {
        return community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }
    
    public RegisterCommunity() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            Integer user_id = (Integer)sessionMap.get("user_id");
            Session session = MyHibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            
            Query query = session.createQuery("FROM AllUsers a WHERE a.userId = :userID");
            query.setInteger("userID", user_id);
            AllUsers allUsers = (AllUsers) query.uniqueResult();
            
            AllCommunities allCommunities = new AllCommunities(community_name, user_id);
            allCommunities.setAllUsers(allUsers);
            allUsers.getAllCommunities().add(allCommunities);
            
            session.save(allCommunities);
            session.save(allUsers);
            transaction.commit();
            
            sessionMap.put("RegisterMessage", "Community Creation Successful !!!");
            
            query = session.createQuery("FROM CommunityUsers c WHERE c.userId = ?");
            query.setInteger(0, (Integer)sessionMap.get("user_id"));
            System.out.println("query :: " + query.getQueryString());
            List<CommunityUsers> tempList = query.list();
            List<AllCommunities> listUser = new ArrayList<AllCommunities>();
            for (CommunityUsers communityUsers1 : tempList) {
                Criteria criteria2 = session.createCriteria(AllCommunities.class);
                criteria2.add(Restrictions.eq("communityId", communityUsers1.getCommunityId()));
                AllCommunities allCommunities1 = (AllCommunities) criteria2.uniqueResult();
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
            return SUCCESS;
        }
        catch (Exception e) {
            System.out.println("( RegisterCommunity ) Exception :: " + e);
        }
        sessionMap.put("RegisterMessage", "Community Creation Failed !!!");
        return ERROR;
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }
    
}
