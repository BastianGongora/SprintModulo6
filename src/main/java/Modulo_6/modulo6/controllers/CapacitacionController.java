package Modulo_6.modulo6.controllers;


import Modulo_6.modulo6.impl.CapacitacionDAOImpl;
import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.services.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CapacitacionController {
    @Autowired
    CapacitacionService capacitacionService;
    CapacitacionDAOImpl capacitacionDAO;
    private String nombreCapacitacionGuardado = "";
    private String fechaGuardada = "";
    private String horaInicioGuardado = "";
    private String horaTerminoGuardado = "";
    private String lugarCapacitacionGuardado = "";
    private String cantidadAsistentesGuardado = "";
    private String detalleGuardado = "";

    @PostMapping("/crear-capacitacion")
    public String postCrearCapacitacion(
            @RequestParam("nombre_capacitacion") String nombreCapacitacion,
            @RequestParam("fecha_capacitacion") String fechaCapacitacion,
            @RequestParam("hora_inicio") String horaInicio,
            @RequestParam("hora_termino") String horaTermino,
            @RequestParam("lugar_capacitacion") String lugarCapacitacion,
            @RequestParam("cantidad_asistentes") String cantAsistentes,
            @RequestParam("detalle_capacitacion") String detalleCapacitacion,
            Model model
    ) {
        if (nombreCapacitacion.isEmpty() || fechaCapacitacion.isEmpty() || horaInicio.isEmpty() || horaTermino.isEmpty() || lugarCapacitacion.isEmpty() || cantAsistentes.isEmpty() || detalleCapacitacion.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-capacitacion";
        }
        nombreCapacitacionGuardado = nombreCapacitacion;
        fechaGuardada = fechaCapacitacion;
        horaInicioGuardado = horaInicio;
        horaTerminoGuardado = horaTermino;
        lugarCapacitacionGuardado = lugarCapacitacion;
        cantidadAsistentesGuardado = cantAsistentes;
        Integer nro_asistentes = Integer.valueOf(cantidadAsistentesGuardado);
        detalleGuardado = detalleCapacitacion;
        Capacitacion capacitacion = new Capacitacion(nombreCapacitacionGuardado,fechaGuardada,horaInicioGuardado,horaTerminoGuardado,lugarCapacitacionGuardado,nro_asistentes,detalleGuardado);
        capacitacionService.anadirCapacitacion(capacitacion);

        return "redirect:/datos-capacitacion";
    }

    @GetMapping("/datos-capacitacion")
    public String getMostrarDatosCapacitacion(Model model) {
        model.addAttribute("nombre_capacitacion", nombreCapacitacionGuardado);
        model.addAttribute("fecha_capacitacion", fechaGuardada);
        model.addAttribute("hora_inicio", horaInicioGuardado);
        model.addAttribute("hora_termino", horaTerminoGuardado);
        model.addAttribute("lugar_capacitacion", lugarCapacitacionGuardado);
        model.addAttribute("cantidad_asistentes", cantidadAsistentesGuardado);
        model.addAttribute("detalle_capacitacion", detalleGuardado);
        return "mostrar_datos_capacitacion";
    }
    @GetMapping("/listado-capacitaciones")
    public String getListadoCapacitaciones(Model model){
        model.addAttribute("listadoCapacitaciones",capacitacionService.listarCapacitaciones());
        return "listar_capacitaciones";
    }

    @GetMapping("editar-capacitacion")
    public String getEditarCapacitacion(
            @RequestParam("id") String id,
            Model model){
        Integer id_aux = Integer.valueOf(id);
        model.addAttribute("capacitacion",capacitacionService.buscarCapacitacion(id_aux));
        return "editar-capacitacion";
    }

    @PostMapping("/editarCapacitacion")
    public String postEditarCapacitacion(
            @RequestParam("id") String id,
            @RequestParam("nombre_capacitacion") String nombreCapacitacion,
            @RequestParam("fecha_capacitacion") String fechaCapacitacion,
            @RequestParam("hora_inicio") String horaInicio,
            @RequestParam("hora_termino") String horaTermino,
            @RequestParam("lugar_capacitacion") String lugarCapacitacion,
            @RequestParam("cantidad_asistentes") String cantAsistentes,
            @RequestParam("detalle_capacitacion") String detalleCapacitacion,
            Model model
    ){
        Integer nro_asistentes = Integer.valueOf(cantAsistentes);
        Integer id_aux = Integer.valueOf(id);
        Capacitacion capacitacion = new Capacitacion(id_aux, nombreCapacitacion, fechaCapacitacion, horaInicio, horaTermino, lugarCapacitacion, nro_asistentes, detalleCapacitacion);
        capacitacionService.anadirCapacitacion(capacitacion);

        return "redirect:/listado-capacitaciones";
    }

    @GetMapping("eliminar-capacitacion")
    public String getEliminarCapacitacion(
            @RequestParam("id") String id,
            Model model){
        Integer id_aux = Integer.valueOf(id);
        model.addAttribute("capacitacion",capacitacionService.buscarCapacitacion(id_aux));
        return "eliminar-capacitacion";
    }

    @PostMapping("/eliminarCapacitacion")
    public String postEliminarCapacitacion(
            @RequestParam("id") String id,
            Model model
    ){
        Integer id_aux = Integer.valueOf(id);
        capacitacionService.eliminarCapacitacion(id_aux);

        return "redirect:/listado-capacitaciones";
    }

    @PostMapping("/anadir-capacitacion")
    public String postAnadirCapacitacion(
            @RequestParam("nombre_capacitacion") String nombreCapacitacion,
            @RequestParam("fecha_capacitacion") String fechaCapacitacion,
            @RequestParam("hora_inicio") String horaInicio,
            @RequestParam("hora_termino") String horaTermino,
            @RequestParam("lugar_capacitacion") String lugarCapacitacion,
            @RequestParam("cantidad_asistentes") String cantAsistentes,
            @RequestParam("detalle_capacitacion") String detalleCapacitacion,
            Model model
    ) {
        if (nombreCapacitacion.isEmpty() || fechaCapacitacion.isEmpty() || horaInicio.isEmpty() || horaTermino.isEmpty() || lugarCapacitacion.isEmpty() || cantAsistentes.isEmpty() || detalleCapacitacion.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-capacitacion";
        }

        nombreCapacitacionGuardado = nombreCapacitacion;
        fechaGuardada = fechaCapacitacion;
        horaInicioGuardado = horaInicio;
        horaTerminoGuardado = horaTermino;
        lugarCapacitacionGuardado = lugarCapacitacion;
        cantidadAsistentesGuardado = cantAsistentes;
        Integer nro_asistentes = Integer.valueOf(cantidadAsistentesGuardado);
        detalleGuardado = detalleCapacitacion;
        Capacitacion capacitacion = new Capacitacion(nombreCapacitacionGuardado,fechaGuardada,horaInicioGuardado,horaTerminoGuardado,lugarCapacitacionGuardado,nro_asistentes,detalleGuardado);
        capacitacionService.anadirCapacitacion(capacitacion);

        return "redirect:/datos-capacitacion";
    }



}