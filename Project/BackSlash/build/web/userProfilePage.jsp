<%-- 
    Document   : userProfilePage
    Created on : 15 Jul, 2015, 10:48:40 AM
    Author     : Abhishek
--%>

<%@page import="com.hp.j2sh.project.entity.UserOtherDetails"%>
<%@page import="com.hp.j2sh.project.entity.UserWorkDetails"%>
<%@page import="com.hp.j2sh.project.entity.UserEducationalDetails"%>
<%@page import="com.hp.j2sh.project.entity.UserPersonalDetails"%>
<%@page import="com.hp.j2sh.project.entity.AllUsers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile Page</title>
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
        %>
        <h3 style="text-align: right;"><a href="Logout">LogOut</a></h3>
        <h1>User Profile Page</h1><br><br>
        <%
            AllUsers allUsers = (AllUsers) session.getAttribute("userDataObject");
            UserPersonalDetails userPersonalDetails = allUsers.getUserPersonalDetails();
            UserEducationalDetails userEducationalDetails = allUsers.getUserEducationalDetails();
            UserWorkDetails userWorkDetails = allUsers.getUserWorkDetails();
            UserOtherDetails userOtherDetails = allUsers.getUserOtherDetails();
        %>
        <h5>Username : <%= allUsers.getUsername() %></h5>
        <h5>Password : <%= allUsers.getPassword() %></h5><br>
        
        <h2>Personal Details :::</h2>
        <h5>First Name : <%= userPersonalDetails.getFirstName() %></h5>
        <h5>Middle Name : <%= userPersonalDetails.getMiddleName() %></h5>
        <h5>Last Name : <%= userPersonalDetails.getLastName() %></h5>
        <h5>Primary Email : <%= userPersonalDetails.getEmailPrimary() %></h5>
        <h5>Secondary Email : <%= userPersonalDetails.getEmailSecondary() %></h5>
        <h5>Primary Contact : <%= userPersonalDetails.getContactPrimary() %></h5>
        <h5>Secondary Contact : <%= userPersonalDetails.getContactSecondary() %></h5>
        <h5>DOB : <%= userPersonalDetails.getDob() %></h5>
        <h5>Gender : <%= userPersonalDetails.getGender() %></h5><br>
        
        <h2>Educational Details :::</h2>
        <h5>Institution : <%= userEducationalDetails.getLastInstitution() %></h5>
        <h5>Degree : <%= userEducationalDetails.getDegree()%></h5>
        <h5>Major : <%= userEducationalDetails.getMajor() %></h5>
        <h5>Year Completed : <%= userEducationalDetails.getYearCompleted()%></h5><br>
        
        <h2>Work Details :::</h2>
        <h5>Organization : <%= userWorkDetails.getOrganization()%></h5>
        <h5>Position : <%= userWorkDetails.getPosition()%></h5>
        <h5>Working Since : <%= userWorkDetails.getWorkSince()%></h5><br>
        
        <h2>Other Details :::</h2>
        <h5>Hometown : <%= userOtherDetails.getHometown()%></h5>
        <h5>House No. : <%= userOtherDetails.getHouseNo()%></h5>
        <h5>Street : <%= userOtherDetails.getStreet()%></h5>
        <h5>City : <%= userOtherDetails.getCity()%></h5>
        <h5>State : <%= userOtherDetails.getState()%></h5>
        
        <br>
        <a href="GoToHome">Go to home</a>
    </body>
</html>
