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
public class Controlador extends HttpServlet {
    VideoBean vb = new VideoBean();
    VideoDAOImpl vdao = new VideoDAOImpl();
    ArticuloBean ab = new ArticuloBean();
    ArticuloDAOImpl adao = new ArticuloDAOImpl();
    int ida;
    int idv;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String menu = request.getParameter("menu");
            String accion = request.getParameter("accion");
            if (menu.equals("Home")) {
                request.getRequestDispatcher("Home.jsp").forward(request, response);
            }
            if (menu.equals("Video")) {
                switch(accion){
                    case "Listar":
                        List lista = vdao.listar();
                        request.setAttribute("videos", lista);
                        break;
                        
                    case "Insertar":
                        String usuario = request.getParameter("txtusuario");
                        String titulo = request.getParameter("txttitulo");
                        String categoria = request.getParameter("txtcategoria");
                        String descripcion = request.getParameter("txtdescripcion");
                        String imagen = request.getParameter("txtimagen");
                        String videourl = request.getParameter("txtvideourl");
                        String estado = request.getParameter("txtestado");
                        vb.setId_usuario(Integer.parseInt(usuario));
                        vb.setTitulo(titulo);
                        vb.setCategoria(categoria);
                        vb.setDescripcion(descripcion);
                        vb.setImagen(imagen);
                        vb.setVideo_path(videourl);
                        vb.setEstado(estado);
                        vdao.insertar(vb);
                        
                        
                        request.getRequestDispatcher("Controlador?menu=Video&accion=Listar").forward(request, response);
                        break;
                        
                    case "Editar":
                        idv=Integer.parseInt(request.getParameter("id"));
                        VideoBean vbean = vdao.listarId(idv);
                        request.setAttribute("video", vbean);
                        request.getRequestDispatcher("Controlador?menu=Video&accion=Listar").forward(request, response);
                        break;
                        
                    case "Actualizar":
                        String usuario1 = request.getParameter("txtusuario");
                        String titulo1 = request.getParameter("txttitulo");
                        String categoria1 = request.getParameter("txtcategoria");
                        String descripcion1 = request.getParameter("txtdescripcion");
                        String imagen1 = request.getParameter("txtimagen");
                        String videourl1 = request.getParameter("txtvideourl");
                        String estado1 = request.getParameter("txtestado");
                        vb.setId_usuario(Integer.parseInt(usuario1));
                        vb.setTitulo(titulo1);
                        vb.setCategoria(categoria1);
                        vb.setDescripcion(descripcion1);
                        vb.setImagen(imagen1);
                        vb.setVideo_path(videourl1);
                        vb.setEstado(estado1);
                        vb.setId(idv);
                        vdao.actualizar(vb);
                        request.getRequestDispatcher("Controlador?menu=Video&accion=Listar").forward(request, response);
                        break;
                        
                    case "Eliminar":
                        idv=Integer.parseInt(request.getParameter("id"));
                        vdao.borrar(idv);
                        request.getRequestDispatcher("Controlador?menu=Video&accion=Listar").forward(request, response);
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                request.getRequestDispatcher("Video.jsp").forward(request, response);
            }
            if (menu.equals("Articulo")) {
                switch(accion){
                    case "Listar":
                        List lista = adao.listar();
                        request.setAttribute("articulos", lista);
                        break;
                        
                    case "Insertar":
                        String usuario = request.getParameter("txtusuario");
                        String titulo = request.getParameter("txttitulo");
                        String categoria = request.getParameter("txtcategoria");
                        String descripcion = request.getParameter("txtdescripcion");
                        String url = request.getParameter("txturl");
                        String estado = request.getParameter("txtestado");
                        ab.setId_usuario(Integer.parseInt(usuario));
                        ab.setTitulo(titulo);
                        ab.setCategoria(categoria);
                        ab.setDescripcion(descripcion);
                        ab.setUrl(url);
                        ab.setEstado(estado);
                        adao.insertar(ab);
                        request.getRequestDispatcher("Controlador?menu=Articulo&accion=Listar").forward(request, response);
                        break;
                        
                    case "Editar":
                        ida = Integer.parseInt(request.getParameter("id"));
                        ArticuloBean abean = adao.listarId(ida);
                        request.setAttribute("articulo", abean);
                        request.getRequestDispatcher("Controlador?menu=Articulo&accion=Listar").forward(request, response);                        
                        break;
                        
                    case "Actualizar":
                        String usuario1 = request.getParameter("txtusuario");
                        String titulo1 = request.getParameter("txttitulo");
                        String categoria1 = request.getParameter("txtcategoria");
                        String descripcion1 = request.getParameter("txtdescripcion");
                        String url1 = request.getParameter("txturl");
                        String estado1 = request.getParameter("txtestado");
                        ab.setId_usuario(Integer.parseInt(usuario1));
                        ab.setTitulo(titulo1);
                        ab.setCategoria(categoria1);
                        ab.setDescripcion(descripcion1);
                        ab.setUrl(url1);
                        ab.setEstado(estado1);
                        ab.setId(ida);
                        adao.actualizar(ab);
                        request.getRequestDispatcher("Controlador?menu=Articulo&accion=Listar").forward(request, response);
                        break;
                        
                    case "Eliminar":
                        ida=Integer.parseInt(request.getParameter("id"));
                        adao.borrar(ida);
                        request.getRequestDispatcher("Controlador?menu=Articulo&accion=Listar").forward(request, response);
                        break; 
                   default:
                        throw new AssertionError();
                }
                request.getRequestDispatcher("Articulo.jsp").forward(request, response);
                
            }
            if (menu.equals("Otros")) {
                request.getRequestDispatcher("Otros.jsp").forward(request, response);
            }
            if (menu.equals("Miperfil")) {
                request.getRequestDispatcher("Miperfil.jsp").forward(request, response);
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
