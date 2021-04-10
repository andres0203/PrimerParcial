
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mh19029
 */
public class PrimerParcial_mh19029 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String nom;
    int primerNum,segundoNum;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PrimerParcial_mh19029</title>");            
            out.println("</head>");
            out.println("<body>");
            nom=request.getParameter("NombreDeUsuario");
            primerNum=Integer.parseInt(request.getParameter("primerNum"));
            segundoNum=Integer.parseInt(request.getParameter("segundoNum"));
            
            String salida="";
            String respuesta=null;
            String suma=request.getParameter("suma");
            String resta=request.getParameter("resta");
            String mult=request.getParameter("mult");
            String div=request.getParameter("div");
            
            //operaciones aritmeticas 
            if(suma!=null){
                respuesta="suma de los números ingresados es: "+(primerNum+segundoNum);
            }else if(resta!=null){
                respuesta="resta de los números ingresados es: "+(primerNum-segundoNum);
            }else if(mult!=null){
                respuesta="multiplicación de los números ingresados es: "+(primerNum*segundoNum);
            }else{
                respuesta="division de los números ingresados es: "+(primerNum/segundoNum);
            }
            int numMenor, numMayor;
            if(primerNum>0 && segundoNum>0){
                numMenor=(primerNum<segundoNum)?primerNum:segundoNum;
                numMayor=(primerNum>segundoNum)?primerNum:segundoNum;
                for(int j=numMenor;j<=numMayor;j++){
                    if(numPrimo(j)){//accion del metodo
                        salida+=j+" ";
                    }
                }
                String acumulNum[]=salida.split(" ");salida="";//split para guardar los numeros primos
                for (int i=acumulNum.length-1;i>=0;i--){
                    salida+=acumulNum[i]+" , ";
                }
            }else{
                salida+="No se puede mostras los números primos en el rango de los números ingresados ya que uno de ellos es un número negativo";
            }
            
            
            out.println("<h1>Bienvenido "+nom+" :D</h1>");
            out.println("<h3> El resultado de la "+respuesta+"<h3>");
            out.println("<h3>Los números primos encontrados en el rango de los dos números ingresados son: "+salida+"</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    //metodo numeros primos
    public boolean numPrimo(int numeroPrimo){
        if(numeroPrimo==0 || numeroPrimo==1 || numeroPrimo==4){
            return false;
        }
        for(int contador=2;contador<(numeroPrimo/2);contador++){
            if(numeroPrimo%contador==0){
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
