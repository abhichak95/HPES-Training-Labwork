/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.action;

import com.hp.j2sh.project.entity.AllCommunities;
import com.hp.j2sh.project.entity.AllUsers;
import com.hp.j2sh.project.entity.CommunityUsers;
import com.hp.j2sh.project.other.CommunityPageData;
import com.hp.j2sh.project.other.Post;
import com.hp.j2sh.project.util.MyHibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class CreatePost extends ActionSupport implements SessionAware {
    
    private String content;
    private SessionMap sessionMap;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public CreatePost() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            
            Integer communityId = (Integer) sessionMap.get("communityId");
            Integer userId = (Integer) sessionMap.get("user_id");
            
            Session session = MyHibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            
            Post p = new Post(content, userId, communityId, new Date(System.currentTimeMillis()));
            
            session.save(p);
            transaction.commit();
            
            AllCommunities community = (AllCommunities) session.createCriteria(AllCommunities.class).add(Restrictions.eq("communityId", communityId)).uniqueResult();
        
            CommunityPageData communityPageData = new CommunityPageData();
            communityPageData.setCommunityName(community.getCommunityName());
            List<AllUsers> userList = new ArrayList<AllUsers>(0);
            List<CommunityUsers> temp = session.createCriteria(CommunityUsers.class).add(Restrictions.eq("communityId", communityId)).list();
            for (CommunityUsers cu : temp) {
                Criteria c = session.createCriteria(AllUsers.class);
                c.add(Restrictions.eq("userId", cu.getUserId()));
                AllUsers e = (AllUsers) c.uniqueResult();
                userList.add(e);
            }
            communityPageData.setAllUsersList(userList);

            Criteria c = session.createCriteria(Post.class);
            c.add(Restrictions.eq("communityId", communityId));
            List<Post> postList = c.list();
            communityPageData.setPostList(postList);
            sessionMap.put("communityPageDataObject", communityPageData);
            
            return SUCCESS;
        }
        catch (Exception e) {
            System.out.println("( CreatePost ) Exception :: " + e);
            return ERROR;
        }
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }
    
}
