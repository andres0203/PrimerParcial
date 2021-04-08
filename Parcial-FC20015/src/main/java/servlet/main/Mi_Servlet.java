package servlet.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Mi_Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");

        int numero1 = Integer.parseInt(request.getParameter("numero-1"));

        int numero2 = Integer.parseInt(request.getParameter("numero-2"));

        String opcion = request.getParameter("opciones");

        double resultadoNumerico = 0;

        String numerosPrimos = "";

        String enunciado = "";

        switch (opcion) {

            case "sumar":

                enunciado = "La suma de " + numero1 + " y " + numero2 + " es: ";

                resultadoNumerico = numero1 + numero2;

                //resultado = resultadoNumerico + "";

                numerosPrimos = obtenerPrimos(numero1, numero2);

                break;

            case "restar":

                enunciado = "La resta de " + numero1 + " y " + numero2 + " es: ";

                resultadoNumerico = numero1 - numero2;

                numerosPrimos = obtenerPrimos(numero1, numero2);

                break;

            case "multiplicar":

                enunciado = "La multipicación de " + numero1 + " y " + numero2 + " es: ";

                resultadoNumerico = numero1 * numero2;

                //resultado = resultadoNumerico + "";

                numerosPrimos = obtenerPrimos(numero1, numero2);

                break;

            case "dividir":

                if (numero2 == 0) {

                    enunciado = "No es posible dividir entre 0  :(";

                    numerosPrimos = obtenerPrimos(numero1, numero2);

                } else {

                    enunciado = "La división de " + numero1 + " y " + numero2 + " es: ";
                    
                    double num1 = numero1;
                    double num2 = numero2;
                    resultadoNumerico = (num1 / num2);

                    //resultado = resultadoNumerico + "";

                    numerosPrimos = obtenerPrimos(numero1, numero2);
                }
                break;
        }

        HttpSession session = request.getSession();

        session.setAttribute("nombre", nombre);
        session.setAttribute("numero1", numero1);
        session.setAttribute("numero2", numero2);
        session.setAttribute("resultado", resultadoNumerico);
        session.setAttribute("primos", numerosPrimos);
        session.setAttribute("enunciado", enunciado);

        response.sendRedirect("respuesta.jsp");

    }

    public String obtenerPrimos(int num1, int num2) {

        String primos = "";

        int mayor, menor;

        if (num1 > num2) {

            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        for (int i = mayor; i >= menor; i--) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                
                primos += i + ", ";
            }
        }

        if (primos.equals("")) {

            primos = "No hay números primos en ese intervalo";
        }
        
        if(primos.charAt(primos.length()-1) == ','){
            
            primos = primos.substring(0, primos.length()-1);
        }
        
        return primos;
    }
}
