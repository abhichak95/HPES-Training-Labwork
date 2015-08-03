<%-- 
    Document   : mainHomePage
    Created on : 30 Jun, 2015, 10:38:20 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>User DB HomePage</title>
</head>

<body>
<table width="100%" border="0" height="100%" style="border-collapse:collapse;">
  <tbody>
    <tr>
      <td style="background-color: #C4C4C4">
      	<h2 style="text-align: center; text-decoration: underline; font-weight:bold; font-size: 36px; text-transform: uppercase;">User DB Project</h2>
      </td>
    </tr>
    <tr>
      <td style="background-image: -webkit-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -moz-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: -o-linear-gradient(270deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%); background-image: linear-gradient(180deg,rgba(187,180,180,1.00) 0%,rgba(221,221,221,1.00) 49.22%,rgba(177,175,175,1.00) 99.48%);">
      	<div align="center" style="margin-top:100px; margin-bottom:100px; font-size:20px;">
        	<form action="index.jsp" method="POST">
                <%
                    String msgUser = (String) request.getAttribute("msgUser");
                    String msgPass = (String) request.getAttribute("msgPass");
                    if (msgUser != null) out.println(msgUser);
                %>
                <br><label>Username: </label><input type="text" name="username" autofocus="true"><br><br>
                <%
                    if (msgPass != null) out.println(msgPass);
                %>
                <br><label>Password: </label><input type="password" name="password"><br><br>
                <input type="submit" value="Sign In">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="Clear">
            </form>
        </div>
      </td>
    </tr>
    <tr>
      <td style="background-color:#CDCDCD">&copy; Abhishek Chakraborty, 2015</td>
    </tr>
  </tbody>
</table>
</body>
</html>
