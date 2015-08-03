<%-- 
    Document   : other
    Created on : 30 Jun, 2015, 11:31:38 AM
    Author     : Abhishek
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            String driver = application.getInitParameter("driver");
            String url = application.getInitParameter("url");
            String dbuser = application.getInitParameter("dbUser");
            String dbpass = application.getInitParameter("dbPass");
            int id = Integer.parseInt(session.getAttribute("userID").toString());
        %>
        <sql:setDataSource driver="<%=driver%>"
                           url="<%=url%>"
                           user="<%=dbuser%>"
                           password="<%=dbpass%>"
                           var="mySQL"></sql:setDataSource>
        
        <sql:query dataSource="${mySQL}"
                   sql="select * from user where userID=?"
                   var="rs">
            <sql:param value="<%=id%>"></sql:param>
        </sql:query>
        
        <h2>Your account details are: </h2><br>
        <table>
        <c:forEach items="${rs.rows}" var="it">
            <tr><td><b>User ID: </b></td> <td><c:out value="${it.userID}"></c:out></td></tr>
            <tr><td><b>User Name: </b></td> <td><c:out value="${it.username}"></c:out></td></tr>
            <tr><td><b>Password: </b></td> <td><c:out value="${it.password}"></c:out></td></tr>
            <tr><td><b>Status: </b></td> <td><c:out value="${it.status}"></c:out></td></tr>
            <tr><td><b>User Type: </b></td> <td><c:out value="${it.usertype}"></c:out></td></tr>
        </c:forEach>
        </table>
        <br><br>
        <%
            session.setAttribute("id", id);
        %>
        <a href="UserPageUpdate">Update Details</a>
    </body>
</html>
