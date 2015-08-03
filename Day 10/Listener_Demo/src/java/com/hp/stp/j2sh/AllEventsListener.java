/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Abhishek
 */
public class AllEventsListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("IN ServletContextInitialized : " + sce.toString());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("IN ServletContextDestroyed : " + sce.toString());
    }

    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("IN ServletContextAttributeAdded : " + event.getName());
    }

    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("IN ServletContextAttributeRemoved : " + event.getName());
    }

    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("IN ServletContextAttributeReplaced : " + arg0.getName());
    }

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("IN HttpSessionCreated : " + se.toString());
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("IN HttpSessionDestroyed : " + se.toString());
    }

    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("IN HttpSessionAttributeAdded : " + event.toString());
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("IN HttpSessionAttributeRemoved : " + event.toString());
    }

    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("IN HttpSessionAttributeReplaced : " + event.toString());
    }

    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("IN ServletRequestDestroyed : " + sre.toString());
    }

    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("IN ServletRequestInitialized : " + sre.toString());
    }

    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("IN ServletRequestAttributeAdded : " + srae.toString());
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("IN ServletRequestAttributeRemoved : " + srae.toString());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("IN ServletRequestAttributeReplaced : " + srae.toString());
    }
}
