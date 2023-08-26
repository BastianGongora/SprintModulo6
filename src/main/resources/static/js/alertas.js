document.addEventListener("DOMContentLoaded", function () {
    // Seleccionar el formulario por su ID
    const editarForm = document.getElementById("editarForm");

    // Agregar un evento de escucha para cuando el formulario se envíe
    editarForm.addEventListener("submit", function () {
        // Mostrar una alerta con el mensaje
        alert("Cambios guardados exitosamente");
    });
});