<%-- 
    Document   : errorPage
    Created on : 13 Jul, 2015, 8:07:11 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Sorry !! An error has occurred !!</h1>
        <%= (String) session.getAttribute("RegisterMessage") %>
    </body>
</html>
