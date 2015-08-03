<%-- 
    Document   : createCommunityPage
    Created on : 14 Jul, 2015, 10:17:37 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Community Page</title>
    </head>
    <body>
        <%
            try {
                Integer user = (Integer)session.getAttribute("user_id");
                if (user.equals(null) || user == null) response.sendRedirect("Logout");
            }
            catch (Exception e) {
                response.sendRedirect("Logout");
            }
        %>
        <h3 style="text-align: right;"><a href="Logout">LogOut</a></h3>
        <h1>Create community page</h1>
        <form action="CreateCommunity" method="POST" >
            Community Name : <input type="text" name="community_name"><br>
            <input type="submit" value="Create">
        </form>
        <br>
        <a href="GoToHome">Go to home</a>
    </body>
</html>
