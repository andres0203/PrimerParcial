<%-- 
    Document   : divicion
    Created on : 8 abr. 2021, 16:33:43
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
    </body>
</html>
