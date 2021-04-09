/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.bueno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "nuevo", urlPatterns = {"/nuevo"})
public class nuevo extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones aritmeticas</title>");
            out.println("</head>");
            out.println("<body>");
            String usuario = request.getParameter("usuario");
            String numero1 = request.getParameter("numero1");
            String numero2 = request.getParameter("numero2");
            String suma = request.getParameter("suma");
            String resta = request.getParameter("resta");
            String multi = request.getParameter("mult");
            String divi = request.getParameter("div");

            NUMEROSPRIMOS primos = new NUMEROSPRIMOS();// llamamos la clase o metodo

            int array[] = primos.Lista(Integer.parseInt(numero1), Integer.parseInt(numero2));//ingresamos parametros y convertimos

            primos.regresa(array);//me los haga desendente

            String Nprimos = "";//creamos un strinf vacio

            int index = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    Nprimos += array[i];

                } else {
                    Nprimos += array[i] + "-";
                }

            }
            if (suma != null && resta != null && multi != null && divi != null) {//todos
                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                float ResultadoDiv = Float.parseFloat(numero1) / Float.parseFloat(numero2);

                out.println(""
                        + "<h1 >Bienvenido " + usuario + "</h1>");
                out.println("<body >Sus calculos son los Siguientes: <br>"
                        + "1.Su Suma es: " + ResultadoSuma + "<br>"
                        + "2.Su Resta es: " + ResultadoResta + "<br>"
                        + "3.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "4.Su Division es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma != null && resta != null && multi != null && divi == null) {//divicion no
                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);

                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: "
                        + "1.Su Suma es: " + ResultadoSuma + "<br>"
                        + "2.Su Resta es: " + ResultadoResta + "<br>"
                        + "3.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");

            } else if (suma != null && resta != null && multi == null && divi != null) {//mult no
                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                int ResultadoDiv = Integer.parseInt(numero1) / Integer.parseInt(numero2);

                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Suma es: " + ResultadoSuma + "<br>"
                        + "2.Su Resta es: " + ResultadoResta + "<br>"
                        + "3.Su Divicion es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (resta != null && multi != null && divi != null && suma == null) {//suma no

                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                int ResultadoDiv = Integer.parseInt(numero1) / Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Resta es: " + ResultadoResta + "<br>"
                        + "2.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "3.Su Division es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (resta == null && multi != null && divi != null && suma != null) {//resta no

                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                int ResultadoDiv = Integer.parseInt(numero1) / Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Suma es: " + ResultadoSuma + "<br>"
                        + "2.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "3.Su Division es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio</b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma != null && resta != null && multi == null && divi == null) {//multiplicacion y divicion no
                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);

                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Suma es: " + ResultadoSuma + "<br>"
                        + "2.Su Resta es: " + ResultadoResta + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma == null && resta != null && multi == null && divi != null) {//mult y suma no 

                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);

                int ResultadoDiv = Integer.parseInt(numero1) / Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Resta es: " + ResultadoResta + "<br>"
                        + "2.Su Division es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma != null && resta == null && multi == null && divi != null) {//mult y resta no 

                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);

                int ResultadoDiv = Integer.parseInt(numero1) / Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Suma es: " + ResultadoSuma + "<br>"
                        + "2.Su Division es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma == null && resta != null && multi != null && divi == null) {//divicion y suma no 

                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);

                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Resta es: " + ResultadoResta + "<br>"
                        + "2.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (multi != null && divi != null && suma == null && resta == null) {//suma y resta no

                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                int ResultadoDiv = Integer.parseInt(numero1) / Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "2.Su Division es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (multi != null && divi == null && suma != null && resta == null) {//resta y divion no

                int ResultadoMult = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>");
                out.println("Sus calculos son los Siguientes: <br>"
                        + "1.Su Multiplicacion es: " + ResultadoMult + "<br>"
                        + "2.Su Suma es: " + ResultadoSuma + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma != null && resta == null && multi == null && divi == null) {//solo suma
                int ResultadoSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println("<h1>Bienvenido " + usuario + "</h1>"
                        + "Sus calculos son los Siguientes: <br>"
                        + "<br>"
                        + "Su Suma es: " + ResultadoSuma + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");

            } else if (suma == null && resta != null && multi == null && divi == null) {//solo resta
                int ResultadoResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                out.println("Bienvenido" + usuario);
                out.println("Sus calculos son los Siguientes: <br>"
                        + "<br>"
                        + "Su Resta es:  " + ResultadoResta + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma == null && resta == null && multi != null && divi == null) {//solo multi
                int ResultadoMult = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println("Bienvenido" + usuario);
                out.println("Sus calculos son los Siguientes: <br>"
                        + "<br>"
                        + "1.Su Multiplicacion  es: " + ResultadoMult + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma == null && resta == null && multi == null && divi != null) {//solo divicion
                int ResultadoDiv = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println("Bienvenido" + usuario);
                out.println("Sus calculos son los Siguientes: <br>"
                        + "<br>"
                        + "1.Su Divicion es: " + ResultadoDiv + "<br>"
                        + "<h2>Numeros primos</h2>"
                        + "<br>"
                        + "<br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            } else if (suma == null && resta == null && multi == null && divi == null) {//solo divicion

                out.println("Bienvenido" + usuario + "<br>");
                out.println("Selecione al menos una operacion aritmetica<br>"
                        + "<br>"
                        + "<br>"
                        + " <br>" + Nprimos + "<br>"
                        + "<br><font size=+2><b></font>Inicio </b><a href=index.html> Click aqui</a></br></body>");
            }
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
