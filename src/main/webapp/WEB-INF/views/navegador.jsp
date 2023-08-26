<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="es">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/boxicons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
    <link rel="stylesheet" href="css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.18/dist/sweetalert2.min.css" rel="stylesheet">

    <title>ASEELEC</title>

</head>

<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="70">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg py-3 sticky-top navbar-light bg-white">
    <div class="container">
        <a class="navbar-brand" href="/">
            <img class="logo" src="images/logo.png" alt="">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/#services">Servicios</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/#features">Quienes somos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/#portfolio">Proyectos realizados</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/#team">Nuestro equipo</a>
                </li>
                <sec:authorize access="hasRole('CLIENTE')">


                <li class="nav-item">
                    <a class="nav-link" href="/contacto">Contacto</a>
                </li>

                    <li class="nav-item">
                        <a class="nav-link" href="/crear-capacitacion">Crear capacitacion</a>
                    </li>

                <li class="nav-item">
                    <a class="nav-link" href="/listado-capacitaciones">Listado de capacitaciones</a>
                </li>
                <li class="nav-item">
                    </sec:authorize>
                        <sec:authorize access="hasRole('ADMINISTRATIVO')">
                    <a class="nav-link" href="/crear-usuario">Crear Usuario</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/listado-usuarios">Listado de Usuarios</a>
                </li>
                <li class="nav-item">


                    <a class="nav-link" href="/crear-pago">Crear Pago</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/listado-pagos">Listado de Pagos</a>
                </li>
                <li class="nav-item">
                    </sec:authorize>
                        <sec:authorize access="hasRole('PROFESIONAL')">
                    <a class="nav-link" href="/crear-visita">Crear Visita</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/listado-visitas">Listado de Visitas</a>
                </li>
                </sec:authorize>
                <li class="nav-item">
                    <a class="nav-link" href="/logout">Login/Logout</a>
                </li>
            </ul>

        </div>
    </div>
</nav><!-- //NAVBAR -->

