package jonathancastaneda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonathan Oswaldo Castaneda Fabián(CF20014)
 */
public class ServletBienvenida extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int opcion=0, resultado=0;
    String operacion="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bienvenida</title>");            
            out.println("</head>");
            out.println("<body>");
            opcion=0;
            operacion="";
            opcion= Integer.parseInt(request.getParameter("opcion"));
            if (opcion==1){
            resultado=Integer.parseInt(request.getParameter("numero1"))+Integer.parseInt(request.getParameter("numero2"));
            operacion="Suma";
            }
            else if(opcion==2){
            resultado=Integer.parseInt(request.getParameter("numero1"))-Integer.parseInt(request.getParameter("numero2"));
            operacion="Resta";
            }
            else if (opcion==3){
            resultado=Integer.parseInt(request.getParameter("numero1"))*Integer.parseInt(request.getParameter("numero2"));
            operacion="Multi´licacion";
            }
            else if (opcion==4){
            resultado=Integer.parseInt(request.getParameter("numero1"))/Integer.parseInt(request.getParameter("numero2"));
            operacion="Division";
            }
            out.println("<h1>Bienvenido " + request.getParameter("nombre") + "</h1>");
            out.println(request.getParameter("nombre")+" el resultado de la "+operacion+" de "+request.getParameter("numero1")+" y "+request.getParameter("numero2")+" es: "+resultado);
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
