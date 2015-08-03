<%-- 
    Document   : welcome
    Created on : 6 Jul, 2015, 10:01:13 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Upload Success Page</title>
    </head>
    <body>
        <h1>File Upload Success!</h1>
        <img src="<s:property value="destFileLocation"></s:property>"
             alt="<s:property value="myFileFileName"></s:property>">
    </body>
</html>
