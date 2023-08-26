<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="navegador.jsp" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form class="text-center border border-light p-5" action="/anadir-visita" method="POST">

            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Crear Visita</p>

            <c:if test="${not empty alerta}">
                <div id="alerta" class="alert alert-danger" role="alert">
                        ${alerta}
                </div>
            </c:if>

            <input type="text" class="form-control mb-4" placeholder="Ingrese lugar de la visita" name="lugar">
            <input type="date" class="form-control mb-4" placeholder="Fecha" name="fecha">
            <select class="form-select mx-auto" aria-label="Default select example" name="estado">
                <option selected>Pendiente</option>
                <option>Completo</option>
            </select>
            <textarea class="form-control" id="exampleFormControlTextarea1" name="detalle" rows="3"
                      placeholder="Ingrese detalle de la visita"></textarea>
            <button class="btn button-color btn-block my-4 font-color" type="submit">Crear Visita</button>

        </form>



        <script src="js/bootstrap.bundle.min.js"></script>
    </div>
</div>

<%@ include file="footer.jsp" %>
