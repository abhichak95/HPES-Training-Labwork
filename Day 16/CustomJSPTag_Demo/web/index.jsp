<%-- 
    Document   : index
    Created on : 3 Jul, 2015, 9:49:13 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/MyTagLibrary.tld" prefix="hp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hp:MyTagHandler loop="4" msg="Hello World">
            Test Body
        </hp:MyTagHandler>
    </body>
</html>
