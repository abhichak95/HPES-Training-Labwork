<%--
    Document   : infoPage
    Created on : 13 Jul, 2015, 10:17:18 AM
    Author     : Abhishek
--%>

<%@page import="java.util.Date"%>
<%@page import="com.hp.j2sh.entity.Voter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile - Online Voting System</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            String msg = "";
            
            Voter _voter = (Voter) session.getAttribute("VoterObject");
            String name = _voter.getName();
            Short age = _voter.getAge();
            String gender = _voter.getGender();
            String dob = _voter.getDob();
            String email_id = _voter.getEmail_id();
            String password = _voter.getPassword();
            Short vote_status = _voter.getVote_status();
        %>
        <h2>Your Account Details are:</h2><br>
        <h3>Name : <%= name %></h3>
        <h3>Age : <%= age %></h3>
        <h3>Gender : <%= gender %></h3>
        <h3>DOB : <%= dob %></h3>
        <h3>Email-ID or Contact No. : <%= email_id %></h3>
        <h3>
            Vote Status : <%= vote_status %></h3> &nbsp;&nbsp;&nbsp;&nbsp;
            <%
                if (vote_status == 0) {
            %>
            <form action="GetVote" method="POST">
                <input type="submit" value="Vote Now">
            </form>
            <%
                } else {
                    out.print("Your vote has been counted...");
                }
            %>
            
    </body>
</html>
