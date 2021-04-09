<%-- 
    Document   : dividir
    Created on : 9 abr. 2021, 11:15:06
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
    <body>
        <h1 style="background: black; color: white; text-align:center ">Usuario: <% out.println(session.getAttribute("nombre"));%></h1>      
        <h3>la divicion de sus dos numeros es: <% out.println(session.getAttribute("dividir"));%></h3>
        <h3>los numeros primos son: <% out.println(session.getAttribute("verPrimos"));%></h3>
    </body>
</html>
