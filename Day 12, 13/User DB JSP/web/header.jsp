<%-- 
    Document   : header
    Created on : 30 Jun, 2015, 10:56:07 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div style="background-image: -webkit-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -moz-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -o-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: linear-gradient(180deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%);">

	<h1 align="center" style="font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;">
    	HP Education Summer Training, Noida
        </h1>
        <h2 align="center" style="font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;">
    	J2EE - Struts with Hibernate Framework
        </h2>
        <br><br><br>
        <%
            String userName = session.getAttribute("userName").toString();
        %>
        <h3>Welcome, <%= userName%> </h3>
        </div>
    </body>
</html>
