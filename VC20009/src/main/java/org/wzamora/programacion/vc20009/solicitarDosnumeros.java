/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wzamora.programacion.vc20009;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ariel
 */
public class solicitarDosnumeros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String nombre="", suma, resta, multiplicacion, divicion, verPrimos = "";
    int numero1, numero2, Resultado, numeroMayor, numeroMenor, contador1, contador2;

    //codigo
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession sesion = request.getSession();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet solicitarDosnumeros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
            nombre = request.getParameter("nombre");
            numero1 = Integer.parseInt(request.getParameter("numero1"));
            numero2 = Integer.parseInt(request.getParameter("numero2"));
            suma = request.getParameter("sumar");
            resta = request.getParameter("restar");
            divicion = request.getParameter("dividir");
            multiplicacion = request.getParameter("multiplicar");
            if (numero1 > numero2) {
                numeroMayor = numero1;
                numeroMenor = numero2;
            } else if (numero1 < numero2) {
                numeroMayor = numero2;
                numeroMenor = numero1;
            }
            verPrimos = "";
            for (contador1 = numeroMenor; contador1 <= numeroMayor; contador1++) {
                int conta = 0;
                for (contador2 = 1; contador2 <= contador1; contador2++) {
                    if ((contador1 % contador2) == 0) {
                        conta++;
                    }
                }
                if (conta == 2) {
                    verPrimos += contador1 + ",  ";
                }
            }
            if (nombre.isEmpty()) {
                response.sendRedirect("index.html");
            } else {
                sesion.setAttribute("nombre",nombre);
                Resultado = 0;
                if (suma != null) {
                    Resultado = numero1 + numero2;
                    sesion.setAttribute("suma", Resultado);
                    sesion.setAttribute("verPrimos", verPrimos);
                    response.sendRedirect("suma.jsp");

                } else if (resta != null) {
                    Resultado = numero1 - numero2;
                    sesion.setAttribute("resta", Resultado);
                    sesion.setAttribute("verPrimos", verPrimos);
                    response.sendRedirect("resta.jsp");

                } else if (multiplicacion != null) {
                    Resultado = numero1 * numero2;
                    sesion.setAttribute("multiplicacion", Resultado);
                    sesion.setAttribute("verPrimos", verPrimos);
                    response.sendRedirect("multiplicar.jsp");
                } else if (divicion != null) {
                    Resultado = numero1 / numero2;
                    sesion.setAttribute("dividir", Resultado);
                    sesion.setAttribute("verPrimos", verPrimos);
                    response.sendRedirect("dividir.jsp");
                }
                out.println("<big><h1>Bienvenido:" + "</h1></big>");
                out.println("</body>");
                out.println("</html>");
            }
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
