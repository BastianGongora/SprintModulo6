package Modulo_6.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactoController {

    private String nombreGuardado = "";
    private String apellidoGuardado = "";
    private String telefonoGuardado = "";
    private String emailGuardado = "";
    private String generoGuardado = "";
    private String mensajeGuardado = "";
    private String alertaGuardada = "";

    @PostMapping("/contactar")
    public String postContacto(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("telefono") String telefono,
            @RequestParam("email") String email,
            @RequestParam("genero") String genero,
            @RequestParam("mensaje") String mensaje,
            Model model
    ) {
        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || email.isEmpty() || genero.isEmpty() || mensaje.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "contacto";
        }


        nombreGuardado = nombre;
        apellidoGuardado = apellido;
        telefonoGuardado = telefono;
        emailGuardado = email;
        generoGuardado = genero;
        mensajeGuardado = mensaje;
        alertaGuardada = "Formulario completado exitosamente";

        return "redirect:/datos-contacto";
    }

    @GetMapping("/datos-contacto")
    public String mostrarDatos(Model model) {
        model.addAttribute("nombre", nombreGuardado);
        model.addAttribute("apellido", apellidoGuardado);
        model.addAttribute("telefono", telefonoGuardado);
        model.addAttribute("email", emailGuardado);
        model.addAttribute("genero", generoGuardado);
        model.addAttribute("mensaje", mensajeGuardado);
        model.addAttribute("alerta", alertaGuardada);

        return "mostrar_datos";
    }
}
