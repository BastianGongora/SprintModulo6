<%@ include file="navegador.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form id="editarForm" action="/editarPago" method="post">
            <br>
            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Editar Pago</p>

            <input type="hidden" name="id" value="${pago.id}" style="width: 500px">
            <label class="form-label">Rut</label><br>
            <input type="text" class="form-control mb-4" placeholder="Ingrese Rut" name="rut" value="${pago.rut}">
            <label class="form-label">Monto</label><br>
            <input type="number" class="form-control mb-4" placeholder="Ingrese Monto" name="monto" value="${pago.monto}">


            <button class="btn button-color btn-block my-4 font-color" type="submit">Guardar cambios</button>

        </form>
    </div>
</div>


</main>
<script src="js/script.js"></script>
<script src="js/alertas.js"></script>


</body>

</html>