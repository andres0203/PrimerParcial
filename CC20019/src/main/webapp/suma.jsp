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
        <h1 style="text-align: center; background: black; color: white;">Bienvenido <%out.println(session.getAttribute("nombre"));%></h1>
        <h2>Sus numeros fueron : primero #<%out.println(session.getAttribute("numero1"));%> segundo #<%out.println(session.getAttribute("numero2"));%></h2>
        <h2>La suma de sus numeros fueron <%out.println(session.getAttribute("suma"));%></h2>   
        <h2>Sus numeros primos fueron <%out.println(session.getAttribute("primos"));%></h2>   
    </body>
</html>
