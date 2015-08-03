<%-- 
    Document   : userHomePage
    Created on : 13 Jul, 2015, 8:06:38 PM
    Author     : Abhishek
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.hp.j2sh.project.entity.AllCommunities"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Home Page</title>
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
            Integer user = (Integer) session.getAttribute("user_id");
            String registerMsg = (String) session.getAttribute("RegisterMessage");
        %>
        <h3 style="text-align: right;"><a href="Logout">LogOut</a></h3>
        <br><br><br>
        <h3 style="text-align: right;"><a href="Profile">Your User Profile</a></h3>
        <h1>User Home Page</h1>
        
        <%
            if (registerMsg != null) out.println(registerMsg);
            if (user != null) out.println("User ID :: " + user);
        %>
        
        <%
            session.removeAttribute("RegisterMessage");
        %>
        
        <%
            List<AllCommunities> communityListAll = (ArrayList<AllCommunities>) session.getAttribute("communityListAll");
            List<AllCommunities> communityListUser = (ArrayList<AllCommunities>) session.getAttribute("communityListUser");
            
            if (communityListAll == null) communityListAll = new ArrayList<AllCommunities>(0);
            if (communityListUser == null) communityListUser = new ArrayList<AllCommunities>(0);
        
        %>
        
        <form action="Enter" method="POST">
            Enter community :
            <select name="community_Id">
            <%
                for (AllCommunities ac : communityListUser) {
            %>
            <option value="<%= ac.getCommunityId()%>"><%= ac.getCommunityName() %></option>
            <%
                }
            %>
            </select>
            <input type="submit" value="Enter">
        </form>
        
        <form action="Join" method="POST">
            Join community :
            <select name="communityId">
            <%
                for (AllCommunities ac : communityListAll) {
            %>
            <option value="<%= ac.getCommunityId()%>"><%= ac.getCommunityName() %></option>
            <%
                }
            %>
            </select>
            <input type="submit" value="Join">
        </form>
        
        <a href="createCommunityPage.jsp">Create new community</a>
    </body>
</html>
