<%-- 
    Document   : resta
    Created on : 9 abr. 2021, 11:13:55
    Author     : Ariel
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background:grey">
        <h1 style="background: black; color: white; text-align:center;border-radius: 3px;font-family: arial;font-size: 35px">USUARIO: <% out.println(session.getAttribute("nombre"));%></h1>
        <h2>La resta de sus dos numeros es: <% out.println(session.getAttribute("resta"));%></h2>
        <h2>Los numeros primos son: <% out.println(session.getAttribute("verPrimos"));%></h2>
    </body>
</html>
