<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="navegador.jsp" %>
<br>
<div class="container" aling="center">
  <h2>Datos ingresados:</h2><br>
  <p><b>Nombre:</b> ${nombre}</p>
  <p><b>Apellido:</b> ${apellido}</p>
  <p><b>Teléfono:</b> ${telefono}</p>
  <p><b>Correo electrónico:</b> ${email}</p>
  <p><b>Sexo:</b> ${genero}</p>
  <p><b>Mensaje:</b> ${mensaje}</p>
  <p><b>Alerta:</b> ${alerta}</p>

</div>

<%@ include file="footer.jsp" %>