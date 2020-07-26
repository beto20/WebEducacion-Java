<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="web.utp.modeloDAO.VideoDAOImpl"%>
<%@page import="web.utp.modelo.VideoBean"%>
<%@page import="java.util.List"%>
<%@page import="web.utp.interfaces.VideoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

    <header style="background:#AE8024;font-family:oswald;">
      <nav class="menu" >
        <nav class="navbar navbar-expand-lg navbar-light bg-#333333" data-toggle="affix" style="margin: 0px 110px 0px 110px;" >
          <button class="navbar-toggler" type="button" style="border-color:white;" data-toggle="collapse" data-target="#navbarsExample11" aria-expanded="false" aria-label="Toggle navigation">
            <span style="color:white">Scientia</span>
          </button>
          <div class="collapse navbar-collapse navbar-nav nav-fill w-100 collapse" id="navbarsExample11">
              <div class="logo"><a href="index.jsp"><img src="images/logo.png" class="img-responsive" alt="logo"></a></div>
             <ul class="navbar-nav nav-fill w-100 nav-justify">
                <li class="nav-item active">
                    <a class="nav-link" href="../entrevistas/entrevistas.php"><span style="color:white; font-size:25px;font-weight: bold">Inicio</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="../entrevistas/entrevistas.php"><span style="color:white; font-size:25px;font-weight: bold">Nosotros</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="../entrevistas/entrevistas.php"><span style="color:white; font-size:25px;font-weight: bold">Cursos</span></a>
                </li>
            </ul>
          </div>
        </nav>
      </nav>
    </header>
  </section>
            
  <div class="col-md-10 ml-5 mt-3" >
            <h2>Videos de Biologia </h2>
                 <div class="">
                <table class="table table-hover">
                     <thead>
                    <tr>
                        <th>Titulo</th>
                        <th>Descripcion</th>
                        <th>Imagen</th>
                        <th>Video Url</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="vb" items="${videocategoria}">
                            <tr>
                                <td>${ vb.getTitulo() }</td>
                                <td>${ vb.getDescripcion() }</td>
                                <td>${ vb.getImagen() }</td>
                                <td><a href="${ vb.getVideo_path() }">Ver video</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>       
            <h2>Articulos academicos</h2>
               <div class="col-sm-6">
                <table class="table table-hover">
                     <thead>
                    <tr>
                        <th>Titulo</th>
                        <th>Categoria</th>
                        <th>Descripcion</th>
                        <th>Direccion url</th>
                    </tr>
                </thead>
                    <tbody>
                        <div class="list-group">
                            <c:forEach var="ab" items="${articulocategoria}">
                                <tr>
                                    <td>${ ab.getTitulo() }</td>
                                    <td>${ ab.getDescripcion() }</td>
                                    <td><a href="${ ab.getUrl() }">Ver articulo</a></td>
                                </tr>
                            </c:forEach>
                        </div>
                    </tbody>
                </table>
            </div>       

       </div>

                        
                        
    </body>
</html>
