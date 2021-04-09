<%-- 
    Document   : NumeroEnBlanco
    Created on : 8 abr. 2021, 10:52:27
    Author     : Akamegakill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Bienvenida</title>
        <style>

            body{
                background: rgb(129,190,2);
                background: linear-gradient(90deg, rgba(129,190,2,1) 0%, rgba(3,176,171,1) 74%);
            }
        </style>
    </head>
    <body>
        <!--<form action="OperacionServlet" method="post">
            <input type="number" name="numero1" id="numero1">
            <input type="number" name="numero2" id="numero2">
            <input type="submit" name="sumar" id="suma" value="Sumar">
            <input type="submit" name="restar" id="resta" value="restar">
        </form>-->
        <div class="container w-25 bg-light mt-5 rounded shadow">
            <div class="row align-items-stretch">
                <div class="col p-5 rounded-end">
                    <h1 class="fw-bold text-center py-1">Bienvenido <%out.println(session.getAttribute("user"));%></h1>
                </div>
                <form action="OperacionServlet" method="post">
                    <div class="form-group">
                        <h2 class="fw-bold text-center py-1">Calculadora</h2>
                        <label for="numero1">Número 1:</label>
                        <input type="number" class="form-control" placeholder="Ingrese un número" name="numero1" id="numero1">

                        <br>
                        <label for="numero2">Número 2:</label>
                        <input type="number" class="form-control" placeholder="Ingrese un número" name="numero2" id="numero1">

                        <br>
                        <center>
                            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                <button type="submit" class="btn btn-danger" name="sumar">Sumar</button>
                                <button type="submit" class="btn btn-warning" name="restar">Restar</button>
                                <button type="submit" class="btn btn-success" name="multiplicar">Multiplicar</button>
                                <button type="submit" class="btn btn-info" name="dividir">Dividir</button>
                            </div>
                        </center>
                    </div>
                </form>
                <form action="Bienvenida.jsp" method="post">
                    <center>
                        <button onclick="document.getElementById().value = ''" class="btn btn-dark">Resetear</button>
                    </center>
                </form>
                <div class="alert alert-danger" role="alert">
                    ¡Error!, debe ingresar 2 números para la operación
                </div>
            </div>
        </div>
    </body>
</html>
