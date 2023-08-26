<%@ include file="navegador.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form id="editarForm" action="/eliminarPago" method="post">
            <br>
            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Eliminar Pago</p>

            <input type="hidden" name="id" value="${pago.id}" style="width: 500px">
            <input type="text" class="form-control mb-4" placeholder="Ingrese Nombres del usuario" name="nombre" value="${pago.rut}" disabled>
            <input type="text" class="form-control mb-4" placeholder="Ingrese Apellidos del usuario" name="apellido" value="${pago.monto}" disabled>


            <button class="btn button-color btn-block my-4 font-color" type="submit">Eliminar pago</button>

        </form>
    </div>
</div>


</main>
<script src="js/script.js"></script>
<script src="js/alertas.js"></script>


</body>

</html>