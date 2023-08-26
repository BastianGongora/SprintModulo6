<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="navegador.jsp" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form class="text-center border border-light p-5" action="/anadir-usuario" method="post">

            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Crear Usuario</p>

            <c:if test="${not empty alerta}">
                <div id="alerta" class="alert alert-danger" role="alert">
                        ${alerta}
                </div>
            </c:if>

            <input type="text" class="form-control mb-4" placeholder="Ingrese Rut del usuario" name="rut">
            <input type="text" class="form-control mb-4" placeholder="Ingrese Nombres del usuario" name="nombre">
            <input type="text" class="form-control mb-4" placeholder="Ingrese Apellidos del usuario" name="apellido">
            <input type="password" class="form-control mb-4" placeholder="Ingrese contraseña" name="contrasena">
            <input type="text" class="form-control mb-4" placeholder="Ingrese correo" name="correo">
            <label class="form-label">Rol</label>
            <select class="form-select mx-auto" aria-label="Default select example" name="rol">
                <option selected>Cliente</option>
                <option>Administrativo</option>
                <option>Profesional</option>
            </select>

            <button class="btn button-color btn-block my-4 font-color" type="submit">Crear Usuario</button>

        </form>



        <script src="js/bootstrap.bundle.min.js"></script>
    </div>
</div>

<%@ include file="footer.jsp" %>
