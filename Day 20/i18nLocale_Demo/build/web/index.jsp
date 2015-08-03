<%-- 
    Document   : index
    Created on : 7 Jul, 2015, 9:47:52 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Google HomePage</title>
    </head>
    <body>
    <center style="margin-top: 150px;">
        <s:form action="LoginAction" method="POST" theme="simple">
            <img src="images/googleLogo.png" alt="Google Logo" style="margin-bottom: 50px;"><br>
            <s:text name="label.search"></s:text> : 
            <s:textfield key="label.textfieldPlaceholder"></s:textfield><br><br><br>
            <s:submit key="label.searchButton"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <s:submit key="label.luckyButton"></s:submit>
        </s:form>
    </center>
    <center>
        <div style="margin-top: 50px;">
            google.co.in&nbsp;&nbsp;
            <s:a href="locale?request_locale=en">English</s:a>
            <s:a href="locale?request_locale=hi">Hindi</s:a>
            <s:a href="locale?request_locale=be">Bengali</s:a>
            <s:a href="locale?request_locale=ta">Tamil</s:a>
            <s:a href="locale?request_locale=ur">Urdu</s:a>
        </div>
    </center>
    </body>
</html>
