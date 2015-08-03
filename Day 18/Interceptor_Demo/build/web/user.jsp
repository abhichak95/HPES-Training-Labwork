<%-- 
    Document   : user
    Created on : 4 Jul, 2015, 10:14:44 AM
    Author     : Abhishek
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <h1>Welcome User :: <s:property value="#session.user"></s:property></h1>
        
        <table>
            <tr>
                <th>UserID</th>
                <th>Username</th>
                <th>Password</th>
                <th>Status</th>
                <th>UserType</th>
            </tr>
        <s:iterator value="userList">
            <tr>
                <td><s:property value="userID"></s:property></td>
                <td><s:property value="username"></s:property></td>
                <td><s:property value="password"></s:property></td>
                <td><s:property value="status"></s:property></td>
                <td><s:property value="userType"></s:property></td>
            </tr>
        </s:iterator>
        </table>
    </body>
</html>
