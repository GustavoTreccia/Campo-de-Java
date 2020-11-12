
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.negocio.Adicao;
import java.negocio.Divisao;
import java.negocio.ICalculo;
import java.negocio.Multiplicacao;
import java.negocio.Subtracao;

/**
 *
 * 
 */
@WebServlet(name = "ServletCalculadora", urlPatterns = {"/Calculadora"})
public class ServletCalculadora extends HttpServlet {

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
            out.println("<title>Servlet Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora com Servlet</h1>");
            
            out.println("<form action='' method='get'>");
            out.println("<label for='valor1'>Valor 1: </label>");
            out.println("<input type='text' id='valor1' name='valor1' />");
            out.println("<label for='valor2'>Valor 2: </label>");
            out.println("<input type='text' id='valor2' name='valor2' />");
            out.println("<br><br><input type='submit' name='btnCalcular' value='+'>");
            out.println("<input type='submit' name='btnCalcular' value='-'>");
            out.println("<input type='submit' name='btnCalcular' value='x'>");
            out.println("<input type='submit' name='btnCalcular' value='/'>");
            out.println("</form>");
            
            if (request.getParameter("valor1").length() > 0 &&
                request.getParameter("valor2").length() > 0){
                // recebe os 2 valores e os converte para float
                float valor1 = Float.parseFloat(request.getParameter("valor1"));
                float valor2 = Float.parseFloat(request.getParameter("valor2"));
                ICalculo objCalc = null;
                // instancia o objeto de acordo com o botão selecionado
                switch(request.getParameter("btnCalcular")){
                    case "+": objCalc = new Adicao(valor1, valor2); break;
                    case "-": objCalc = new Subtracao(valor1, valor2); break;
                    case "x": objCalc = new Multiplicacao(valor1, valor2); break;
                    case "/": objCalc = new Divisao(valor1, valor2); break;
                }
                // apresenta o resultado de acordo com o objeto instanciado
                out.println(String.format("<h2>Resultado: %.2f</h2>", objCalc.calcular()));
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
