<%-- 
    Document   : communityPage
    Created on : 14 Jul, 2015, 9:39:16 PM
    Author     : Abhishek
--%>

<%@page import="com.hp.j2sh.project.other.Post"%>
<%@page import="java.util.List"%>
<%@page import="com.hp.j2sh.project.entity.AllUsers"%>
<%@page import="com.hp.j2sh.project.other.CommunityPageData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Community Page</title>
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
        <h1>Community Page</h1>
        <%
            CommunityPageData data = (CommunityPageData) session.getAttribute("communityPageDataObject");
        %>
        <h2>Users: </h2>
        <%
            List<AllUsers> userList = data.getAllUsersList();
            for (AllUsers e : userList) {
        %>
        <h4><%= e.getUsername() %></h4>
        <%
            }
        %>
        <br><br><br>
        <h2>Posts: </h2>
        <%
            List<Post> postList = data.getPostList();
            Integer i = new Integer("1");
            for (Post e : postList) {
        %>
        <h4><%= i++ %>) Content : <%= e.getContent()%> ::: Posted by <%= e.getUserId()%> ::: Posted on : <%= e.getDateTime() %> </h4>
        <%
            }
        %>
        <br><br>
        <h2>Create Post ::</h2>
        <form action="SubmitPost" method="POST">
            Content : <input type="text" name="content">
            <input type="submit" value="Post">
        </form>
        <br>
        <a href="GoToHome">Go to home</a>
    </body>
</html>
