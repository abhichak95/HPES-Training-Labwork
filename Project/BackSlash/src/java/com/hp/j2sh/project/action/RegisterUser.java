/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.action;

import com.hp.j2sh.project.entity.AllCommunities;
import com.hp.j2sh.project.entity.AllUsers;
import com.hp.j2sh.project.entity.CommunityUsers;
import com.hp.j2sh.project.entity.UserEducationalDetails;
import com.hp.j2sh.project.entity.UserOtherDetails;
import com.hp.j2sh.project.entity.UserPersonalDetails;
import com.hp.j2sh.project.entity.UserWorkDetails;
import com.hp.j2sh.project.util.MyHibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Date;
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
public class RegisterUser extends ActionSupport implements SessionAware {
    
    private static final Long yearMillis = new Long("31536000000");
    private static final Long monthMillis = new Long("2678400000");
    private static final Long dayMillis = new Long("86400000");
    
    private SessionMap sessionMap;
    
    //Main Data
    private String username;
    private String password;
    
    //Personal Details
    private String fname;
    private String mname;
    private String lname;
    private String p_email;
    private String s_email;
    private Long p_contact;
    private Long s_contact;
    private Integer day_dob;
    private Integer month_dob;
    private Integer year_dob;
    private String gender;
    
    //Educational Details
    private String cur_institution;
    private String degree;
    private String major;
    private Integer degree_comp;
    
    //Work Details
    private String work_organization;
    private String work_position;
    private Integer work_since;
    
    //Other Details
    private String hometown;
    private String address1;
    private String address2;
    private String address3;
    private String address4;

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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public Long getP_contact() {
        return p_contact;
    }

    public void setP_contact(Long p_contact) {
        this.p_contact = p_contact;
    }

    public Long getS_contact() {
        return s_contact;
    }

    public void setS_contact(Long s_contact) {
        this.s_contact = s_contact;
    }

    public Integer getDay_dob() {
        return day_dob;
    }

    public void setDay_dob(Integer day_dob) {
        this.day_dob = day_dob;
    }

    public Integer getMonth_dob() {
        return month_dob;
    }

    public void setMonth_dob(Integer month_dob) {
        this.month_dob = month_dob;
    }

    public Integer getYear_dob() {
        return year_dob;
    }

    public void setYear_dob(Integer year_dob) {
        this.year_dob = year_dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCur_institution() {
        return cur_institution;
    }

    public void setCur_institution(String cur_institution) {
        this.cur_institution = cur_institution;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getDegree_comp() {
        return degree_comp;
    }

    public void setDegree_comp(Integer degree_comp) {
        this.degree_comp = degree_comp;
    }

    public String getWork_organization() {
        return work_organization;
    }

    public void setWork_organization(String work_organization) {
        this.work_organization = work_organization;
    }

    public String getWork_position() {
        return work_position;
    }

    public void setWork_position(String work_position) {
        this.work_position = work_position;
    }

    public Integer getWork_since() {
        return work_since;
    }

    public void setWork_since(Integer work_since) {
        this.work_since = work_since;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }
    
    public RegisterUser() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            
            if (gender.equalsIgnoreCase("male")) {
                gender = "M";
            } else if (gender.equalsIgnoreCase("female")){
                gender = "F";
            } else {
                gender = "O";
            }
            
            Session session = MyHibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            
            Date dob = new Date(yearMillis*(year_dob - 1970) + monthMillis*(month_dob - 1) + dayMillis*(day_dob));
            AllUsers allUsers = new AllUsers(username, password);
            UserEducationalDetails userEducationalDetails = new UserEducationalDetails(cur_institution, degree, major, degree_comp);
            UserPersonalDetails userPersonalDetails = new UserPersonalDetails(fname, mname, lname, p_email, s_email, p_contact, s_contact, dob, gender);
            UserOtherDetails userOtherDetails = new UserOtherDetails(hometown, address1, address2, address3, address4);
            UserWorkDetails userWorkDetails = new UserWorkDetails(work_organization, work_position, work_since);
            userEducationalDetails.setAllUsers(allUsers);
            userOtherDetails.setAllUsers(allUsers);
            userPersonalDetails.setAllUsers(allUsers);
            userWorkDetails.setAllUsers(allUsers);
            allUsers.setUserEducationalDetails(userEducationalDetails);
            allUsers.setUserOtherDetails(userOtherDetails);
            allUsers.setUserPersonalDetails(userPersonalDetails);
            allUsers.setUserWorkDetails(userWorkDetails);
            
            session.save(allUsers);
            transaction.commit();
            
            sessionMap.put("RegisterMessage", "User Registration Successfull !!!");
            sessionMap.put("user_id", allUsers.getUserId());
            
            Query query = session.createQuery("FROM CommunityUsers c WHERE c.userId = ?");
            query.setParameter(0, sessionMap.get("user_id"));
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
        catch (Exception e) {
            System.out.println("( RegisterUser ) Exception :: " + e);
        }
        sessionMap.put("RegisterMessage", "User Registration Failed !!!");
        return ERROR;
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }
    
}
