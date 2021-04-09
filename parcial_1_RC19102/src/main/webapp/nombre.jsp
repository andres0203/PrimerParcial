<%@page session = "true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%out.println(session.getAttribute("nombre"));%> </h1>
        <%String nombreSE = (String) session.getAttribute("nombre");%>
        <b></b><b></b>
        <form action="operacion1" method="post">

            <input type="number" name="numeros1" id="numeros1"> 
            <input type="number" name="numeros2" id="numeros2"> 
            <input type="submit" name="Sumar" value="Sumar">
            <input type="submit" name="Restar" value="Restar">
            <input type="submit" name="Multiplicar" value="Multiplicar">
            <textarea name="nombreSE" style="visibility:hidden;"><%=nombreSE%> </textarea>
        </form>
    </body>
</html>
