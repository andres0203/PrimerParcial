/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cm19086;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ronal
 */
public class PrimerParcial extends HttpServlet {

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
            out.println("<title>Servlet PrimerParcial</title>");            
            out.println("</head>");
            out.println("<body>");
            String nom=request.getParameter("nameUsuario");
            int numUno=Integer.parseInt(request.getParameter("numUno"));
            int numDos=Integer.parseInt(request.getParameter("numDos"));
            String salida="";
            String resultado=null;
            String suma=request.getParameter("suma");
            String resta=request.getParameter("resta");
            String mult=request.getParameter("mult");
            String divi=request.getParameter("divi");
            
            if(suma!=null){
                resultado="suma es: "+(numUno+numDos);
            }else if(resta!=null){
                resultado="resta es: "+(numUno-numDos);
            }else if(mult!=null){
                resultado="multiplicación es: "+(numUno*numDos);
            }else{
                resultado="division es: "+(numUno/numDos);
            }
            int inf, sup;
            if((numUno>0 && numDos>0) && numUno!=numDos){
                inf=(numUno<numDos)?numUno:numDos;
                sup=(numUno>numDos)?numUno:numDos;
                for(int x=inf;x<=sup;x++){
                    if(numPrimo(x)){
                        salida+=x+" ";
                    }
                }
                String caja[]=salida.split(" ");salida="Los números primos entre los números "+inf+" y "+sup+" son: ";
                salida+="<br>";
                for (int i=caja.length-1;i>=0;i--){
                    salida+=caja[i]+" | ";
                }
            }else if(numUno==numDos){
                salida+="No se pudo encontrar los números primos debido a que los números ingresados son iguales";
            }else{
                salida+="No se pudo encontrar los números primos debido a que ingreso un número negativo";
            }
            
            
            out.println("<h1>"+nom+" el resultado de la "+resultado+"</h1>");
            out.println("<h2>"+salida+"</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    public boolean numPrimo(int numero){
        if(numero==0 || numero==1 || numero==4){
            return false;
        }
        for(int x=2;x<numero/2;x++){
            if(numero%x==0){
                return false;
            }
        }
        return true;
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
