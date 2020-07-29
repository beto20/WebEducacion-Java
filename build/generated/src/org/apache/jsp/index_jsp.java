package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import web.utp.modelo.VideoBean;
import web.utp.modeloDAO.VideoDAOImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>e Learning</title>\n");
      out.write("    <meta name=\"description\" content=\"Curso de Elearning\">\n");
      out.write("    <meta name=\"author\" content=\"Curso de Elearning\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600italic,600,700italic,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,500,300italic,300,100,500italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\" id=\"wrapper\">\n");
      out.write("        <header>\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <div class=\"navbar-wrapper\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"navwrapper\">\n");
      out.write("                            <div class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"logo\"><a href=\"index.jsp\"><img src=\"images/logo.png\" class=\"img-responsive\" alt=\"logo\"></a></div>\n");
      out.write("                                    <nav class=\"navArea\">\n");
      out.write("                                        <div class=\"navbar-header\">\n");
      out.write("                                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"navbar-collapse collapse\">\n");
      out.write("                                            <ul class=\"nav navbar-nav\" id=\"navigation\">\n");
      out.write("                                                <li class=\"menuItem\" id=\"home\"><a href=\"#wrapper\">Inicio</a></li>\n");
      out.write("                                                <li class=\"menuItem\"><a href=\"#aboutus\">Nosotros</a></li>\n");
      out.write("                                                <li class=\"menuItem\"><a href=\"#courses\">Cursos</a></li>\n");
      out.write("                                              <!--  <li class=\"menuItem\"><a href=\"#contact\">Contacto</a></li>-->\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"banner row\" id=\"banner\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6 col-md-12 col-lg-12 noPadd slides-container\" style=\"height:100%\">\n");
      out.write("                        <div class=\"slide\">\n");
      out.write("                            <div class=\"container hedaer-inner\">\n");
      out.write("                                <div class=\"bannerText\">\n");
      out.write("                                    <h3>Take great online courses from any where in the world</h3>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <img src=\"images/slider/image01.jpg\" alt=\"image01\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slide\">\n");
      out.write("                            <div class=\"container hedaer-inner\">\n");
      out.write("                                <div class=\"bannerText\">\n");
      out.write("                                    <h3>Take great online courses from any where in the world</h3>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <img src=\"images/slider/image02.jpg\" alt=\"image02\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container form-header\">\n");
      out.write("                <div class=\"form-container\">\n");
      out.write("                    <h2>Solicitar Información</h2>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <form method=\"post\" action=\"\" name=\"\" id=\"\">\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row\">\n");
      out.write("                                <input type=\"text\" name=\"name\" placeholder=\"Nombres\" class=\"normal small\">\n");
      out.write("                                <input type=\"text\" name=\"lastname\" placeholder=\"Apellidos\" class=\"normal small last\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row\">\n");
      out.write("                                <input type=\"text\" name=\"email\" placeholder=\"Email\" class=\"normal\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row\">\n");
      out.write("                                <input type=\"text\" name=\"phone\" placeholder=\"Teléfono\" class=\"normal\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row\">\n");
      out.write("                                <textarea placeholder=\"Mensaje\" name=\"message\" class=\"normal medium\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                                <input type=\"button\" class=\"button\" value=\"Solicitar Información\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section class=\"white_section section_gap\" id=\"aboutus\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"heading\">\n");
      out.write("                    <h1><span>Sobre</span>Nosotros</h1>\n");
      out.write("                    <p>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>\n");
      out.write("                        Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"aboutus_listing\"> <span><i class=\"fa fa-unlock-alt\"></i></span>\n");
      out.write("                            <h3>Acceso Ilimitado</h3>\n");
      out.write("                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"aboutus_listing\"> <span><i class=\"fa fa-video-camera\"></i></span>\n");
      out.write("                            <h3>Cursos 100% Practicos</h3>\n");
      out.write("                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"aboutus_listing\"> <span><i class=\"fa fa-microphone\"></i></span>\n");
      out.write("                            <h3>Profesores Certificados</h3>\n");
      out.write("                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row sec_top_gp\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"aboutus_listing\"> <span><i class=\"fa fa-file-text-o\"></i></span>\n");
      out.write("                            <h3>Certifcados Garantizados</h3>\n");
      out.write("                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"aboutus_listing\"> <span><i class=\"fa fa-mobile\"></i></span>\n");
      out.write("                            <h3>Aprendizaje Garantizado</h3>\n");
      out.write("                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"aboutus_listing\"> <span><i class=\"fa fa-life-ring\"></i></span>\n");
      out.write("                            <h3>Soporte 24x7</h3>\n");
      out.write("                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section class=\"grey_section section_gap\" id=\"courses\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"heading\">\n");
      out.write("                    <h1><span>Nuestros </span>Cursos</h1>\n");
      out.write("                    <p>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>\n");
      out.write("                        Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</p>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"hover_listing row\">\n");
      out.write("                    \n");
      out.write("                    <li class=\"col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"img\"><a href=\"ControladorCurso?categoria=Matematica\"><img src=\"images/courses/matematica.jpg\" alt=\"\" style=\"max-width: 100%; max-height: 100%; width: 500px; height: 200px; \"></a><a class=\"play-btn\"  href=\"ControladorCurso?categoria=Matematica\"  ><i class=\"fa fa-play fa-3\"></i></a></div>\n");
      out.write("                        <h3><a href=\"ControladorCurso?categoria=Matematica\">Matematica</a></h3>\n");
      out.write("                        <p>12/05/2020</p>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd\">\n");
      out.write("                        <div class=\"img\"><a href=\"ControladorCurso?categoria=Lenguaje\"><img src=\"images/courses/lenguaje.jpg\" alt=\"\" style=\"max-width: 100%; max-height: 100%; width: 500px; height: 200px; \"></a><a class=\"play-btn\" href=\"ControladorCurso?categoria=Lenguaje\"><i class=\"fa fa-play fa-3\"></i></a></div>\n");
      out.write("                        <h3><a href=\"ControladorCurso?categoria=Lenguaje\">Lengua y literatura</a></h3>\n");
      out.write("                        <p>01/02/2020</p>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd\">\n");
      out.write("                        <div class=\"img\"><a href=\"ControladorCurso?categoria=Historia\"><img src=\"images/courses/historia.jpg\" alt=\"\" style=\"max-width: 100%; max-height: 100%; width: 500px; height: 200px; \"></a><a class=\"play-btn\" href=\"ControladorCurso?categoria=Historia\"><i class=\"fa fa-play fa-3\"></i></a></div>\n");
      out.write("                        <h3><a href=\"ControladorCurso?categoria=Historia\">Historia</a></h3>\n");
      out.write("                        <p>12/012/2020</p>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd\">\n");
      out.write("                        <div class=\"img\"><a href=\"ControladorCurso?categoria=Geografia\"><img src=\"images/courses/geografia.jpg\" alt=\"\" style=\"max-width: 100%; max-height: 100%; width: 500px; height: 200px; \"></a><a class=\"play-btn\" href=\"ControladorCurso?categoria=Geografia\"><i class=\"fa fa-play fa-3\"></i></a></div>\n");
      out.write("                        <h3><a href=\"ControladorCurso?categoria=Geografia\">Geografia</a></h3>\n");
      out.write("                        <p>03/09/2020</p>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd\">\n");
      out.write("                        <div class=\"img\"><a href=\"ControladorCurso?categoria=Biologia\"><img src=\"images/courses/biologia.jpg\" alt=\"\" style=\"max-width: 100%; max-height: 100%; width: 500px; height: 200px; \"></a><a class=\"play-btn\" href=\"ControladorCurso?categoria=Biologia\"><i class=\"fa fa-play fa-3\"></i></a></div>\n");
      out.write("                        <h3><a href=\"ControladorCurso?categoria=Biologia\">Biologia</a></h3>\n");
      out.write("                        <p>12/09/2020</p>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd\">\n");
      out.write("                        <div class=\"img\"><a href=\"ControladorCurso?categoria=Ingles\"><img src=\"images/courses/ingles.jpg\" alt=\"\" style=\"max-width: 100%; max-height: 100%; width: 500px; height: 200px; \"></a><a class=\"play-btn\" href=\"ControladorCurso?categoria=Ingles\"><i class=\"fa fa-play fa-3\"></i></a></div>\n");
      out.write("                        <h3><a href=\"ControladorCurso?categoria=Ingles\">Ingles</a></h3>\n");
      out.write("                        <p>12/09/2020</p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        <section class=\"yellow_section message_section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>La educación ayuda a la persona a aprender a ser lo que es capaz de ser <small>-Hesíodo</small></p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--\n");
      out.write("        \n");
      out.write("        <section class=\"grey_section section_gap\" id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"heading\">\n");
      out.write("                    <h1><span>Déjanos tu</span>Consulta</h1>\n");
      out.write("                    <p>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>\n");
      out.write("                        Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-5 col-lg-5\">\n");
      out.write("                        <img src=\"images/contact.jpg\" alt=\"contacto\" class=\"img-responsive\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-7 col-lg-7\">\n");
      out.write("                        <form method=\"post\" action=\"\" name=\"\" id=\"\">\n");
      out.write("                            <div class=\"form-row clearfix\">\n");
      out.write("                                <input name=\"name\" id=\"name\" type=\"text\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 normal\" placeholder=\"Nombre\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row clearfix\">\n");
      out.write("                                <input name=\"phone\" id=\"phone\" type=\"text\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 normal\" placeholder=\"Teléfono\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row clearfix\">\n");
      out.write("                                <input name=\"email\" id=\"email\" type=\"email\" class=\" col-xs-12 col-sm-12 col-md-12 col-lg-12 normal\" placeholder=\"Email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row clearfix\">\n");
      out.write("                                <textarea name=\"meesage\" id=\"meesage\" cols=\"\" rows=\"\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 normal medium\" placeholder=\"Mensaje\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" id=\"submit\" name=\"send\" class=\"button\" value=\"Send message\">\n");
      out.write("                            <div id=\"simple-msg\"></div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        -->\n");
      out.write("        \n");
      out.write("        <section class=\"blue_section section_gap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row bottomfourcol\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 bottomAbout\">\n");
      out.write("                        <img src=\"images/logo-footer.png\" class=\"img-responsive\" alt=\"logo\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                        <h5 class=\"heading\">Información de Contacto</h5>\n");
      out.write("                        <ul class=\"footerLinks contact\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-whatsapp\"></i>+51 999 999 999</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-phone\"></i>+01 258 9090</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> hola@elearning.com</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                        <h5 class=\"heading\">Enlaces Internos</h5>\n");
      out.write("                        <ul class=\"footerLinks\">\n");
      out.write("                            <li><a href=\"\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">Cursos</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                        <h5 class=\"heading\">Síguenos en:</h5>\n");
      out.write("                        <ul class=\"footerLinks links-socials\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-facebook\"></i> Facebook</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-instagram\"></i> Instagram</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-twitter\"></i> Twitter</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-youtube\"></i> YouTube</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <p>&copy; 2020 - Un maestro es una brújula que activa los imanes de la curiosidad, el conocimiento y la sabiduría en los alumnos.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pull-right\"><a class=\"gototop smooth\" href=\"#wrapper\"><i class=\"fa fa-chevron-up\"></i></a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/modernizr.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.11.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/stickUp.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.superslides.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.easing.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.mousewheel.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        \n");
      out.write("    jQuery(function($) {\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('.navbar-wrapper').stickUp({\n");
      out.write("                parts: {\n");
      out.write("                    0: 'banner',\n");
      out.write("                    1: 'aboutus',\n");
      out.write("                    2: 'courses',\n");
      out.write("                    3: 'contact'\n");
      out.write("                },\n");
      out.write("                itemClass: 'menuItem',\n");
      out.write("                itemHover: 'active',\n");
      out.write("                topMargin: 'auto'\n");
      out.write("            });\n");
      out.write("            $('.header #banner').superslides({\n");
      out.write("                animation: 'fade',\n");
      out.write("                play: 5000\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}