package Modulo_6.modulo6.controllers;

import Modulo_6.modulo6.impl.CapacitacionDAOImpl;
import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.services.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    CapacitacionService capacitacionService;
    CapacitacionDAOImpl capacitacionDAO;


    @GetMapping("/persona")
    public String getPersona(Model model){
        model.addAttribute("nombre","Laura");
        model.addAttribute("direccion","Calle séptima");
        return "personaView";
    }

    @GetMapping("/")
    public String getIndex(){
        //CODIGO SI QUISIERA ENTREGAR ALGO
        return "index";
    }
    @GetMapping("/contacto")
    public String getContacto(){
        //CODIGO SI QUISIERA ENTREGAR ALGO
        return "contacto";
    }
    @GetMapping("/crear-capacitacion")
    public String getCrearCapacitacion(){
        //CODIGO SI QUISIERA ENTREGAR ALGO
        return "crear-capacitacion";
    }
    @GetMapping("/crear-usuario")
    public String getCrearUsuario(){
        //CODIGO SI QUISIERA ENTREGAR ALGO
        return "crear-usuario";
    }

    @GetMapping("/crear-pago")
    public String getCrearPago(){
        //CODIGO SI QUISIERA ENTREGAR ALGO
        return "crear-pago";
    }

    @GetMapping("/crear-visita")
    public String getCrearVisita(){
        //CODIGO SI QUISIERA ENTREGAR ALGO
        return "crear-visita";
    }



}


