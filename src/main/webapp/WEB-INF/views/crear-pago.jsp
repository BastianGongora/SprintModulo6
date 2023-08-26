<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="navegador.jsp" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form class="text-center border border-light p-5" action="/anadir-pago" method="post">

            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Crear Pago</p>

            <c:if test="${not empty alerta}">
                <div id="alerta" class="alert alert-danger" role="alert">
                        ${alerta}
                </div>
            </c:if>

            <input type="text" class="form-control mb-4" placeholder="Ingrese Rut de pagador" name="rut">
            <input type="number" class="form-control mb-4" placeholder="Ingrese Monto" name="monto">


            <button class="btn button-color btn-block my-4 font-color" type="submit">Crear Pago</button>

        </form>



        <script src="js/bootstrap.bundle.min.js"></script>
    </div>
</div>

<%@ include file="footer.jsp" %>
