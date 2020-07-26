<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Inicio de sesion</title>
    <link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="shortcut icon" href="images/favicon.png">
</head>

<body>
    <div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h3>Inicio de sesion</h3>
                                <p>Ingresa tu correo y contraseña correctamente:</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-lock"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            
                            <form name="frm" method="post" class="login-form" action="ControladorValidar" >
                                <div class="form-group">
                                    <label class="sr-only" >Correo</label>
                                    <input type="text" name="txtcorreo" placeholder="Correo" class="form-username form-control">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" >Contraseña</label>
                                    <input type="password" name="txtpssw" placeholder="Contraseña" class="form-password form-control">
                                </div>
                                <input type="submit" name="accion" value="Ingresar" class="btn btn-primary ">
                                
                            </form>
        
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery.backstretch.min.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
</body>
</html>
