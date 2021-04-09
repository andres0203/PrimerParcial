/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Akamegakill
 */
public class OperacionServlet extends HttpServlet {

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
 /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogeoServlet</title>");
            out.println("</head>");
            out.println("<body>");*/
            String numero_1 = request.getParameter("numero1"), numero_2 = request.getParameter("numero2"), suma = request.getParameter("sumar"), resta = request.getParameter("restar"), multiplicacion = request.getParameter("multiplicar"), division = request.getParameter("dividir");
            HttpSession sesion2 = request.getSession();
            int resultado = 0;
            int[] numeros_Primos;
            String numerosPrimos = "", imprimirResultado = "";
            if (numero_1.isEmpty() || numero_2.isEmpty()) {
                out.println("<meta http-equiv='refresh' content='0;URL=NumeroEnBlanco.jsp'>");
            } else {
                if (suma != null) {
                    resultado = Integer.parseInt(numero_1) + Integer.parseInt(numero_2);
                    imprimirResultado = "suma es: " + resultado;
                }
                if (resta != null) {
                    resultado = Integer.parseInt(numero_1) - Integer.parseInt(numero_2);
                    imprimirResultado = "resta es: " + resultado;
                }
                if (multiplicacion != null) {
                    resultado = Integer.parseInt(numero_1) * Integer.parseInt(numero_2);
                    imprimirResultado = "multiplicación es: " + resultado;
                }
                if (division != null) {
                    resultado = Integer.parseInt(numero_1) / Integer.parseInt(numero_2);
                    imprimirResultado = "división es: " + resultado;
                }

                /*out.println("El resultado es: " + resultado);
            out.println("<br>");
            out.println("Los numeros primos son:");
            out.println("<br>");*/
                //Obteniendo numero primo
                int contador = 0, contadorVector = 0;
                /*for (int i = Integer.parseInt(numero_1); i <= Integer.parseInt(numero_2); i++) {
                    int div = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            div++;
                        }
                    }
                    if (div == 2) {
                        numerosPrimos = numerosPrimos + i + ",";
                        contador++;
                    }
                }*/

                if (Integer.parseInt(numero_1) < Integer.parseInt(numero_2)) {
                    for (int i = Integer.parseInt(numero_1); i <= Integer.parseInt(numero_2); i++) {
                        int div = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                div++;
                            }
                        }
                        if (div == 2) {
                            contador++;
                        }
                    }
                } else {
                    for (int i = Integer.parseInt(numero_2); i <= Integer.parseInt(numero_1); i++) {
                        int div = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                div++;
                            }
                        }
                        if (div == 2) {
                            contador++;
                        }
                    }
                }

                numeros_Primos = new int[contador];

                if (Integer.parseInt(numero_1) < Integer.parseInt(numero_2)) {
                    for (int i = Integer.parseInt(numero_1); i <= Integer.parseInt(numero_2); i++) {
                        int div = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                div++;
                            }
                        }
                        if (div == 2) {
                            numeros_Primos[contadorVector] = i;
                            contadorVector++;
                        }
                    }
                } else {
                    for (int i = Integer.parseInt(numero_2); i <= Integer.parseInt(numero_1); i++) {
                        int div = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                div++;
                            }
                        }
                        if (div == 2) {
                            numeros_Primos[contadorVector] = i;
                            contadorVector++;
                        }
                    }
                }

                for (int i = contador - 1; i >= 0; i--) {
                    numerosPrimos = numerosPrimos + numeros_Primos[i] + ",";
                }
                sesion2.setAttribute("imprimirResultado", imprimirResultado);
                sesion2.setAttribute("numerosPrimos", numerosPrimos);
                out.println("<meta http-equiv='refresh' content='0;URL=Resultado.jsp'>");
            }
            /*out.println("<br>");
            out.println("El total de numeros primos es: " + contador);
            out.println("</body>");
            out.println("</html>");*/
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
