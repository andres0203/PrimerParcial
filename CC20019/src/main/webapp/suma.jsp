<%-- 
    Document   : suma
    Created on : 8 abr. 2021, 16:19:52
    Author     : Samuel
--%>
<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%out.println(session.getAttribute("nombre"));%></h1>
        <h2>Suma</h2>       
    </body>
</html>
