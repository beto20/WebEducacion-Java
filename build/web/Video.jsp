
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
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
        <h2>Videos</h2>
        <div class="d-flex">
 
            <div class="card col-sm-5">
                <div class="card-body">
                    <form action="Controlador?menu=Video" method="POST">
                        <div class="form-group">
                            
                           
                            <input type="hidden" name="txtusuario"  value="1" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Titulo</label>
                            <input type="text" name="txttitulo" value="${ video.getTitulo() }" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Categoria</label>
                            <input type="text" name="txtcategoria" value="${ video.getCategoria() }" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Descripcion</label>
                            <input type="text" name="txtdescripcion" value="${ video.getDescripcion() }" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Imagen</label>
                            <input type="file" name="txtimagen" value="${ video.getImagen() }" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Video URL</label>
                            <input type="text" name="txtvideourl" value="${ video.getVideo_path() }" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" name="txtestado" value="${ video.getEstado() }" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Insertar" class="btn btn-success">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-info">
                    </form>
                </div>
            </div>
        
        <div class="col-sm-6">
            <table class="table table-hover">
                 <thead>
                <tr>

                    <th>Titulo</th>
                    <th>Categoria</th>
                    <th>Descripcion</th>
                    <th>Imagen</th>
                    <th>Video Url</th>
                    <th>Estado</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="vb" items="${videos}">
                    <tr>

                        <td>${ vb.getTitulo() }</td>
                        <td>${ vb.getCategoria() }</td>
                        <td>${ vb.getDescripcion() }</td>
                        <td>${ vb.getImagen() }</td>
                        <td>${ vb.getVideo_path() }</td>
                        <td>${ vb.getEstado() }</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=Video&accion=Editar&id=${ vb.getId() }" >Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=Video&accion=Eliminar&id=${ vb.getId() }" >Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>       
</div>

        
        
    </body>
</html>
