
package web.utp.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web.utp.modelo.UsuarioBean;
import web.utp.modeloDAO.UsuarioDAOImpl;


public class ControladorValidar extends HttpServlet {

    UsuarioDAOImpl udao = new UsuarioDAOImpl();
    UsuarioBean ub = new UsuarioBean();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            String correo=request.getParameter("txtcorreo");
            String pssw=request.getParameter("txtpssw");
            ub = udao.validar(correo, pssw);
            if (ub.getCorreo() != null) {
                request.setAttribute("correo", ub);
                request.getRequestDispatcher("Controlador?menu=Home").forward(request, response);
            
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
