/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.test;

import com.hp.j2sh.project.entity.AllCommunities;
import com.hp.j2sh.project.entity.AllUsers;
import com.hp.j2sh.project.entity.UserEducationalDetails;
import com.hp.j2sh.project.entity.UserOtherDetails;
import com.hp.j2sh.project.entity.UserPersonalDetails;
import com.hp.j2sh.project.entity.UserWorkDetails;
import com.hp.j2sh.project.util.MyHibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Abhishek
 */
public class TestClass1 {
    public static void main(String[] args) {
        try {
            Session session = MyHibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            
            AllUsers allUsers = new AllUsers("abhichak", "codechef");
            UserEducationalDetails userEducationalDetails = new UserEducationalDetails("Galgotia", "B.Tech", "CSE", 2016);
            UserPersonalDetails userPersonalDetails = new UserPersonalDetails("Abhishek", "", "Chakraborty", "abhishekchak93@gmail.com", "eofsentinel@outlook.com", new Long("9958345723"), new Long("9415252396"), new Date(new Long(791164800000L)), "M");
            UserWorkDetails userWorkDetails = new UserWorkDetails("Hewlett-Packard", "Back-end developer", 2012);
            UserOtherDetails userOtherDetails = new UserOtherDetails("Varanasi", "Surya Vijay Garh, Flat No. 506", "Ravindrapuri Colony", "Varanasi", "Uttar Pradesh");
            userEducationalDetails.setAllUsers(allUsers);
            userOtherDetails.setAllUsers(allUsers);
            userPersonalDetails.setAllUsers(allUsers);
            userWorkDetails.setAllUsers(allUsers);
            allUsers.setUserEducationalDetails(userEducationalDetails);
            allUsers.setUserOtherDetails(userOtherDetails);
            allUsers.setUserPersonalDetails(userPersonalDetails);
            allUsers.setUserWorkDetails(userWorkDetails);
            
            AllCommunities allCommunities1 = new AllCommunities("HPES", allUsers.getUserId());
            allCommunities1.setAllUsers(allUsers);
            allUsers.getAllCommunities().add(allCommunities1);
            
            AllCommunities allCommunities2 = new AllCommunities("GCET", allUsers.getUserId());
            allCommunities2.setAllUsers(allUsers);
            allUsers.getAllCommunities().add(allCommunities2);
            
            session.save(allUsers);
            session.save(allCommunities1);
            session.save(allCommunities2);
            transaction.commit();
            
            session.close();
            
        }
        catch (Exception e) {
            System.out.println("( TestClass1 ) Exception :: " + e);
        }
    }
}
