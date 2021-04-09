/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alfa
 */
public class operacion1 extends HttpServlet {

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
       
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet operacion1</title>");            
            out.println("</head>");
            out.println("<body>");
            String nombreS;
            nombreS = request.getParameter("nombreSE");
            String numero1 = request.getParameter("numeros1");
            String numero2 = request.getParameter("numeros2");
            String suma = request.getParameter("Sumar");
            String resta = request.getParameter("Restar");
            int resultado = 0;
            if (suma != null) {
                resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
               out.println(nombreS+"El resultado de la suma es " + resultado);
                int contador=0;
                out.println("<div></div>");
                out.println("Los numeros primos que estan en ese rango son: ");
                out.println("<div></div>");
                for (int i1 = resultado; i1 >= 2; i1--) {
                    out.println("<div></div>");
                    for (int i2 = i1; i2 >= 1; i2--) {
                        if ((i1%i2)==0) {
                            contador=contador+1;
                            
                        }
                    }
                    if (contador==2) {
                        out.print(i1);
                    }
                    contador=0;
                }
                 if (resultado<0) {
                out.println("los numeros negativos no tienen primos ");
            }

            } else {
                resultado = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                out.println(nombreS+"El resultado de la resta es " + resultado);
               int contador=0;
                out.println("<div></div>");
                out.println("Los numeros primos que estan en ese rango son: ");
                out.println("<div></div>");
                for (int i1 = resultado; i1 >= 2; i1--) {
                    out.println("<div></div>");
                    for (int i2 = i1; i2 >= 1; i2--) {
                        if ((i1%i2)==0) {
                            contador=contador+1;
                            
                        }
                    }
                    if (contador==2) {
                        out.print(i1);
                    }
                    contador=0;
                }
            }
            if (resultado<0) {
                out.println("los numeros negativos no tienen primos ");
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
