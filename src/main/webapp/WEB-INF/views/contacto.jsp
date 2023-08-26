<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Arrays" %>
<%@ include file="navegador.jsp" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form class="text-center border border-light p-5" action="/contactar" method="POST">

            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Contacto</p>

            <c:if test="${not empty alerta}">
                <div id="alerta" class="alert alert-danger" role="alert">
                        ${alerta}
                </div>
            </c:if>

            <input type="text" class="form-control mb-4" placeholder="Ingrese su nombre" name="nombre">
            <input type="text" class="form-control mb-4" placeholder="Ingrese su apellido" name="apellido">
            <input type="text" class="form-control mb-4" placeholder="Telefono" name="telefono">
            <input type="text" class="form-control mb-4" placeholder="Ingrese su correo electr&oacute;nico" name="email">
            <label class="form-label"><b>Sexo</b></label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="genero" id="flexRadioDefault1" value="Masculino" checked>
                <label class="form-check-label" for="flexRadioDefault1">Masculino</label>
            </div><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="genero" id="flexRadioDefault2" value="Femenino">
                <label class="form-check-label" for="flexRadioDefault2">Femenino</label>
            </div>
            <br>
            <textarea class="form-control" id="exampleFormControlTextarea1" name="mensaje" rows="3"
                      placeholder="Ingrese su mensaje"></textarea>
            <button class="btn button-color btn-block my-4 font-color" type="submit">Enviar</button>

        </form>

        <script>
            function validateForm() {
                const nombre = document.querySelector('input[name="nombre"]').value.trim();
                const apellido = document.querySelector('input[name="apellido"]').value.trim();
                const telefono = document.querySelector('input[name="telefono"]').value.trim();
                const email = document.querySelector('input[name="email"]').value.trim();
                const genero = document.querySelector('input[name="genero"]:checked');
                const mensaje = document.querySelector('textarea[name="mensaje"]').value.trim();

                if (nombre === '' || apellido === '' || telefono === '' || email === '' || genero === null || mensaje === '') {
                    const alertaDiv = document.getElementById('alerta');
                    alertaDiv.style.display = 'block';
                    return false;
                }

                return true;
            }
        </script>

        <script src="js/bootstrap.bundle.min.js"></script>
    </div>
</div>

<%@ include file="footer.jsp" %>
