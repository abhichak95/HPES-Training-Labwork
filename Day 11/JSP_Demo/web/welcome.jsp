<%-- 
    Document   : Welcome
    Created on : 26 Jun, 2015, 10:00:02 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
    <center>
        <h1>Welcome to User DB Project</h1>
        <form action="Authenticate" method="POST"><br>
            <br><label>Username : </label><input type="text" name="username" placeholder="Enter username here"><br>
            <br><br><label>Password : </label><input type="password" name="password" placeholder="Enter password here">
            <br><br><input type="submit" value="Sign In">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Clear">
        </form>
    </center>
    </body>
</html>
