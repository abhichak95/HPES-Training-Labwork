        <div style="background-image: -webkit-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -moz-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -o-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: linear-gradient(180deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%);">

	<h1 align="center" style="font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;">
    	HP Education Summer Training, Noida
        </h1>
        <h2 align="center" style="font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;">
    	J2EE - Struts with Hibernate Framework
        </h2>
        <br><br><br>
        <%
            String userName = "Welcome, ";
            try {
                userName += session.getAttribute("userName").toString();
            }
            catch(NullPointerException e) {
                userName = "";
            }
        %>
        <h3> <%= userName%> </h3>
        </div>
        <%
            String logoutPage = (String) application.getInitParameter("logout");
        %>
        <div style="text-align: right;"><a href="<%= logoutPage %>"><h3>Log Out</h3></a></div>