<%-- 
    Document   : upload
    Created on : 6 Jul, 2015, 9:45:16 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Upload Page</title>
    </head>
    <body>
        <h1>File Upload Demo</h1>
        <s:form action="Upload" method="POST" enctype="multipart/form-data">
            <s:file name="myFile" label="File"></s:file><br>
            <s:submit value="Upload"></s:submit>
        </s:form>
    </body>
</html>
