

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <!-- CSS only -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

        <!-- JS, Popper.js, and jQuery -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
          <style>
            /* --- Clase que agregaremos cuando el usuario haga scroll --- */
            .menu-fixed {
            position:fixed;
            z-index:1000;
            top:0;
            /*max-width:1000px;*/
            left:0;
            width:100%;
            background: #333333;

          }
          </style>

          <script>
            $(document).ready(function(){
              var altura = $('.menu').offset().top;
              $(window).on('scroll', function(){
                if ( $(window).scrollTop() > altura ){
                  $('.menu').addClass('menu-fixed');
                } else {
                  $('.menu').removeClass('menu-fixed');
                }
              });
            });
          </script>
          <section>
            <header style="background:#333333;font-family:oswald;">
              <nav class="menu" >
                <nav class="navbar navbar-expand-lg  bg-#333333" data-toggle="affix" style="margin: 0px 110px 0px 110px;" >
                  <button class="navbar-toggler" type="button" style="border-color:white;" data-toggle="collapse" data-target="#navbarsExample11" aria-expanded="false" aria-label="Toggle navigation">
                    <span style="color:white"></span>
                  </button>
                  <div class="collapse navbar-collapse navbar-nav nav-fill w-100 collapse" id="navbarsExample11">
                    <ul class="navbar-nav nav-fill w-100 nav-justify" >

                        <li >
                            <a class="btn btn-secondary mr-4" href="Controlador?menu=Video&accion=Listar" target="frame" style="color:white; font-size:20px;">Administracion de videos</a>
                        </li>

                        <li >
                            <a class="btn btn-secondary mr-4" href="Controlador?menu=Articulo&accion=Listar" target="frame" style="color:white; font-size:20px;">Administracion de articulos</a>
                        </li>

                        <li >
                            <a class="btn btn-secondary mr-4" href="Controlador?menu=Otros" target="frame" style="color:white; font-size:20px; ">Otros</a>
                        </li>
                    </ul>
                    <div class="dropdown">
                      <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color:white; font-size:20px; ">
                        ${correo.getCorreo()}
                      </a>
                      <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                        <a class="dropdown-item" href="Controlador?menu=MiPerfil" target="frame" style="color:black; font-size:20px; ">Mi perfil</a>
                        <form action="ControladorValidar" method="post">
                            <button class="dropdown-item" name="accion" value="Salir" href="#" style="color:black; font-size:20px; ">Salir</a>
                        </form>
                      </div>
                    </div>
                  </div>
                </nav>
              </nav>
            </header>
          </section>
          <br>
          <div class="m-4" style="height:800px;">
              <iframe name="frame" style="height: 100%; width: 100%; border: none;"></iframe>
          </div>
          
          
          
    </body>
</html>
