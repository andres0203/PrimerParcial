<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session = "true" %>
<%@page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <head>
        <title>FC20015</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;400;700;900&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <form class="contenedor" action="index.jsp" method="post">
            <div class="contenedor-inputs">
                <div class="botones">
                    <span class="boton boton--1"></span>
                    <span class="boton boton--2"></span>
                    <span class="boton boton--3"></span>
                </div>
                <h1 class="bienvenida">Bienvenido <%out.print(session.getAttribute("nombre"));%></h1>
                <div class="texto">
                    <div class="caja-texto">
                        <p class="respuesta"><% out.print(session.getAttribute("enunciado")); %></p>
                        <span><% out.print(session.getAttribute("resultado")); %></span>
                    </div>

                    <div class="caja-texto">
                        <p class="respuesta">Números primos entre los números brindados</p>
                        <span><% out.print(session.getAttribute("primos"));%></span>
                    </div> 
                </div>
            </div>
            <button class="btn btn-animado">Regresar <span>&rarr;</span></button>
        </form>
    </body>
</html>
