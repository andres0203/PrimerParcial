package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class serve extends HttpServlet {

    /*by aviles moran*/

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int a = Integer.parseInt(String.valueOf(request.getParameter("n_a")));
        int b = Integer.parseInt(String.valueOf(request.getParameter("n_b")));
        
        request.setAttribute("suma", suma(a, b));
        request.setAttribute("resta", resta(a, b));
        request.setAttribute("producto", producto(a, b));
        request.setAttribute("primos", primos(a, b));
        request.getRequestDispatcher("bienvenido.jsp").forward(request, response);
    }
    
    public double suma(int a,int b){
        return a+b;
    }
    
    public double resta(int a,int b){
        return a-b; 
    }
     
    public double producto(int a,int b){
        return a*b;
    }
    
    public int[] primos(int a_, int b_) {
        if(a_>0 && b_>0){
          int a ,b ;
        if(a_>b_){
        a=b_;
        b=a_;
        }else{
            a=a_;
            b=b_;
        }
        ArrayList<Integer> primos = new ArrayList<>();//para almacenar cualquier cant de elementos
        int[] cambio_orden;
        boolean valido;
        valido = true;
        for (int i = a; i < b; i++) {
            for (int j = 2; j < i; j++) {
                if ((i % j != 0)) {
                    valido = true;
                } else {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                primos.add(i);
            }
        }

        cambio_orden = new int[primos.size()];
        int cant = (cambio_orden.length - 1);
        for (int i = 0; i < cambio_orden.length; i++) {
            cambio_orden[i] = primos.get(cant);
            cant--;
        }
        return cambio_orden;  
        }else{
            return null;
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
