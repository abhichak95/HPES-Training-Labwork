<%-- 
    Document   : homePage
    Created on : 13 Jul, 2015, 10:04:27 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Voting System Home Page</title>
    </head>
    <body>
    <center>
        <jsp:include page="header.jsp"></jsp:include>
        Select your category : &nbsp;&nbsp;&nbsp;
        <s:a href="loginPage.jsp">Registered User</s:a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <s:a href="registerPage.jsp">New User</s:a>
    </center>
    </body>
</html>
