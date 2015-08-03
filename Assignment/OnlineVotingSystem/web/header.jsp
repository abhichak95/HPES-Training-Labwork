        <div style="background-image: -webkit-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -moz-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: -o-linear-gradient(270deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%); background-image: linear-gradient(180deg,rgba(250,255,77,1.00) 0%,rgba(251,255,158,1.00) 26.42%,rgba(253,255,210,1.00) 47.67%,rgba(248,255,133,1.00) 73.58%,rgba(245,255,93,1.00) 100%);">

	<h1 align="center" style="font-family:Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif;">
    	Online Voting System
        </h1>
        <br><br><br>
        <%
            String userName = "Welcome, ";
            try {
                userName += session.getAttribute("user").toString();
            }
            catch(NullPointerException e) {
                System.out.println("Header NullPointerException :: " + e.getMessage());
                userName = "";
            }
        %>
        <h3> <%= userName%> </h3>
        </div>