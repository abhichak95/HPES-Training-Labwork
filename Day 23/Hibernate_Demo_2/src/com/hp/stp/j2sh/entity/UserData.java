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
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Abhishek
 */
public class UserData {
    
    private static Configuration configuration = null;
    private static SessionFactory sessionFactory = null;
    
    static {
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }
    
    public void displayData() {
        Session session = sessionFactory.openSession();
        Query q = session.createQuery("from User a");
        List<User> userList = q.list();
        for (User _user : userList) {
            System.out.printf("%2s :: %-12s", "ID", _user.getUserIDInteger());
            System.out.printf(" %8s :: %-12s", "Username", _user.getUsernameString());
            System.out.printf(" %8s :: %-12s", "Password", _user.getPasswordString());
            System.out.printf(" %6s :: %-12s", "Status", _user.getStatusShort());
            System.out.printf(" %9s :: %-12s\n", "User Type", _user.getUserTypeString());
        }
        session.close();
    }
    
    public void deleteData() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("DELETE FROM User u WHERE userID = 1011");
        q.executeUpdate();
        transaction.commit();
        session.close();
        System.out.println("\n\nData Deletion Successful!!!...\n");
    }
    
    public void insertData() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User _user = new User();
        _user.setUsernameString("ABC");
        _user.setPasswordString("123");
        _user.setUserIDInteger(new Integer("1011"));
        _user.setStatusShort(new Short("1"));
        _user.setUserTypeString("other");
        session.save(_user);
        transaction.commit();
        session.close();
        System.out.println("\n\nData Insertion Successful!!!...\n");
    }
    
    public void updateData() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User _user = (User) session.get(User.class, new Integer("1009"));
        _user.setUsernameString(_user.getUsernameString() + " Updated");
        session.update(_user);
        transaction.commit();
        session.close();
        System.out.println("\n\nData Updation Successful!!!...\n");
    }
    
    public static void main(String[] args) {
        UserData userData = new UserData();
        userData.displayData();
        userData.insertData();
        userData.displayData();
        userData.deleteData();
        userData.displayData();
//        userData.updateData();
//        userData.displayData();
    }
}
