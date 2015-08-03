<%-- 
    Document   : signUpPage
    Created on : 13 Jul, 2015, 9:45:29 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Sign Up - Backslash Community Network</title>
<style type="text/css">
@font-face {
	font-family: 'Backslash Font';
	src: url('fonts/Backslash.ttf') format('truetype');
}
header {
	position: fixed;
	margin-top: -100px;
	background-image: -webkit-linear-gradient(270deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(16,73,0,1.00) 0%,rgba(19,119,0,1.00) 16.06%,rgba(40,154,6,1.00) 33.68%,rgba(32,166,6,1.00) 51.81%,rgba(40,154,6,1.00) 69.95%,rgba(19,119,0,1.00) 84.97%,rgba(16,73,0,1.00) 100%);
	width: 100%;
	height: 60px;
	border-radius: 30px;
}
body {
	background-color: #0C4100;
}
main {
	margin-top: 100px;
}
article {
	margin-bottom: 10px;
	margin-top: 10px;
	padding-bottom: 10px;
}
.user_pass {
	text-align: center;
	background-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(203,203,203,1.00) 100%);
	border-radius: 40px;
	background-size: auto 100px;
}
.personal {
	text-align: right;
	background-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(163,160,160,1.00) 100%);
	border-radius: 100px;
}
.personal_t {
	text-align: right;
}
.personal_t {
	margin-left: 110px;
}
#personal_input {
	width: 300px;
	margin-right: 20px;
}
#educational_input {
	width: 300px;
	margin-left: 20px;
}
.educational_t {
	margin-left: 50px;
}
.educational {
	text-align: right;
	background-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(164,162,162,1.00) 100%);
	border-radius: 80px;
}
#work_input {
	width: 300px;
	margin-left: 20px;
}
.work_t {
	margin-left: 110px;
}
.work {
	text-align: right;
	border-radius: 60px;
	background-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(154,150,150,1.00) 100%);
}
#other_input {
	width: 300px;
	margin-left: 20px;
}
.other_t {
	margin-left: 100px;
}
.other {
	text-align: right;
	background-image: -webkit-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(255,255,255,1.00) 0%,rgba(150,146,146,1.00) 100%);
	border-radius: 100px;
}#submit {
	text-align: center;
	width: 150px;
	height: 50px;
	margin-left: 80px;
	left: 100%;
	right: 100%;
	border-radius: 30px;
}
h2 {
	color: #E9E9E9;
	font-family: "Backslash Font";
	line-height: normal;
	text-decoration: underline;
	width: 100%;
	background-image: -webkit-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	text-indent: 20px;
	font-size: xx-large;
	border-radius: 50px 50px 10px 10px;
}
#end {
	color: #E9E9E9;
	font-family: "Backslash Font";
	line-height: normal;
	text-decoration: none;
	width: 100%;
	background-image: -webkit-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	background-image: -moz-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	background-image: -o-linear-gradient(270deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	background-image: linear-gradient(180deg,rgba(87,183,0,1.00) 0%,rgba(163,156,55,1.00) 48.70%,rgba(68,213,0,1.00) 100%);
	text-indent: 20px;
	font-size: xx-large;
	border-radius: 10px 10px 50px 50px;
}
h3 {
	text-indent: 30px;
	background-color: #28B000;
	color: #EAFF9F;
	font-family: "Lucida Grande", "Lucida Sans Unicode", "Lucida Sans", "DejaVu Sans", Verdana, sans-serif;
	border-radius: 30px;
}

</style>
</head>

<body>
    <header><a href="loginHomePage.jsp"><img src="images/backslash-logo-thumb.png" width="51" height="51" alt=""/><img src="images/Backslash_transparent-thumb.png" width="170" height="40" alt=""/></a></header>
<main>
	<article>
    	<h2>New User Registration</h2>
        <form action="Register" method="POST">
        	<div class="user_pass">
        	<p><label>Username: </label>*<input type="text" name="username" id="username" placeholder="example" required></p>
            <p><label>Password: </label>*<input type="password" name="password" id="password" placeholder="example123" required></p></div>
		<article><h3>Personal Details</h3>
        	<div class="personal">
            <table class="personal_t">
            <tr>
            <td><label>Name: </label></td>
            <td>*<input type="text" name="fname" id="personal_input" placeholder="First" required></td>
            <td><input type="text" name="mname" id="personal_input" placeholder="Middle"></td>
            <td><input type="text" name="lname" id="personal_input" placeholder="Last"></td></tr>
            <tr><td><label>E-Mail ID: </label></td>
            <td>*<input type="email" name="p_email" id="personal_input" placeholder="Primary" required></td>
            <td><input type="email" name="s_email" id="personal_input" placeholder="Secondary" ></td></tr>
            <tr><td><label>Contact Number: </label></td>
            <td>*<input type="tel" name="p_contact" id="personal_input" placeholder="Primary" required></td>
            <td><input type="tel" name="s_contact" id="personal_input" placeholder="Secondary" ></td></tr>
            <tr><td><label>Date of Birth:</label></td>
            <td><input type="number" name="day_dob" id="personal_input" min="1" max="31" placeholder="Day" ></td>
            <td><input type="number" name="month_dob" id="personal_input" min="1" max="12" placeholder="Month" ></td>
            <td><input type="number" name="year_dob" id="personal_input" min="1971" max="2015" placeholder="Year" ></td></tr>
            <tr><td><label>Gender: *</label></td>
            <td><input type="radio" name="gender" id="gender_input" value="male" required>Male</td>
            <td><input type="radio" name="gender" id="gender_input" value="female">Female</td>
            <td><input type="radio" name="gender" id="gender_input" value="other">Prefer not to say</td></tr>
            </table>
    	</article>
    	<article><h3>Educational Details</h3>
        	<div class="educational">
        	<table class="educational_t">
            <tr><td><label>Last Institution Attended: </label></td>
	        <td><input type="text" name="cur_institution" id="educational_input" placeholder="Delhi Public School" ></td></tr>
    	    <tr><td><label>Degree: </label></td>
        	<td><input type="text" name="degree" id="educational_input" placeholder="Bachelor of Technology" ></td></tr>
	        <tr><td><label>Major: </label></td>
    	    <td><input type="text" name="major" id="educational_input" placeholder="Computer Science" ></td></tr>
        	<tr><td><label>Year of Completion: </label></td>
	        <td><input type="number" name="degree_comp" id="educational_input" min="2000" max="2020" placeholder="2015" value="2015" ></td></tr></table></div>
    	</article>
    	<article><h3>Work Details</h3>
        	<div class="work">
            <table class="work_t">
	        <tr><td><label>Organization: </label></td>
    	    <td><input type="text" name="work_organization" id="work_input" placeholder="Hewlett-Packard" ></td></tr>
        	<tr><td><label>Position: </label></td>
	        <td><input type="text" name="work_position" id="work_input" placeholder="Web Developer" ></td></tr>
    	    <tr><td><label>Working Since: </label></td>
        	<td><input type="number" name="work_since" id="work_input" min="2000" max="2015" placeholder="2012" value="2012"></td></tr></table></div>
    	</article>
    	<article><h3>Other Details</h3>
        	<div class="other">
            <table class="other_t">
	        <tr><td><label>Hometown: </label></td>
    	    <td><input type="text" name="hometown" id="other_input" placeholder="New Delhi" ></td></tr>
            <tr><td><label>Current Address: </label></td>
    	    <td><input type="text" name="address1" id="other_input" placeholder="House/Apartment No." ></td></tr>
            <tr><td></td><td><input type="text" name="address2" id="other_input" placeholder="Street" ></td></tr>
            <tr><td></td><td><input type="text" name="address3" id="other_input" placeholder="City" ></td></tr>
            <tr><td></td><td><input type="text" name="address4" id="other_input" placeholder="State" ></td></tr></table></div>
    	</article>
        <article><h2 id="end">&nbsp;</h2></article>
        <article>
        	<center><input type="submit" id="submit" value="Register">
            <input type="reset" id="submit" value="Reset"></center>
        </article>
    	</form>
    </article>
</main>
<footer>
</footer>
</body>
</html>
