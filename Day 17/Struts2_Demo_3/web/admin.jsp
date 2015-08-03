<%-- 
    Document   : admin
    Created on : 4 Jul, 2015, 10:14:10 AM
    Author     : Abhishek
--%>

<%@page import="org.apache.taglibs.standard.tag.common.sql.ResultImpl"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Welcome Admin :: <s:property value="#session.user"></s:property></h1>
        
        EL = ${requestScope.rs}<br><br>
        
        
        <%--
        <c:forEach items="${rs.rows}" var="it">
            
        </c:forEach>
        --%>
        
        
        <%--
        <%
            java.sql.ResultSet rs1 = (java.sql.ResultSet) request.getAttribute("rs");
        %>
        
        ET = <%= rs1 %><br>
        
        <c:set var="rs2" value="<%= rs1 %>"></c:set>
        <c:out value="${rs}"></c:out>
        
        <c:forEach items="${rs2.rows}" var="it">
            ${it.userID}
            ${it.username}<br>
        </c:forEach>
        --%>
        
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
            
            <%--
            <c:forEach items="${rs1.rows}" var="it">
                ${it.userID}
            </c:forEach>
            --%>
            
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
