<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="navegador.jsp" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form class="text-center border border-light p-5" action="/anadir-capacitacion" method="POST">

            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Crear Capacitación</p>

            <c:if test="${not empty alerta}">
                <div id="alerta" class="alert alert-danger" role="alert">
                        ${alerta}
                </div>
            </c:if>

            <input type="text" class="form-control mb-4" placeholder="Ingrese nombre de la capacitación" name="nombre_capacitacion">
            <input type="date" class="form-control mb-4" placeholder="Fecha" name="fecha_capacitacion">
            <label class="form-label">Hora de inicio</label>
            <select class="form-select mx-auto" aria-label="Default select example" name="hora_inicio">
                <option selected>Seleccionar hora</option>
                <%
                    for (int hora = 0; hora <= 23; hora++) {
                        for (int minuto = 0; minuto <= 30; minuto += 30) {
                            String horaFormateada = String.format("%02d", hora);
                            String minutoFormateado = String.format("%02d", minuto);
                            String opcion = horaFormateada + ":" + minutoFormateado;
                %>
                <option value="<%=opcion%>"><%=opcion%>
                </option>
                <%
                        }
                    }
                %>
            </select>
            <label class="form-label">Hora de término</label>
            <select class="form-select mx-auto" aria-label="Default select example" name="hora_termino">
                <option selected>Seleccionar hora</option>
                <%
                    for (int hora = 0; hora <= 23; hora++) {
                        for (int minuto = 0; minuto <= 30; minuto += 30) {
                            String horaFormateada = String.format("%02d", hora);
                            String minutoFormateado = String.format("%02d", minuto);
                            String opcion = horaFormateada + ":" + minutoFormateado;
                %>
                <option value="<%=opcion%>"><%=opcion%>
                </option>
                <%
                        }
                    }
                %>
            </select>
            <input type="text" class="form-control mb-4" placeholder="Lugar de capacitación" name="lugar_capacitacion">
            <input type="number" class="form-control mb-4" placeholder="Cantidad de asistentes" name="cantidad_asistentes">
            <textarea class="form-control" id="exampleFormControlTextarea1" name="detalle_capacitacion" rows="3"
                      placeholder="Ingrese detalle de la capacitación"></textarea>
            <button class="btn button-color btn-block my-4 font-color" type="submit">Crear Capacitación</button>

        </form>



        <script src="js/bootstrap.bundle.min.js"></script>
    </div>
</div>

<%@ include file="footer.jsp" %>
