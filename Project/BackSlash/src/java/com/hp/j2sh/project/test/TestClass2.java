/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.test;

import com.hp.j2sh.project.other.Post;
import com.hp.j2sh.project.util.MyHibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Abhishek
 */
public class TestClass2 {
    public static void main(String[] args) {
        Session session = MyHibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        
        Post p1 = new Post("Hello everyone !", 1, 11, new Date(System.currentTimeMillis()));
        Post p2 = new Post("Welcome here !", 2, 11, new Date(System.currentTimeMillis()));
        
        session.save(p1);
        session.save(p2);
        t.commit();
    }
}
