<%-- 
    Document   : Resultado
    Created on : 8 abr. 2021, 10:40:28
    Author     : Akamegakill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session = "true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <style>
            body{
                background: rgb(129,190,2);
                background: linear-gradient(90deg, rgba(129,190,2,1) 0%, rgba(3,176,171,1) 74%);
            }
        </style>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <div class="container w-25 bg-light mt-5 rounded shadow">
            <div class="row align-items-stretch">
                <div class="col p-5 rounded-end">
                    <center>
                        <h1 class="fw-bold text-center py-5"><% out.println(session.getAttribute("user")); %> el resultado de la <% out.println(session.getAttribute("imprimirResultado"));%></h1>
                        <label for="text" class="form-label">Números primos</label>
                        <textarea disabled cols="45" rows="5"  style="resize: both;">
                            <% out.println(session.getAttribute("numerosPrimos"));%>
                        </textarea>

                        <form action="ResultadoServlet" method="post">
                            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                <button type="submit" class="btn btn-info" name="boton1">Realizar otra operacion</button>
                                <button type="submit" class="btn btn-success" name="boton2">Ingresar usuario</button>
                            </div>
                        </form>
                    </center>
                </div>
            </div>
        </div>
    </body>
</html>
