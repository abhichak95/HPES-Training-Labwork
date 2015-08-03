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
public class MyInterceptor1 implements Interceptor {
    
    public MyInterceptor1() {
    }
    
    public void destroy() {
        
    }
    
    public void init() {
        
    }
    
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext actionContext = actionInvocation.getInvocationContext();
        ValueStack valueStack = actionContext.getValueStack();
        String user = valueStack.findString("username");
        System.out.println("MyInterceptor1 :: username: " + user);
        valueStack.setValue("username", user.toUpperCase());
        System.out.println("MyInterceptor1 :: modified username: " + valueStack.findString("username"));
        System.out.println("MyInterceptor1 :: PreProcessing done...");
        actionInvocation.invoke();
        System.out.println("MyInterceptor1 :: PostProcessing done...");
        System.out.println("MyInterceptor1 :: intercept() method complete...");
        return "";
    }
    
}
