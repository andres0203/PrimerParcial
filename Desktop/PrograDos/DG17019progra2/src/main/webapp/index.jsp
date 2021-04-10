<%-- 
    Document   : index
    Created on : 8 abr. 2021, 00:58:02
    Author     : Manuel Duarte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculadora</title>
    </head>
    <body>
        <h1>Hello DG17019!</h1>
        <form action="ServletOperaciones" method="POST">
            <br>
             Nombre:<input type="text" name="txtNombre" value="" />
            </br>
            <br>        
            numero 1:<input type="text" name="txtNum1" value="" />
            </br>
            <br>
            numero 2:<input type="text" name="txtNum2" value="" />
            </br> 
            <br>
            <input type="submit" value="Sumar" name="btnSumar" />
            <input type="submit" value="Restar" name="btnRestar" />
            <input type="submit" value="Multiplicar" name="btnMultiplicar" />
            <input type="submit" value="Dividir" name="btnDividir" />
        </form>
    </body>
</html>
