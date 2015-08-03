<%-- 
    Document   : loginPage
    Created on : 13 Jul, 2015, 10:10:03 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Online Voting System</title>
    </head>
    <body>
    <center>
        <jsp:include page="header.jsp"></jsp:include>
        <form action="Login" method="POST" >
            <%
                String msgUser = (String) session.getAttribute("msgUser");
                String msgPass = (String) session.getAttribute("msgPass");
                if (msgUser != null) out.println(msgUser);
            %>
            E-Mail ID (or Contact No.): <input name="username" type="text" autofocus><br>
            <%
                if (msgPass != null) out.println(msgPass);
            %>
            Password :<input name="password" type="text"><br>
            <input type="submit" value="Login">
        </form>
    </center>
    </body>
</html>
