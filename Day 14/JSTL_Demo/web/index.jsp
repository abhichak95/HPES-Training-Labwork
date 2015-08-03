<%-- 
    Document   : index
    Created on : 1 Jul, 2015, 9:49:18 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Demo</title>
    </head>
    <body>
        <sql:setDataSource driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/user_db_project" 
                           user="root" 
                           password="password" 
                           scope="session" 
                           var="userSQL"></sql:setDataSource>
        
        <%-- For all users --%>
        <sql:query dataSource="${userSQL}" var="rs">
            select * from user
        </sql:query>
            
                        
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Password</th>
                <th>Status</th>
                <th>User Type</th>
            </tr>
            <c:if test="${param.start != null}">
            <c:forEach items="${rs.rows}" var="it" begin="${param.start}" end="${param.end}">
            <tr>
                <td>${it.userId}</td>
                <td>${it.username}</td>
                <td>${it.password}</td>
                <td>${it.status}</td>
                <td>${it.userType}</td>
            </tr>
            </c:forEach>
            </c:if>
        </table>
        <br><br>
        <a href="index.jsp?start=0&&end=2">1</a>
        <a href="index.jsp?start=2&&end=4">2</a>
        <a href="index.jsp?start=4&&end=6">3</a>
        <a href="index.jsp?start=6&&end=8">4</a>
        <br><br>
        
        <%-- For individual user --%>
        ${param.username}
        ${param.password}
        <sql:query dataSource="${userSQL}" 
                   var="rs1" 
                   sql="select * from user where username=? and password=?">
            <sql:param value="${param.username}"></sql:param>
            <sql:param value="${param.password}"></sql:param>
        </sql:query>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Status</th>
                    <th>User Type</th>
                </tr>
            <c:forEach items="${rs1.rows}" var="it1">
                <tr>
                    <td>${it1.userId}</td>
                    <td>${it1.username}</td>
                    <td>${it1.password}</td>
                    <td>${it1.status}</td>
                    <td>${it1.userType}</td>
                </tr>
            </c:forEach>
            </table>
    </body>
</html>
