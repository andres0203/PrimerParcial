/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerparcial_cm17145;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nuevo
 */
public class ServletCalculadora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String nombre, tip;
    double n1, n2, suma, resta, multiplicacion, division, op, resultado;
    double numero;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            nombre = request.getParameter("nombres");
            out.println("<h1>Bienvenido " + nombre + "</h1>");
            n1 = Double.parseDouble(request.getParameter("numero1"));
            n2 = Double.parseDouble(request.getParameter("numero2"));
            out.println("<h1>Numero 1 ingresado: " + n1 + "</h1>");
            out.println("<h1>Numero 2 ingresado: " + n2 + "</h1>");

            op = Double.parseDouble(request.getParameter("ops"));
            if (op == 1) {
                tip = "suma";
                suma = n1 + n2;
                resultado = suma;
            }
            if (op == 2) {
                tip = "resta";
                resta = n1 - n2;
                resultado = resta;
            }
            if (op == 3) {
                tip = "multiplicacion";
                multiplicacion = n1 * n2;
                resultado = multiplicacion;
            }
            if (op == 4) {
                tip = "division";
                division = n1 / n2;
                resultado = division;
            }

            out.println("<h2>El resultado de la " + tip + " es : " + resultado + "</h2>");
            
            out.println("<h3>numeros primos entre " + n1 + " y " + n2 + " son: </h3>");
            
            for (double bucle = n2; bucle >= n1; bucle--) {
                if (bucle % 2 == 1) {
                    numero = bucle;
                    out.println("<p> numero: " + numero + "</p>");
                }
                
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
