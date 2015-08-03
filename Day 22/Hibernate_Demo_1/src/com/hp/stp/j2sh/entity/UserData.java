/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh.entity;


import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Abhishek
 */
public class UserData {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        //Our connection to DB
        Session session = sessionFactory.openSession();
        
//        Display all data
//        
//        Query q = session.createQuery("select a from User a");
//        List<User> userList = q.list();
//        for (User user : userList) {
//            System.out.println("\n\nID :: " + user.getUserIDInteger());
//            System.out.println("Username :: " + user.getUsernameString());
//            System.out.println("Password :: " + user.getPasswordString());
//            System.out.println("Status :: " + user.getStatusShort());
//            System.out.println("User Type :: " + user.getUserTypeString());
//        }
        
        
//        Display single data
//        
//        Query q = session.createQuery("select a.userIDInteger from User a");
//        List<Integer> userList = q.list();
//        for (Integer user : userList) {
//            System.out.println("ID :: " + user);
//        }
        
        
//        Display tuple of data
//        
        Query q = session.createQuery("select a.userIDInteger, a.usernameString from User a");
        Iterator it = q.list().iterator();
        System.out.println("Query :: " + q);
        while (it.hasNext()) {
            Object[] next = (Object[]) it.next();
            System.out.println("\n\nID :: " + (Integer) next[0]);
            System.out.println("Username :: " + (String) next[1]);
        }
        
        session.close();
    }
}
