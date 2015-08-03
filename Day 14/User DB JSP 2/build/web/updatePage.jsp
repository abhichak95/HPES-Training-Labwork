<%-- 
    Document   : updatePage
    Created on : 1 Jul, 2015, 11:54:17 PM
    Author     : Abhishek
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page import="org.omg.PortableInterceptor.SYSTEM_EXCEPTION"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            String homepage = (String) config.getInitParameter("homepage");
            
            String driver = application.getInitParameter("driver");
            String url = application.getInitParameter("url");
            String dbuser = application.getInitParameter("dbUser");
            String dbpass = application.getInitParameter("dbPass");
            
            System.out.println(driver);
            System.out.println(url);
            System.out.println(dbuser);
            System.out.println(dbpass);
            
            int id = Integer.parseInt(session.getAttribute("id").toString());
            System.out.println("updatePage.jsp :: " + id);
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
        
        <center>
            <div style="background-color: #C4C4C4; text-align: center; text-decoration: underline; text-transform: uppercase; font-size: 26px; font-weight: bold;">
                User Data Updation<br><br>
            </div>
            <div style="text-align: center; background-image: -webkit-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -moz-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -o-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: linear-gradient(180deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%);">
                <br>
                <form method='get' action='Update'>
                    <h3>:-: Update the following details :-:</h3><br><br><br>
                    <c:forEach items="${rs.rows}" var="it">
                        <label>User ID</label>: <input type='text' value="${it.userID}" disabled><br><br>
                        <input type='hidden' name='userid' value="${it.userID}">
                        <label>Username</label>: <input type='text' name='username' value="${it.username}"><br><br>
                        <label>Password</label>: <input type='password' name='password' value="${it.password}"><br><br>
                        <label>Status</label>: <input type='number' name='status' value="${it.status}"><br><br>
                        <label>User Type</label>: 
                        <c:choose>
                            <c:when test="${it.userType == 'admin'}">
                                <input type='radio' name='usertype' value='admin'  checked='checked'>Admin <input type='radio' name='usertype' value='other'>Other<br><br>
                            </c:when>
                            <c:otherwise>
                                <input type='radio' name='usertype' value='admin'>Admin <input type='radio' name='usertype' value='other' checked='checked'>Other<br><br>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <input type='submit' value='Submit'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type='reset' value='Reset'>
                </form>
            </div>
        </center>
        <div style="background-color:#CDCDCD">&copy; Abhishek Chakraborty, 2015</div>
    </body>
</html>
