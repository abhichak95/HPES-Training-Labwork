<%-- 
    Document   : welcome
    Created on : 7 Jul, 2015, 10:59:03 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <s:property value="userid"></s:property><br>
        <s:property value="username" escape="true"></s:property><br>
        <s:property value="password"></s:property><br>
        <s:property value="email"></s:property><br>
    </body>
</html>
