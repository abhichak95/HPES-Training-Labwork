<%-- 
    Document   : login
    Created on : 4 Jul, 2015, 10:12:40 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <s:form action="Login" method="post">
            <s:textfield name="username" label="Username" autofocus="true"></s:textfield>
            <s:password name="password" label="Password"></s:password>
            <s:submit name="login" value="Login"></s:submit>
        </s:form>
    </body>
</html>
