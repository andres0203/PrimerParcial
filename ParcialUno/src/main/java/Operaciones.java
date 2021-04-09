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

/**
 *
 * @author br287
 */
public class Operaciones extends HttpServlet {

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
            out.println("<title>Servlet Operaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido " + request.getParameter("user") + "</h1>");
            Double resultado=0.0;
            String Operacion=request.getParameter("Operacion");
            if ("+".equals(Operacion))
            {resultado = Double.parseDouble(request.getParameter("first"))+ Double.parseDouble(request.getParameter("second")) ;
                    out.println("<label>"+request.getParameter("user")+" el resultado de la suma es: " + resultado + "</label>");}
            else if ("-".equals(Operacion))
            {resultado = Double.parseDouble(request.getParameter("first"))- Double.parseDouble(request.getParameter("second")) ;
                    out.println("<label>"+request.getParameter("user")+" el resultado de la resta es: " + resultado + "</label>");}
            else if ("/".equals(Operacion))
            {resultado = Double.parseDouble(request.getParameter("first"))/ Double.parseDouble(request.getParameter("second")) ;
            out.println("<label>"+request.getParameter("user")+" el resultado de la division es: " + resultado + "</label>");}
            else
            {resultado = Double.parseDouble(request.getParameter("first"))* Double.parseDouble(request.getParameter("second")) ;
                    out.println("<label>"+request.getParameter("user")+" el resultado de la multiplicacion es: " + resultado + "</label>");} 
            int first=Integer.parseInt(request.getParameter("first")), second=Integer.parseInt(request.getParameter("second")), contador, a, b, primos, st, nd;
            if (first<0){
                st=0;}
            else{
                st=first;}
            if (second<0){
                nd=0;}
            else{
                nd=second;}
            if (first>second){
                out.println("<br><br><label>");
                primos=0;
                for (a=st;a>=nd;a=a-1){
                    contador=0;
                    for(b=1;b<=a;b=b+1){
                        if (a%b==0){
                            contador=contador+1;
                        }}
                    if (contador==2){
                        out.println("("+a+")");
                        primos=primos+1;}}
                if (primos==0){
                    out.println("No hay numeros primos entre "+first+" y "+second+".</label>");}
                else if (primos==1){
                    out.println("  es el numero primo entre "+first+" y "+second+".</label>");}
                else{
                    out.println("</label><br><label>Estos son los numeros primos entre "+first+" y "+second+".</label>");}}
            else if (second>first){
                out.println("<br><br><label>");
                primos=0;
                for (a=nd;a>=st;a=a-1){
                    contador=0;
                    for(b=1;b<=a;b=b+1){
                        if (a%b==0){
                            contador=contador+1;
                        }}
                    if (contador==2){
                        out.println("("+a+")");
                        primos=primos+1;}}
                if (primos==0){
                    out.println("No hay numeros primos entre "+second+" y "+first+".</label>");}
                else if (primos==1){
                    out.println("  es el numero primo entre "+second+" y "+first+".</label>");}
                else{
                    out.println("</label><br><label>Estos son los numeros primos entre "+second+" y "+first+".</label>");}}
            else{
                contador=0;
                    for(b=1;b<=st;b=b+1){
                        if (st%b==0){
                            contador=contador+1;
                        }}
                if (contador==2){
                    out.println("<br><br><label>El numero "+first+" es un numero primo.");}
                else{
                    out.println("<br><br><label>El numero "+first+" no es un numero primo.");}}
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
