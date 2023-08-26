package Modulo_6.modulo6.controllers;

import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.models.Visita;
import Modulo_6.modulo6.services.CapacitacionService;
import Modulo_6.modulo6.services.VisitaService;
import com.oracle.wls.shaded.org.apache.xpath.operations.Bool;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VisitaController {
    @Autowired
    VisitaService visitaService;

    private String fechaGuardada = "";
    private String lugarGuardado = "";
    private String detalleGuardado = "";
    private String estadoGuardado = "";

    @PostMapping("/crear-visita")
    public String postCrearVisita(
            @RequestParam("fecha") String fecha,
            @RequestParam("lugar") String lugar,
            @RequestParam("detalle") String detalle,
            @RequestParam("estado") String estado,
            Model model
    ) {
        if (fecha.isEmpty() || lugar.isEmpty() || detalle.isEmpty() || estado.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-visita";
        }
        fechaGuardada = fecha;
        lugarGuardado = lugar;
        detalleGuardado = detalle;
        estadoGuardado = estado;


        Visita visita = new Visita(fechaGuardada,lugarGuardado,detalleGuardado,estadoGuardado);
        visitaService.anadirVisita(visita);

        return "redirect:/datos-visita";
    }

    @GetMapping("/datos-visita")
    public String getMostrarDatosVisitas(Model model) {
        model.addAttribute("fecha", fechaGuardada);
        model.addAttribute("lugar", lugarGuardado);
        model.addAttribute("detalle", detalleGuardado);
        model.addAttribute("estado", estadoGuardado);
        return "mostrar_datos_visita";
    }

    @GetMapping("/listado-visitas")
    public String getListadoVisitas(Model model){
        model.addAttribute("listadoVisitas",visitaService.listarVisitas());
        return "listar-visitas";
    }

    @GetMapping("editar-visita")
    public String getEditarVisita(
            @RequestParam("id") Integer id,
            Model model){
        model.addAttribute("visita",visitaService.buscarVisita(id));
        return "editar-visita";
    }

    @PostMapping("/editarVisita")
    public String postEditarVisita(
            @RequestParam("id") Integer id,
            @RequestParam("fecha") String fecha,
            @RequestParam("lugar") String lugar,
            @RequestParam("detalle") String detalle,
            @RequestParam("estado") String estado,
            Model model
    ){
        Visita visita = new Visita(id,fecha,lugar,detalle,estado);
        visitaService.anadirVisita(visita);

        return "redirect:/listado-visitas";
    }

    @GetMapping("eliminar-visita")
    public String getEliminarVisita(
            @RequestParam("id") Integer id,
            Model model){
        model.addAttribute("visita",visitaService.buscarVisita(id));
        return "eliminar-visita";
    }

    @PostMapping("/eliminarVisita")
    public String postEliminarVisita(
            @RequestParam("id") Integer id,
            Model model
    ){
        visitaService.eliminarVisita(id);

        return "redirect:/listado-visitas";
    }

    @PostMapping("/anadir-visita")
    public String postAnadirVisita(
            @RequestParam("fecha") String fecha,
            @RequestParam("lugar") String lugar,
            @RequestParam("detalle") String detalle,
            @RequestParam("estado") String estado,
            Model model
    ) {
        if (fecha.isEmpty() || lugar.isEmpty() || detalle.isEmpty() || estado.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-visita";
        }
        fechaGuardada = fecha;
        lugarGuardado = lugar;
        detalleGuardado = detalle;
        estadoGuardado = estado;


        Visita visita = new Visita(fechaGuardada, lugarGuardado, detalleGuardado, estadoGuardado);
        visitaService.anadirVisita(visita);

        return "redirect:/datos-visita";
    }
}
