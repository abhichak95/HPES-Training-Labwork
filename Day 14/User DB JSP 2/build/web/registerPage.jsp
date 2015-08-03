<%-- 
    Document   : registerPage
    Created on : 1 Jul, 2015, 11:54:57 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <c:if test="${sessionScope.userType != null}">
            <jsp:include page="header.jsp"></jsp:include>
        </c:if>
        <div style="background-color: #C4C4C4; text-align: center; text-decoration: underline; text-transform: uppercase;">
            <h2>New User Registration</h2><br>
        </div>
        <div style="text-align: center; background-image: -webkit-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -moz-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -o-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: linear-gradient(180deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%);">
            <br>
            <form method='get' action='Register'>
                <h3>:-: Fill-up the following details :-:</h3><br><br><br>
                <label>User ID</label>: <input type='text' name='userid'><br><br>
                <label>Username</label>: <input type='text' name='username'><br><br>
                <label>Password</label>: <input type='password' name='password'><br><br>
                <label>Status</label>: <input type='number' name='status'><br><br>
                <label>User Type</label>: <input type='radio' name='usertype' value='admin'>Admin <input type='radio' name='usertype' value='other' checked='checked'>Other<br><br>
                <input type='submit' value='Submit'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type='reset' value='Reset'>
            </form>
        </div>
        <div style="background-color:#CDCDCD">&copy; Abhishek Chakraborty, 2015</div>
    </body>
</html>
