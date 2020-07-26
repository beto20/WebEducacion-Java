
package web.utp.controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web.utp.modelo.ArticuloBean;
import web.utp.modelo.VideoBean;
import web.utp.modeloDAO.ArticuloDAOImpl;
import web.utp.modeloDAO.VideoDAOImpl;

public class ControladorCurso extends HttpServlet {
        VideoBean vb = new VideoBean();
        VideoDAOImpl vdao =  new VideoDAOImpl();
        ArticuloBean ab = new ArticuloBean();
        ArticuloDAOImpl adao = new ArticuloDAOImpl();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String categoria = request.getParameter("categoria");
            List listarcategoriavideo = vdao.listarXcategoria(categoria);
            List listarcategoriaarticulo = adao.listarXcategoria(categoria);
            
            
            switch(categoria){
                case "Matematica":
                    //List listarcategoria = vdao.listarXcategoria(categoria);
                    request.setAttribute("videocategoria", listarcategoriavideo );
                    request.setAttribute("articulocategoria", listarcategoriaarticulo );
                    request.getRequestDispatcher("Matematica.jsp").forward(request, response);
                    break;
                case "Ingles":
                    //List listarcategoria = vdao.listarXcategoria(categoria);
                    request.setAttribute("videocategoria", listarcategoriavideo );
                    request.setAttribute("articulocategoria", listarcategoriaarticulo );
                    request.getRequestDispatcher("Ingles.jsp").forward(request, response);
                        break;
                case "Lenguaje":
                    //List listarcategoria = vdao.listarXcategoria(categoria);
                    request.setAttribute("videocategoria", listarcategoriavideo );
                    request.setAttribute("articulocategoria", listarcategoriaarticulo );
                    request.getRequestDispatcher("Lenguaje.jsp").forward(request, response);
                    break;
                case "Historia":
                    //List listarcategoria = vdao.listarXcategoria(categoria);
                    request.setAttribute("videocategoria", listarcategoriavideo );
                    request.setAttribute("articulocategoria", listarcategoriaarticulo );
                    request.getRequestDispatcher("Historia.jsp").forward(request, response);
                    break;
                case "Geografia":
                    //List listarcategoria = vdao.listarXcategoria(categoria);
                    request.setAttribute("videocategoria", listarcategoriavideo );
                    request.setAttribute("articulocategoria", listarcategoriaarticulo );
                    request.getRequestDispatcher("Geografia.jsp").forward(request, response);
                    break;
                case "Biologia":
                    //List listarcategoria = vdao.listarXcategoria(categoria);
                    request.setAttribute("videocategoria", listarcategoriavideo );
                    request.setAttribute("articulocategoria", listarcategoriaarticulo );
                    request.getRequestDispatcher("Biologia.jsp").forward(request, response);
                    break;
                default:
                    break;
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
    }

}
