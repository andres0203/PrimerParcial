
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <form action="Mi_Servlet" method="POST" class="form">
            <div class="contenedor-inputs">
                <div class="botones">
                    <span class="boton boton--1"></span>
                    <span class="boton boton--2"></span>
                    <span class="boton boton--3"></span>
                </div>
                <div class="input-group">
                    <input type="text" name="nombre" id="nombre" class="input-nombre" placeholder="Tu nombre">
                    <label for="nombre" class="label-nombre">Tu nombre</label>
                </div>
                <div class="input-group">
                    <h2 class="numeros__heading">Ingresa dos números</h2>
                    <div class="numeros">
                        <div class="contenedor-numeros">
                            <input type="number" name="numero-1" id="numero-1" class="input-numero" min="0" max="100" value="0">
                            <span class="flecha">&rarr;</span>
                            <input type="number" name="numero-2" id="numero-2" class="input-numero" min="0" max="100" value="0">
                        </div>
                        <select class="opciones" name="opciones">
                            <option value="sumar">Sumar</option>
                            <option value="restar">Restar</option>
                            <option value="multiplicar">Multiplicar</option>
                            <option value="dividir">Dividir</option>
                        </select>       
                    </div>
                </div>
            </div>
              <button class="btn">Siguiente <span>&rarr;</span></button>  
        </form>
    </body>
</html>
