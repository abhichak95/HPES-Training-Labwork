<%-- 
    Document   : user2
    Created on : 5 Jul, 2015, 8:01:14 AM
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
        <h2>abc Namespace</h2>
        <table>
            <tr>
                <th>User ID</th>
                <th>User Name</th>
                <th>Password</th>
                <th>Status</th>
                <th>User Type</th>
            </tr>
            <%
                ResultSet rs1 = (ResultSet) request.getAttribute("rs");
                while(rs1.next()) {
            %>
            <tr>
                <td><%= rs1.getInt(1) %></td>
                <td><%= rs1.getString(2) %></td>
                <td><%= rs1.getString(3) %></td>
                <td><%= rs1.getInt(4) %></td>
                <td><%= rs1.getString(5) %></td>
            </tr>
            <%
                }
            %>
        </table>
        
    </body>
</html>
