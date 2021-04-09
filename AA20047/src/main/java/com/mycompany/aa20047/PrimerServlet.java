/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aa20047;

import com.mycompany.aa20047.Primos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fermi24
 */
public class PrimerServlet extends HttpServlet {
Primos numeroPrimo = new Primos();
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
            out.println("<title>Servlet PrimerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet PrimerServlet at " + request.getContextPath() + "</h1>");

            String nombre = request.getParameter("Nombre");
            String primerNumero = request.getParameter("primerNumero");
            String segundoNumero = request.getParameter("segundoNumero");
            String botonSuma = request.getParameter("botonSuma");
            String botonResta = request.getParameter("botonResta");
            String botonMultiplicacion = request.getParameter("botonMultiplicacion");
            String botonDivision = request.getParameter("botonDivision");
            int contador = 0, numero = 0;
            double resultado;
            Scanner sc = new Scanner(System.in);
            //boolean esPrimo;

            if (botonSuma != null) {
                resultado = Double.parseDouble(primerNumero) + Double.parseDouble(segundoNumero);
                out.println(nombre + ". El resultado de la suma (" + primerNumero + ") + (" + segundoNumero + ") es : " + resultado + "\n");
                out.println("<br>");
                //out.println("Holamundo");
                out.println("Los numeros primos entre "+primerNumero+" y "+segundoNumero+" son :");
                for (int x = Integer.parseInt(segundoNumero); x >= Integer.parseInt(primerNumero); x--) {
                    //out.println("Holamundo2");
                    if (this.numeroPrimo.esPrimo(x) == true) {
                        contador++;
                        //
                        out.println("<br>");
                        out.println(String.valueOf(x));
                    }
                }
                
                out.println("<br>");
                
                
                
                out.println("\nTotal de numeros primos: " + contador);
                sc.close();
            }

            if (botonResta != null) {
               // out.println("<h1>Bienvenido de nuevo "+nombre+" </h1>");
                resultado = Double.parseDouble(primerNumero) - Double.parseDouble(segundoNumero);
                out.println(nombre + ". El resultado de la resta (" + primerNumero + ") - (" + segundoNumero + ") es : " + resultado);
                
                out.println("<br>");
                //out.println("Holamundo");
                out.println("Los numeros primos entre "+primerNumero+" y "+segundoNumero+" son :");
                for (int x = Integer.parseInt(segundoNumero); x >= Integer.parseInt(primerNumero); x--) {
                    //out.println("Holamundo2");
                    if (this.numeroPrimo.esPrimo(x) == true) {
                        contador++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }
                
                out.println("<br>");
                
                
                
                out.println("\nTotal de numeros primos: " + contador);
                sc.close();
            }

            if (botonMultiplicacion != null) {
                resultado = Double.parseDouble(primerNumero) * Double.parseDouble(segundoNumero);
                out.println(nombre + ". El resultado de la multiplicacion (" + primerNumero + ") * (" + segundoNumero + ") es : " + resultado);
                
                out.println("<br>");
                //out.println("Holamundo");
                out.println("Los numeros primos entre "+primerNumero+" y "+segundoNumero+" son :");
                for (int x = Integer.parseInt(segundoNumero); x >= Integer.parseInt(primerNumero); x--) {
                    //out.println("Holamundo2");
                    if (this.numeroPrimo.esPrimo(x) == true) {
                        contador++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }
                
                
                out.println("<br>");
                
                
                out.println("\nTotal de numeros primos: " + contador);
                sc.close();
            }

            if (botonDivision != null) {
                if (Integer.parseInt(segundoNumero) != 0) {
                    resultado = Double.parseDouble(primerNumero) / Double.parseDouble(segundoNumero);
                    out.println(nombre + ". El resultado de la division (" + primerNumero + ") ÷ (" + segundoNumero + ") es : " + resultado);
                    
                    out.println("<br>");
                //out.println("Holamundo");
                out.println("Los numeros primos entre "+primerNumero+" y "+segundoNumero+" son :");
                for (int x = Integer.parseInt(segundoNumero); x >= Integer.parseInt(primerNumero); x--) {
                    //out.println("Holamundo2");
                    if (this.numeroPrimo.esPrimo(x) == true) {
                        contador++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }
                
                
                out.println("<br>");
                
                
                out.println("\nTotal de numeros primos: " + contador);
                sc.close();
                } else {
                    out.println(nombre + ". No se puede realizar la division puesto que el segundo numero es 0");
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

    private boolean esPrimo(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
