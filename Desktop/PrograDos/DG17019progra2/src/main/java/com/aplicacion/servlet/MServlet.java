/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel Duarte
 */
public class MServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            String Nombre= request.getParameter("txtNombre");
            String num1= request.getParameter("txtNum1");
            String num2= request.getParameter("txtNum2");
            String btnSumar= request.getParameter("btnSumar");
            String btnRestar= request.getParameter("btnRestar");
            String btnMultiplicar= request.getParameter("btnMultiplicar");
            String btnDividir= request.getParameter("btnDividir");
           
            if (btnSumar!=null) {
                double resultado= Double.parseDouble(num1)+ Double.parseDouble(num2);
                out.println("hola"+Nombre);
                out.println("el resultado de la suma es :"+resultado);
            }
            if (btnRestar!=null) {
               double resultado= Double.parseDouble(num1)- Double.parseDouble(num2);
                out.println("hola"+Nombre);
                out.println("el resultado de la resta es : "+resultado);
            }
            if (btnMultiplicar!=null) {
               double resultado= Double.parseDouble(num1)* Double.parseDouble(num2);
                out.println("hola"+Nombre);
                out.println("el resultado de la Multiplicacion es : "+resultado);
            }
            if (btnDividir!=null) {
               double resultado= Double.parseDouble(num1)/Double.parseDouble(num2);
                out.println("hola"+Nombre);
                out.println("el resultado de la Division es : "+resultado);
            }
            
             out.println("Ingrese su nombre para ejecutar las operaciones");
            
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
