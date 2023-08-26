<%@ include file="navegador.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="container d-flex justify-content-center align-items-center">
    <div class="ancho">
        <form id="editarForm" action="/editarCapacitacion" method="post">
            <br>
            <p class="h4 mb-4" style="color: rgb(7, 7, 92);">Editar Capacitación</p>

            <input type="hidden" name="id" value="${capacitacion.id}" style="width: 500px">
            <label>Nombre de capacitación</label><br>
            <input type="text" name="nombre_capacitacion" value="${capacitacion.nombre}" style="width: 500px"><br><br>
            <label>Fecha</label><br>
            <input type="date" name="fecha_capacitacion" value="${capacitacion.fecha}" style="width: 500px"><br><br>
            <label>Hora de inicio</label><br>
            <select class="form-select" aria-label="Default select example" name="hora_inicio">
                <option selected>${capacitacion.hora_inicio}</option>
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
            <label>Hora de término</label><br>
            <select class="form-select" aria-label="Default select example" name="hora_termino">
                <option selected>${capacitacion.hora_termino}</option>
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
            <label>Lugar</label><br>
            <input type="text" name="lugar_capacitacion" value="${capacitacion.lugar}" style="width: 500px"><br><br>
            <label>Cantidad de asistentes</label><br>
            <input type="number" name="cantidad_asistentes" value="${capacitacion.nro_asistentes}" style="width: 500px"><br><br>
            <label>Detalle</label><br>
            <input type="text" name="detalle_capacitacion" value="${capacitacion.detalle}" style="width: 500px"><br><br>
            <button class="btn button-color btn-block my-4 font-color" type="submit">Guardar Capacitación</button>
        </form>
    </div>
</div>


</main>
<script src="js/script.js"></script>
<script src="js/alertas.js"></script>


</body>

</html>