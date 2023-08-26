<%@ include file="navegador.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form id="editarForm" action="/eliminarVisita" method="post">
            <br>
            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Eliminar Visita</p>

            <input type="hidden" name="id" value="${visita.id}" style="width: 500px">
            <input type="date" class="form-control mb-4" placeholder="Fecha" name="fecha" value="${visita.fecha}" disabled>
            <input type="text" class="form-control mb-4" placeholder="Lugar de la visita" name="lugar" value="${visita.lugar}" disabled>

            <input type="text" class="form-control mb-4" placeholder="Detalle de la visita" name="detalle" value="${visita.detalle}" disabled>


            <select class="form-select mx-auto" aria-label="Default select example" name="estado" disabled>
                <option selected>${visita.estado}</option>
                <option>Completo</option>
                <option>Pendiente</option>
            </select>

            <button class="btn button-color btn-block my-4 font-color" type="submit">Eliminar visita</button>

        </form>
    </div>
</div>


</main>
<script src="js/script.js"></script>
<script src="js/alertas.js"></script>


</body>

</html>