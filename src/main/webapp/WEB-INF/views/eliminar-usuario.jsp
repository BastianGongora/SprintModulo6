<%@ include file="navegador.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form id="editarForm" action="/eliminarUsuario" method="post">
            <br>
            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Eliminar Usuario</p>

            <input type="hidden" name="rut" value="${usuario.rut}" style="width: 500px">
            <input type="text" class="form-control mb-4" placeholder="Ingrese Nombres del usuario" name="nombre" value="${usuario.nombre}" disabled>
            <input type="text" class="form-control mb-4" placeholder="Ingrese Apellidos del usuario" name="apellido" value="${usuario.apellido}" disabled>
            <input type="password" class="form-control mb-4" placeholder="Ingrese contraseña" name="contrasena" value="${usuario.contrasena}" disabled>
            <input type="text" class="form-control mb-4" placeholder="Ingrese correo" name="correo" value="${usuario.correo}" disabled>
            <label class="form-label">Rol</label>
            <select class="form-select mx-auto" aria-label="Default select example" name="rol" disabled>
                <option selected>${usuario.rol}"</option>
                <option>Cliente</option>
                <option>Administrativo</option>
                <option>Profesional</option>
            </select>

            <button class="btn button-color btn-block my-4 font-color" type="submit">Eliminar usuario</button>

        </form>
    </div>
</div>


</main>
<script src="js/script.js"></script>
<script src="js/alertas.js"></script>


</body>

</html>