package Modulo_6.modulo6.controllers;


import Modulo_6.modulo6.impl.UsuarioDAOImpl;

import Modulo_6.modulo6.models.Usuario;

import Modulo_6.modulo6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    UsuarioDAOImpl usuarioDAO;
    private String rutGuardado = "";
    private String nombreGuardado = "";
    private String apellidoGuardado = "";
    private String contrasenaGuardado = "";
    private String correoGuardado = "";
    private String rolGuardado = "";






    @PostMapping("/crear-usuario")
    public String postCrearUsuario(
            @RequestParam("rut") String rut,
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("contrasena") String contrasena,
            @RequestParam("correo") String correo,
            @RequestParam("rol") String rol,
            Model model
    ) {
        if (rut.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || contrasena.isEmpty() || correo.isEmpty() || rol.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-usuario";
        }
        rutGuardado = rut;
        nombreGuardado = nombre;
        apellidoGuardado = apellido;
        contrasenaGuardado = contrasena;
        correoGuardado = correo;
        rolGuardado = rol;

        Usuario usuario = new Usuario(rutGuardado,nombreGuardado,apellidoGuardado,contrasenaGuardado,correoGuardado,rolGuardado);
        usuarioService.anadirUsuario(usuario);

        return "redirect:/datos-usuario";
    }

    @GetMapping("/datos-usuario")
    public String mostrarDatosUsuarios(Model model) {
        model.addAttribute("rut", rutGuardado);
        model.addAttribute("nombre", nombreGuardado);
        model.addAttribute("apellido", apellidoGuardado);
        model.addAttribute("contrasena", contrasenaGuardado);
        model.addAttribute("correo", correoGuardado);
        model.addAttribute("rol", rolGuardado);
        return "mostrar_datos_usuario";
    }
    @GetMapping("/listado-usuarios")
    public String getListadoUsuarios(Model model){
        model.addAttribute("listadoUsuarios",usuarioService.listarUsuarios());
        return "listar-usuarios";
    }

    @GetMapping("editar-usuario")
    public String getEditarUsuario(
            @RequestParam("rut") String rut,
            Model model){
        model.addAttribute("usuario",usuarioService.buscarUsuario(rut));
        return "editar-usuario";
    }

    @PostMapping("/editarUsuario")
    public String postEditarUsuario(
            @RequestParam("rut") String rut,
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("contrasena") String contrasena,
            @RequestParam("correo") String correo,
            @RequestParam("rol") String rol,
            Model model
    ){
        Usuario usuario = new Usuario(rut, nombre, apellido, contrasena, correo, rol);
        usuarioService.anadirUsuario(usuario);

        return "redirect:/listado-usuarios";
    }

    @GetMapping("eliminar-usuario")
    public String getEliminarUsuario(
            @RequestParam("rut") String rut,
            Model model){
        model.addAttribute("usuario",usuarioService.buscarUsuario(rut));
        return "eliminar-usuario";
    }

    @PostMapping("/eliminarUsuario")
    public String postEliminarUsuario(
            @RequestParam("rut") String rut,
            Model model
    ){
        usuarioService.eliminarUsuario(rut);

        return "redirect:/listado-usuarios";
    }

    @PostMapping("/anadir-usuario")
    public String postAnadirUsuario(
            @RequestParam("rut") String rut,
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("contrasena") String contrasena,
            @RequestParam("correo") String correo,
            @RequestParam("rol") String rol,
            Model model
    ) {
        if (rut.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || contrasena.isEmpty() || correo.isEmpty() || rol.isEmpty() ) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-usuario";
        }

        rutGuardado = rut;
        nombreGuardado = nombre;
        apellidoGuardado = apellido;
        contrasenaGuardado = contrasena;
        correoGuardado = correo;
        rolGuardado = rol;
        Usuario usuario = new Usuario(rutGuardado,nombreGuardado,apellidoGuardado,contrasenaGuardado,correoGuardado,rolGuardado);
        usuarioService.anadirUsuario(usuario);

        return "redirect:/datos-usuario";
    }

}
