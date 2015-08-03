<%-- 
    Document   : loginPage
    Created on : 13 Jul, 2015, 10:10:03 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Online Voting System</title>
    </head>
    <body>
    <center>
        <jsp:include page="header.jsp"></jsp:include>
        <s:form action="Login" method="POST" >
            <%
                String msgUser = (String) session.getAttribute("msgUser");
                String msgPass = (String) session.getAttribute("msgPass");
                if (msgUser != null) out.println(msgUser);
            %>
            <s:textfield name="username" label="E-Mail ID (or Contact No.)" autofocus="true"></s:textfield>
            <%
                if (msgPass != null) out.println(msgPass);
            %>
            <s:password name="password" label="Password"></s:password>
            <s:submit name="login" value="Login"></s:submit>
        </s:form>
    </center>
    </body>
</html>
