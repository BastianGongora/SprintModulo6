<%@ page import="Modulo_6.modulo6.models.Capacitacion" %>
<%@ page import="Modulo_6.modulo6.models.Usuario" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="navegador.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>

<!-- MDB -->

<link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.css" />



<h2 class="text-center display-6" style="margin-top: 20px;">Listado de visitas</h2>

<div class="container">
    <div class="row">
        <div class="table-responsive">
            <table class="table" id="example">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Fecha</th>
                    <th scope="col">Lugar</th>
                    <th scope="col">Detalle</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Eliminar</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="visita" items="${listadoVisitas}">
                    <tr>
                        <td>${visita.id}</td>
                        <td>${visita.fecha}</td>
                        <td>${visita.lugar}</td>
                        <td>${visita.detalle}</td>
                        <td>${visita.estado}</td>
                        <td>
                            <form action="/editar-visita" method="get">
                                <input type="hidden" name="id" id="id" value="${visita.id}" />
                                <button style="background-color: transparent; border-color: transparent; font-size: 18px" type="submit">
                                    <i class="fa-solid fa-pencil"></i>
                                </button>
                            </form>
                        </td>
                        <td>
                            <form action="/eliminar-visita" method="get">
                                <input type="hidden" name="id" value="${visita.id}" />
                                <button style="background-color: transparent; border-color: transparent; font-size: 18px" type="submit">
                                    <i class="fa-solid fa-trash"></i>
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="row mt-3">
                <div class="col">
                    <button id="exportCsvBtn" class="btn btn-warning">Exportar CSV</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.10.0/jspdf.umd.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.16.9/xlsx.full.min.js"></script>
<!--Script de bootstrap-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
<!--Script de JQuery-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<!--Script del plugin dataTable-->
<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.js"></script>
<!--Script de mi archivo javascript-->
<script src="js/table.js"></script>



<%@ include file="footer.jsp" %>