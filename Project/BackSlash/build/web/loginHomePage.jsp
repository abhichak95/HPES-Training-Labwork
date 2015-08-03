<%-- 
    Document   : loginHomePage
    Created on : 13 Jul, 2015, 5:08:26 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>BackSlash Community Network - HomePage</title>
<style type="text/css">
@font-face {
	font-family: 'Backslash Font';
	src: url('fonts/Backslash.ttf') format('truetype');
}
#form1 #username {
	width: 250px;
	height: 30px;
	border-style: double;
	border-radius: 10px 10px 0px 0px;
}
#password {
	width: 250px;
	border-bottom-left-radius: 10px;
	border-bottom-right-radius: 10px;
	height: 30px;
}
#submit {
	width: 100px;
	height: 50px;
	border-radius: 30px;
}td p a {
	margin-left: 10px;
	color: #00D18C;
	font-family: "Gill Sans", "Gill Sans MT", "Myriad Pro", "DejaVu Sans Condensed", Helvetica, Arial, sans-serif;
}
a {
	text-decoration: none;
}
td p em {
	margin-top: -15px;
	margin-bottom: -15px;
}
.header {
	background-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);
	background-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);
	background-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);
	background-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(3,51,4,1.00) 67.88%);
	border-radius: 30px;
	font-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-size: 24px;
	background-color: #033304; 
	color: #E9E9E9; 
	background-image: -webkit-repeating-linear-gradient(90deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%); 
	background-image: -moz-repeating-linear-gradient(90deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%); 
	background-image: -o-repeating-linear-gradient(90deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%); 
	background-image: repeating-linear-gradient(0deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 22.80%,rgba(40,154,6,1.00) 44.56%,rgba(32,166,6,1.00) 54.40%,rgba(14,126,5,1.00) 66.32%,rgba(37,86,2,1.00) 82.90%,rgba(7,70,0,1.00) 100%);
}
.main-left {
	background-color: #164100;
	border-radius: 30px;
}
body {
	background-color: #0C4100;
	color: #C1C9FF;
	font-family: Cambria, "Hoefler Text", "Liberation Serif", Times, "Times New Roman", serif;
	font-size: large;
}

</style>
</head>

<body>
<table width="100%" border="0" align="center" height="100%">
  <tbody>
    <tr>
      <td class="header" height="50"><p align="center"><em>A virtual community for each of your real-life communities...</em></p>
      <p align="center"><em>where you connect to everyone!</em></p></td>
    </tr>
    <tr>
      <td height="369"><table width="100%" border="0" height="100%">
        <tbody>
          <tr>
            <td class="main-left" width="71%" height="100%"><img src="images/102877-3d-glossy-green-orb-icon-alphanumeric-back-slash.png" width="187" height="194" alt=""/><img src="images/Backslash_transparent-3.png" width="500" height="150" alt=""/></td>
            <td width="29%" height="100%"><form action="Login" id="form1" name="form1" method="post">
              <p>
                <label for="username"></label>
                </p>
              <p>
                <input type="text" name="username" id="username" placeholder=" Username">
              </p>
            
              <p>
                <label for="password"></label>
                <input type="password" name="password" id="password" placeholder=" Password">
              </p>
              <p>
                <input type="submit" name="submit" id="submit" value="Sign In">
                
               &nbsp;&nbsp;&nbsp;&nbsp;<a href="pages/ForgotPassword.html" title="Forgot Password?" target="_blank">Forgot Password?</a></p> </form>
              <p>&nbsp;</p>
              <form id="form2" name="form2" method="post">
                <p>Log In using...</p>
                <p><a href="http://www.facebook.com">Facebook</a>   <a href="http://plus.google.com">Google+</a> <a href="http://www.github.com">GitHub</a></p>
              </form>
              <p>&nbsp;</p>
              <p>New User? <a href="signUpPage.jsp" title="Sign Up" target="_parent">Sign Up</a></p></td>
          </tr>
          <tr>
            <td height="100%">&nbsp;</td>
            <td height="100%">&nbsp;</td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td><p>&copy; Abhishek Chakraborty, 2015</p>
      <p>All rights reserved.</p></td>
    </tr>
  </tbody>
</table>
</body>
</html>
