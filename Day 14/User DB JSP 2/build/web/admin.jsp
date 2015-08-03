<%-- 
    Document   : admin
    Created on : 30 Jun, 2015, 11:31:32 AM
    Author     : Abhishek
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<jsp:useBean class="com.hp.stp.j2sh.mysql.MySQLConnection" id="mysql" ></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <style type='text/css'>
            table { border-collapse: collapse; }
            table, th, td { border: 2px dashed black; text-align: center; width: 1000px; height: 30px; }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            String UpdationMsg = (String)request.getAttribute("UpdationMsg");
            if (UpdationMsg != null)
                out.println("<h3>" + UpdationMsg + "</h3>");
        %>
        
        <h3>Details of all users are:</h3><br><br>
        
        <%
            String driver = application.getInitParameter("driver");
            String url = application.getInitParameter("url");
            String dbuser = application.getInitParameter("dbUser");
            String dbpass = application.getInitParameter("dbPass");
//            Connection con = mysql.getMySQLConnection(driver, url, dbuser, dbpass);
//            PreparedStatement ps = con.prepareStatement("select * from user;");
//            ResultSet rs = ps.executeQuery();
        %>
        <sql:setDataSource driver="<%=driver%>" url="<%=url%>" password="<%=dbpass%>" user="<%=dbuser%>" scope="session" var="mySQL"></sql:setDataSource>
        
        <sql:query dataSource="${mySQL}" sql="select * from user" var="rs"></sql:query>
        <%
        System.out.println("admin1");
        %>
        <form action="DBUpdate" method="POST">
            <table>
                <tr>
                    <th style="background-color: #e3e3e3"></th>
                    <th style="background-color: #99ffff"><h2>User ID</h2></th>
                    <th style="background-color: #9999ff"><h2>User Name</h2></th>
                    <th style="background-color: #ff9999"><h2>Password</h2></th>
                    <th style="background-color: #ccff99"><h2>Status</h2></th>
                    <th style="background-color: #cccccc"><h2>User Type</h2></th>
                </tr>
                <c:forEach items="${rs.rows}" var="it">
                    <tr>
                        <td style="background-color: #e3e3e3"><input type='radio' name='entryID' value="${it.userID}"></td>
                        <td>${it.userID}</td>
                        <td>${it.username}</td>
                        <td>${it.password}</td>
                        <td>${it.status}</td>
                        <td>${it.userType}</td>
                    </tr>
                </c:forEach>
        <%--
                <% while(rs.next()) {
                    int userid = rs.getInt(1);
                    String user = rs.getString(2);
                    String pass = rs.getString(3);
                    int status = rs.getInt(4);
                    String type = rs.getString(5);
                %>
                <tr>
                    <td style="background-color: #e3e3e3"><input type='radio' name='entryID' value="<%= userid %>"></td>
                    <td><%= userid %></td>
                    <td><%= user %></td>
                    <td><%= pass %></td>
                    <td><%= status %></td>
                    <td><%= type %></td>
                </tr>
                <% } %>
        --%>
            </table><br><br>
            <h3>Database Update Options:</h3>
            <input type='radio' name='option' value='insert'> Insert Entry
            &nbsp;&nbsp;<input type='radio' name='option' value='delete'> Delete Entry
            &nbsp;&nbsp;<input type='radio' name='option' value='update'> Update Entry
            <br><br><input type='submit' value='Submit'>
        </form>
    </body>
</html>
