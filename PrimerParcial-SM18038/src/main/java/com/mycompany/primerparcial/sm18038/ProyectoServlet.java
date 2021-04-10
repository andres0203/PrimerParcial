package com.mycompany.primerparcial.sm18038;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Adrián Sandoval
 */
public class ProyectoServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcualdora</title>");
            out.println("</head>");
            out.println("<body bgcolor=\" #c5cae9 \"> ");
            //Variables
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));
            String opcionSumar = request.getParameter("btnSumar");
            String opcionRestar = request.getParameter("btnRestar");
            String opcionMultiplicar = request.getParameter("btnMultiplicar");
            String opcionDividir = request.getParameter("btnDividir");
            String nombre = request.getParameter("nombre");

            int resultado = 0;
            int mayor = 0;
            int menor = 0;

            //Realizar las operaciones
            out.println("</br><center>");

            if (opcionSumar != null) {
                resultado = numero1 + numero2;
                out.println("<h1>" + "¡" + nombre + " el resultado de la Suma es: " + resultado + "!" + "</h1>");
            } else if (opcionRestar != null) {
                resultado = numero1 - numero2;
                out.println("<h1>" + "¡" + nombre + " el resultado de la Resta es: " + resultado + "!" + "</h1>");
            } else if (opcionMultiplicar != null) {
                resultado = numero1 * numero2;
                out.println("<h1>" + "¡" + nombre + " el resultado de la Multiplicación es: " + resultado + "!" + "</h1>");
            } else if (opcionDividir != null) {
                resultado = numero1 / numero2;
                out.println("<h1>" + "¡" + nombre + " el resultado de la División es: " + resultado + "!" + "</h1>");
            }

            //Mostrar numeros primos
            String primos = "";
            if (numero1 > numero2) {
                mayor = numero1;
                menor = numero2;
            } else {
                mayor = numero2;
                menor = numero1;
            }
            for (int i = mayor; i > menor; i--) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    primos += i + " , ";
                }
               
                if (i==7) {
                    primos += i + " , ";
                }
                if (i==5) {
                    primos += i + " , ";
                }
                if (i==3) {
                    primos += i + " , ";
                }
                if (i==2) {
                    primos += i + "  ";
                }
            }
            out.println("<h2>");
            out.println("Números primos en el rango ingresado:  " +primos);
            out.println("</h2>");

            out.println("</center");
            out.println("</body>");
            out.println("</html>");
        }
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
