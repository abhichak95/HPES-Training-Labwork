/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

/**
 *
 * @author Abhishek
 */
public class MyInterceptor2 implements Interceptor {
    
    public MyInterceptor2() {
    }
    
    public void destroy() {
        
    }
    
    public void init() {
        
    }
    
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext actionContext = actionInvocation.getInvocationContext();
        ValueStack valueStack = actionContext.getValueStack();
        String user = valueStack.findString("password");
        System.out.println("MyInterceptor2 :: password: " + user);
        valueStack.setValue("password", user.toLowerCase());
        System.out.println("MyInterceptor2 :: modified password: " + valueStack.findString("password"));
        System.out.println("MyInterceptor2 :: PreProcessing done...");
        actionInvocation.invoke();
        System.out.println("MyInterceptor2 :: PostProcessing done...");
        System.out.println("MyInterceptor2 :: intercept() method complete...");
        return "";
    }
    
}
