/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jm17015;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kevin
 */
public class Resultado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");
            int num1, num2;
            String nombre = request.getParameter("nombre");
            String numero1 = request.getParameter("numero1");
            String numero2 = request.getParameter("numero2");
            String suma = request.getParameter("sumar");
            String resta = request.getParameter("restar");
            String div = request.getParameter("dividir");
            String multi = request.getParameter("multiplicar");
            num1 = Integer.parseInt(numero1);
            num2 = Integer.parseInt(numero2);
            int resultado;
            if (suma != null) {
                resultado = num1 + num2;
                out.println("<h2>" + nombre + " el resultado de la suma es :" + resultado + "</h2>");
            }
            if (resta != null) {
                resultado = num1 - num2;
                out.println("<h2>" + nombre + " el resultado de la resta es :" + resultado + "</h2>");
            }
            if (multi != null) {
                resultado = num1 * num2;
                out.println("<h2>" + nombre + " el resultado de la multiplicación es :" + resultado + "</h2>");
            }
            if (div != null) {
                double n1, n2, division;
                n1 = Double.parseDouble(numero1);
                n2 = Double.parseDouble(numero2);
                division = n1 / n2;
                out.println("<h2>" + nombre + " el resultado de la división es :" + division + "</h2>");
            }
            if (num1 >= 0 && num2 >= 0 && num1 != num2) {
                out.println("<p>" + "Números primos:" + "</p>");
                if (num2 > num1) {
                    for (int i = num2; i >= num1; i--) {
                        int divisor = 0;
                        for (int j = 1; j <= num2; j++) {
                            if (i % j == 0) {
                                divisor++;
                            }
                        }
                        if (divisor == 2) {
                            out.println(i);
                        }
                    }
                } else {
                    for (int i = num1; i >= num2; i--) {
                        int divisor = 0;
                        for (int j = 1; j <= num1; j++) {
                            if (i % j == 0) {
                                divisor++;
                            }
                        }
                        if (divisor == 2) {
                            out.println(i);
                        }
                    }
                }
            } else {
                if (num1 < 0 && num2 < 0 && num1 == num2) {
                    out.println("<p>" + "ERROR AL CARGAR NÚMEROS PRIMOS: Número/os ingresado son negativos e idénticos" + "</p>");
                } else {
                    if (num1 == num2) {
                        out.println("<p>" + "ERROR AL CARGAR NÚMEROS PRIMOS: Número/os ingresados son idénticos" + "</p>");
                    } else {
                        if (num1 < 0) {
                            out.println("<p>" + "ERROR AL CARGAR NÚMEROS PRIMOS: Número ingresado " + num1 + " es negativo" + "</p>");
                        }
                        if (num2 < 0) {
                            out.println("<p>" + "ERROR AL CARGAR NÚMEROS PRIMOS: Número ingresado " + num2 + " es negativo" + "</p>");
                        }
                    }
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
