<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="navegador.jsp" %>
<br>
<div class="container" aling="center">
    <h2>Capacitación ingresada:</h2><br>
    <p><b>Nombre capacitación:</b> ${nombre_capacitacion}</p>
    <p><b>Fecha de la capacitación:</b> ${fecha_capacitacion}</p>
    <p><b>Hora de inicio:</b> ${hora_inicio}</p>
    <p><b>Hora de término:</b> ${hora_termino}</p>
    <p><b>Lugar:</b> ${lugar_capacitacion}</p>
    <p><b>Cantidad de asistentes:</b> ${cantidad_asistentes}</p>
    <p><b>Descripción:</b> ${detalle_capacitacion}</p>

</div>

<%@ include file="footer.jsp" %>