<%-- 
    Document   : bienvenido
    Created on : 8 abr. 2021, 21:25:36
    Author     : aviles
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        
    <center>
        <%
            /*se realizo esta session por el motivo de incluir la paguina operaciones.html
            asi garantizando la conservacion de datos optenidos de el servlet*/
            if (request.getParameter("user") != null) {
                session.setAttribute("name", request.getParameter("user"));
                session.setAttribute("vector_primos", request.getAttribute("primos"));
                session.setAttribute("A",request.getParameter("n_a"));
                session.setAttribute("B",request.getParameter("n_b"));
                session.setAttribute("suma",request.getAttribute("suma"));
                session.setAttribute("resta",request.getAttribute("resta"));
                session.setAttribute("producto",request.getAttribute("producto"));
            }
        %>
        <h1>bienvenido <% out.print(session.getAttribute("name")); %></h1><br>
    </center>
    <jsp:include page="operaciones.html"></jsp:include>
        <center>
            <input type="button" value="<% out.print(session.getAttribute("A"));%>" >
        <%!String global;%>
            <%
            
            if (request.getParameter("suma") != null) {
                out.print("+");
                global="suma";
            }
            if (request.getParameter("resta") != null) {
                out.print("-");
                global="resta";
            }
            if (request.getParameter("division") != null) {
                out.print("/");
                /*se iso aqui el metodo de divicion por el motivo que no daba parametros atravez del server*/
                double a,b,aux;
                a=Double.parseDouble((String)session.getAttribute("A"));
                b=Double.parseDouble((String)session.getAttribute("B"));
                aux=(a/b);
                session.setAttribute("div",aux);
                global="div";
            }
            if (request.getParameter("producto") != null) {
                out.print("*");
               global="producto";
            }
        %>
        <input type="button" value="<% out.print(session.getAttribute("B"));%>">   
        <br>
        <input type="button" value="el resultado de la operacion aritmetica es" ><br>
         <input type="button" value="<% out.print(session.getAttribute(global));%>">
         
         
    </center>
    <br><br>
    <center>
        <table border="100" style="color: crimson; background-color: chartreuse;">
            <tr>
                <td>
                    <input type="button" value="numeros primos" >  
                </td>
            </tr>
            <tr>
                <td>
            <center>
                     <c:forEach var="i" items="${vector_primos}">
                <li>${i}</li> <br>
                    </c:forEach>
            </center>
                </td>
            </tr>
        </table> 
    </center> 



</body>
</html>
