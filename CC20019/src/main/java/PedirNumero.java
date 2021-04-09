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
 * @author Samuel
 */
public class PedirNumero extends HttpServlet {

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

            String numero1, numero2, nombre, carnet, suma, resta, multiplicacion, divicion, primos = "";
            int contador1, contador2, count = 0, numeroMayor, numeroMenor;
            HttpSession sesion = request.getSession();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPrueba</title>");
            out.println("</head>");
            out.println("<body>");
            nombre = request.getParameter("nombre");
            carnet = request.getParameter("carnet");
            numero1 = request.getParameter("numero1");
            numero2 = request.getParameter("numero2");
            suma = request.getParameter("suma");
            resta = request.getParameter("resta");
            multiplicacion = request.getParameter("multiplicacion");
            divicion = request.getParameter("divicion");

            sesion.setAttribute("nombre", nombre);
            sesion.setAttribute("carnet", carnet);
            sesion.setAttribute("numero1", numero1);
            sesion.setAttribute("numero2", numero2);

            if (Integer.parseInt(numero1) >= Integer.parseInt(numero2)) {
                numeroMayor = Integer.parseInt(numero1);
                numeroMenor = Integer.parseInt(numero2);
            } else {
                numeroMayor = Integer.parseInt(numero2);
                numeroMenor = Integer.parseInt(numero1);
            }

            for (contador1 = numeroMenor; contador1 < numeroMayor; contador1++) {
                count = 0;
                for (contador2 = 1; contador2 <= contador1; contador2++) {
                    if ((contador1 % contador2) == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    primos += contador1+", ";
                }
            }

            int SumaNum = 0;
            if (suma != null) {
                SumaNum = (Integer.parseInt(numero1) + Integer.parseInt(numero2));
                sesion.setAttribute("suma", SumaNum);
                sesion.setAttribute("primos", primos);
                response.sendRedirect("suma.jsp");

            } else if (resta != null) {
                SumaNum = (Integer.parseInt(numero1) - Integer.parseInt(numero2));
                sesion.setAttribute("resta", SumaNum);
                sesion.setAttribute("primos", primos);
                response.sendRedirect("resta.jsp");

            } else if (multiplicacion != null) {
                SumaNum = (Integer.parseInt(numero1) * Integer.parseInt(numero2));
                sesion.setAttribute("multiplicacion", SumaNum);
                sesion.setAttribute("primos", primos);
                response.sendRedirect("multiplicacion.jsp");

            } else if (divicion != null) {
                SumaNum = (Integer.parseInt(numero1) / Integer.parseInt(numero2));
                sesion.setAttribute("divicion", SumaNum);
                sesion.setAttribute("primos", primos);
                response.sendRedirect("divicion.jsp");
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
