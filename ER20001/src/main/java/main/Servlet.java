/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 14AM071LA
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name, opera = null;
            int number1, number2, respuesta = 0, valor;

            name = request.getParameter("name");
            number1 = Integer.parseInt(request.getParameter("number1"));
            number2 = Integer.parseInt(request.getParameter("number2"));
            valor = Integer.parseInt(request.getParameter("operacion"));

            if (valor == 1) {
                respuesta = number1 + number2;
                opera = "Suma";
            } else if (valor == 2) {
                respuesta = number1 - number2;
                opera = "Resta";
            } else if (valor == 3) {
                respuesta = number1 * number2;
                opera = "Multiplicacion";
            } else if (valor == 4) {
                respuesta = number1 / number2;
                opera = "Divicion";
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bienvenido, " + name + ". </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido, " + name + " <h1>");
            out.println("<h3> El resultado de la " + opera + " es: " + respuesta + "</h3>");
            out.println("<h3>Los numeros primos entre estos son: </h3>");
            if (number1 > number2) {
                for (int i = number1; i >= number2; i--) {
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                        out.println("<h4>" + i + "</h4>");
                    }
                }
            } else if (number2 > number1) {
                for (int i = number2; i >= number1; i--) {
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                        out.println("<h4>" + i + "</h4>");
                    }
                }
            } else if (number1 == number2) {
                for (int i = number1; i == number2; i--) {
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                        out.println("<h4>" + i + "</h4>");
                    }
                    else{
                        out.println("<h4>No hay numeros primos</h4>");
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
