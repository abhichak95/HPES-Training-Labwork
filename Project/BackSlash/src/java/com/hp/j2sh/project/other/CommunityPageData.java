/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.other;

import com.hp.j2sh.project.entity.AllUsers;
import java.util.List;

/**
 *
 * @author Abhishek
 */
public class CommunityPageData {
    private String communityName;
    private List<AllUsers> allUsersList;
    private List<Post> postList;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public List<AllUsers> getAllUsersList() {
        return allUsersList;
    }

    public void setAllUsersList(List<AllUsers> allUsersList) {
        this.allUsersList = allUsersList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
    
}
