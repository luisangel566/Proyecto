<%-- 
    Document   : Registrar
    Created on : 28-nov-2020, 23:13:41
    Author     : HECTOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Registrar</title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    </head>
    <body class="bg-dark">
        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registrar</div>
                <div class="card-body">
                    <form>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIdentificacion">Identificacion</label>
                                    <input class="form-control" name="textIdentificacion" type="text" placeholder="Ingrese identificacion">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIPrimerNombre">Primer nombre</label>
                                    <input class="form-control" name="textPrimerNombre" type="text" placeholder="Ingrese primer nombre">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblISegundoNombre">Segundo nombre</label>
                                    <input class="form-control" name="textSegundoNombre" type="text" placeholder="Ingrese segundo nombre">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIPrimerApellido">Primer apellido</label>
                                    <input class="form-control" name="textPrimerApellido" type="text" placeholder="Ingrese primer apellido">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblISegundoApellido">Segundo apellido</label>
                                    <input class="form-control" name="textSegundoApellido" type="text" placeholder="Ingrese segundo apellido">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIDireccion">Direccion</label>
                                    <input class="form-control" name="textDireccion" type="text" placeholder="Ingrese direccion">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblITelefono">Telefono</label>
                                    <input class="form-control" name="textTelefono" type="text" placeholder="Ingrese telefono">
                                </div>
                                <div class="col-md-12">
                                    <label for="lblCorreo">Correo</label>
                                    <input class="form-control" name="textCorreo" type="text" placeholder="Ingrese correo">
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIPassword">Password</label>
                                    <input class="form-control" name="textPassword" type="text" placeholder="Ingrese password">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblIConfirmarPassword">Confirmar Password</label>
                                    <input class="form-control" name="textConfirmarPassword" type="text" placeholder="Ingrese confirmar password">
                                </div>
                            </div>
                        </div>              
                        <input type="Submit" name="btnAceptar" class="btn btn-primary btn-block" value="Aceptar"</a>
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Login.jsp">Login</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>