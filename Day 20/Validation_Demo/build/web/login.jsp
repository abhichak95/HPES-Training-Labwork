<%-- 
    Document   : index
    Created on : 7 Jul, 2015, 10:58:40 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <s:form action="LoginAction" method="POST">
            <s:textfield name="userid" label="User ID "></s:textfield>
            <s:textfield name="username" label="Username "></s:textfield>
            <s:password name="password" label="Password "></s:password>
            <s:textfield name="email" label="Email ID "></s:textfield>
            <s:submit name="submit" value="Login"></s:submit>
        </s:form>
    </body>
</html>
