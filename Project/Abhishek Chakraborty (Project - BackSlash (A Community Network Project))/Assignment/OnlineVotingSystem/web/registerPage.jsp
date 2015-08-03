<%-- 
    Document   : registerPage
    Created on : 13 Jul, 2015, 10:10:25 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register - Online Voting System</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
    <center>
        <h2>New Voter Registration</h2><br><br>
    <form action="RegisterVoter" method="POST">
        Name :<input type="text" name="name"><br>
        Age :<input name="age" type="text"><br>
        Gender :<input name="gender" type="text"><br>
        DOB :<input name="dob" type="text"><br>
        EMail ID :<input name="email_id" type="text"><br>
        Password :<input name="password" type="text"><br>
        <input type="submit" value="Submit"><br>
    <form>
    </center>
    </body>
</html>
