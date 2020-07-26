<%-- 
    Document   : index
    Created on : 11/05/2020, 10:53:32 PM
    Author     : USUARIO
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="web.utp.modelo.VideoBean"%>
<%@page import="web.utp.modeloDAO.VideoDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="es">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>e Learning</title>
    <meta name="description" content="Curso de Elearning">
    <meta name="author" content="Curso de Elearning">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600italic,600,700italic,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,500,300italic,300,100,500italic' rel='stylesheet' type='text/css'>
    <link rel="shortcut icon" href="images/favicon.png">
</head>

<body>
    <div class="wrapper" id="wrapper">
        <header>
            <div class="menu">
                <div class="navbar-wrapper">
                    <div class="container">
                        <div class="navwrapper">
                            <div class="navbar navbar-inverse navbar-static-top">
                                <div class="container">
                                    <div class="logo"><a href="index.jsp"><img src="images/logo.png" class="img-responsive" alt="logo"></a></div>
                                    <nav class="navArea">
                                        <div class="navbar-header">
                                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                                        </div>
                                        <div class="navbar-collapse collapse">
                                            <ul class="nav navbar-nav" id="navigation">
                                                <li class="menuItem" id="home"><a href="#wrapper">Inicio</a></li>
                                                <li class="menuItem"><a href="#aboutus">Nosotros</a></li>
                                                <li class="menuItem"><a href="#courses">Cursos</a></li>
                                              <!--  <li class="menuItem"><a href="#contact">Contacto</a></li>-->
                                            </ul>
                                        </div>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="header">
                <div class="banner row" id="banner">
                    <div class="col-xs-12 col-sm-6 col-md-12 col-lg-12 noPadd slides-container" style="height:100%">
                        <div class="slide">
                            <div class="container hedaer-inner">
                                <div class="bannerText">
                                    <h3>Take great online courses from any where in the world</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                </div>
                            </div>
                            <img src="images/slider/image01.jpg" alt="image01">
                        </div>
                        <div class="slide">
                            <div class="container hedaer-inner">
                                <div class="bannerText">
                                    <h3>Take great online courses from any where in the world</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                </div>
                            </div>
                            <img src="images/slider/image02.jpg" alt="image02">
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="container form-header">
                <div class="form-container">
                    <h2>Solicitar Información</h2>
                    <div class="row">
                        <form method="post" action="" name="" id="">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row">
                                <input type="text" name="name" placeholder="Nombres" class="normal small">
                                <input type="text" name="lastname" placeholder="Apellidos" class="normal small last">
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row">
                                <input type="text" name="email" placeholder="Email" class="normal">
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row">
                                <input type="text" name="phone" placeholder="Teléfono" class="normal">
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 form-row">
                                <textarea placeholder="Mensaje" name="message" class="normal medium"></textarea>
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <input type="button" class="button" value="Solicitar Información">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </header>
        
        <section class="white_section section_gap" id="aboutus">
            <div class="container">
                <div class="heading">
                    <h1><span>Sobre</span>Nosotros</h1>
                    <p>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>
                        Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</p>
                </div>
                <div class="row">
                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                        <div class="aboutus_listing"> <span><i class="fa fa-unlock-alt"></i></span>
                            <h3>Acceso Ilimitado</h3>
                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                        <div class="aboutus_listing"> <span><i class="fa fa-video-camera"></i></span>
                            <h3>Cursos 100% Practicos</h3>
                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                        <div class="aboutus_listing"> <span><i class="fa fa-microphone"></i></span>
                            <h3>Profesores Certificados</h3>
                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>
                        </div>
                    </div>
                </div>
                <div class="row sec_top_gp">
                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                        <div class="aboutus_listing"> <span><i class="fa fa-file-text-o"></i></span>
                            <h3>Certifcados Garantizados</h3>
                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                        <div class="aboutus_listing"> <span><i class="fa fa-mobile"></i></span>
                            <h3>Aprendizaje Garantizado</h3>
                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                        <div class="aboutus_listing"> <span><i class="fa fa-life-ring"></i></span>
                            <h3>Soporte 24x7</h3>
                            <p>Morbi leo risus, porta ac consectetur, vestibulum at eros. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        

        
        
        <section class="grey_section section_gap" id="courses">
            <div class="container">
                <div class="heading">
                    <h1><span>Nuestros </span>Cursos</h1>
                    <p>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>
                        Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</p>
                </div>
                <ul class="hover_listing row">
                    
                    <li class="col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd">
                        
                        <div class="img"><a href="ControladorCurso?categoria=Matematica"><img src="images/courses/matematica.jpg" alt="" style="max-width: 100%; max-height: 100%; width: 500px; height: 200px; "></a><a class="play-btn"  href="ControladorCurso?categoria=Matematica"  ><i class="fa fa-play fa-3"></i></a></div>
                        <h3><a href="ControladorCurso?categoria=Matematica">Matematica</a></h3>
                        <p>12/05/2020</p>
                    </li>
                    
                    <li class="col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd">
                        <div class="img"><a href="ControladorCurso?categoria=Lenguaje"><img src="images/courses/lenguaje.jpg" alt="" style="max-width: 100%; max-height: 100%; width: 500px; height: 200px; "></a><a class="play-btn" href="ControladorCurso?categoria=Lenguaje"><i class="fa fa-play fa-3"></i></a></div>
                        <h3><a href="ControladorCurso?categoria=Lenguaje">Lengua y literatura</a></h3>
                        <p>01/02/2020</p>
                    </li>
                    
                    <li class="col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd">
                        <div class="img"><a href="ControladorCurso?categoria=Historia"><img src="images/courses/historia.jpg" alt="" style="max-width: 100%; max-height: 100%; width: 500px; height: 200px; "></a><a class="play-btn" href="ControladorCurso?categoria=Historia"><i class="fa fa-play fa-3"></i></a></div>
                        <h3><a href="ControladorCurso?categoria=Historia">Historia</a></h3>
                        <p>12/012/2020</p>
                    </li>
                    
                    <li class="col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd">
                        <div class="img"><a href="ControladorCurso?categoria=Geografia"><img src="images/courses/geografia.jpg" alt="" style="max-width: 100%; max-height: 100%; width: 500px; height: 200px; "></a><a class="play-btn" href="ControladorCurso?categoria=Geografia"><i class="fa fa-play fa-3"></i></a></div>
                        <h3><a href="ControladorCurso?categoria=Geografia">Geografia</a></h3>
                        <p>03/09/2020</p>
                    </li>
                    
                    <li class="col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd">
                        <div class="img"><a href="ControladorCurso?categoria=Biologia"><img src="images/courses/biologia.jpg" alt="" style="max-width: 100%; max-height: 100%; width: 500px; height: 200px; "></a><a class="play-btn" href="ControladorCurso?categoria=Biologia"><i class="fa fa-play fa-3"></i></a></div>
                        <h3><a href="ControladorCurso?categoria=Biologia">Biologia</a></h3>
                        <p>12/09/2020</p>
                    </li>
                    
                    <li class="col-xs-12 col-sm-6 col-md-4 col-lg-4 courses-content noPadd">
                        <div class="img"><a href="ControladorCurso?categoria=Ingles"><img src="images/courses/ingles.jpg" alt="" style="max-width: 100%; max-height: 100%; width: 500px; height: 200px; "></a><a class="play-btn" href="ControladorCurso?categoria=Ingles"><i class="fa fa-play fa-3"></i></a></div>
                        <h3><a href="ControladorCurso?categoria=Ingles">Ingles</a></h3>
                        <p>12/09/2020</p>
                    </li>

                </ul>
            </div>
            
        </section>
        <section class="yellow_section message_section">
            <div class="container">
                <p>La educación ayuda a la persona a aprender a ser lo que es capaz de ser <small>-Hesíodo</small></p>
            </div>
        </section>
        
        
        <!--
        
        <section class="grey_section section_gap" id="contact">
            <div class="container">
                <div class="heading">
                    <h1><span>Déjanos tu</span>Consulta</h1>
                    <p>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>
                        Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</p>
                </div>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5">
                        <img src="images/contact.jpg" alt="contacto" class="img-responsive">
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
                        <form method="post" action="" name="" id="">
                            <div class="form-row clearfix">
                                <input name="name" id="name" type="text" class="col-xs-12 col-sm-12 col-md-12 col-lg-12 normal" placeholder="Nombre">
                            </div>
                            <div class="form-row clearfix">
                                <input name="phone" id="phone" type="text" class="col-xs-12 col-sm-12 col-md-12 col-lg-12 normal" placeholder="Teléfono">
                            </div>
                            <div class="form-row clearfix">
                                <input name="email" id="email" type="email" class=" col-xs-12 col-sm-12 col-md-12 col-lg-12 normal" placeholder="Email">
                            </div>
                            <div class="form-row clearfix">
                                <textarea name="meesage" id="meesage" cols="" rows="" class="col-xs-12 col-sm-12 col-md-12 col-lg-12 normal medium" placeholder="Mensaje"></textarea>
                            </div>
                            <input type="submit" id="submit" name="send" class="button" value="Send message">
                            <div id="simple-msg"></div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
        
        -->
        
        <section class="blue_section section_gap">
            <div class="container">
                <div class="row bottomfourcol">
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 bottomAbout">
                        <img src="images/logo-footer.png" class="img-responsive" alt="logo">
                    </div>
                    
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <h5 class="heading">Información de Contacto</h5>
                        <ul class="footerLinks contact">
                            <li><a href="#"><i class="fa fa-whatsapp"></i>+51 999 999 999</a></li>
                            <li><a href="#"><i class="fa fa-phone"></i>+01 258 9090</a></li>
                            <li><a href="#"><i class="fa fa-envelope"></i> hola@elearning.com</a></li>
                        </ul>
                    </div>
                    
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <h5 class="heading">Enlaces Internos</h5>
                        <ul class="footerLinks">
                            <li><a href="">Home</a></li>
                            <li><a href="#">Cursos</a></li>
                            <li><a href="login.jsp">Login</a></li>
                        </ul>
                    </div>
                    
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <h5 class="heading">Síguenos en:</h5>
                        <ul class="footerLinks links-socials">
                            <li><a href="#"><i class="fa fa-facebook"></i> Facebook</a></li>
                            <li><a href="#"><i class="fa fa-instagram"></i> Instagram</a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i> Twitter</a></li>
                            <li><a href="#"><i class="fa fa-youtube"></i> YouTube</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        
        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="pull-left">
                        <p>&copy; 2020 - Un maestro es una brújula que activa los imanes de la curiosidad, el conocimiento y la sabiduría en los alumnos.</p>
                    </div>
                    <div class="pull-right"><a class="gototop smooth" href="#wrapper"><i class="fa fa-chevron-up"></i></a></div>
                </div>
            </div>
        </footer>
        
    </div>
    <script type="text/javascript" src="js/modernizr.js"></script>
    <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/stickUp.js"></script>
    <script type="text/javascript" src="js/jquery.superslides.js"></script>
    <script type="text/javascript" src="js/jquery.easing.js"></script>
    <script type="text/javascript" src="js/jquery.mousewheel.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript">
        
    jQuery(function($) {
        $(document).ready(function() {
            $('.navbar-wrapper').stickUp({
                parts: {
                    0: 'banner',
                    1: 'aboutus',
                    2: 'courses',
                    3: 'contact'
                },
                itemClass: 'menuItem',
                itemHover: 'active',
                topMargin: 'auto'
            });
            $('.header #banner').superslides({
                animation: 'fade',
                play: 5000
            });
        });
    });
    
    </script>
</body>

</html>