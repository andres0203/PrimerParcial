<%-- 
    Document   : suma
    Created on : 8 abr. 2021, 16:48:04
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
        <style>
            h1{font-family: arial;font-size:35px}
        </style>
        <h3>la suma de sus dos numeros es: <% out.println(session.getAttribute("suma"));%></h3>
        <h3>los numeros primos son: <% out.println(session.getAttribute("verPrimos"));%></h3>
    </body>
</html>
