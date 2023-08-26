package Modulo_6.modulo6.controllers;

import Modulo_6.modulo6.impl.PagoDAOImpl;
import Modulo_6.modulo6.impl.UsuarioDAOImpl;
import Modulo_6.modulo6.models.Pago;
import Modulo_6.modulo6.models.Usuario;
import Modulo_6.modulo6.services.PagoService;
import Modulo_6.modulo6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagoController {
    @Autowired
    PagoService pagoService;
    PagoDAOImpl pagoDAO;

    private String rutGuardado = "";
    private String montoGuardado = "";

    @PostMapping("/crear-pago")
    public String postCrearPago(
            @RequestParam("rut") String rut,
            @RequestParam("monto") String monto,
            Model model
    ) {
        if ( rut.isEmpty() || monto.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-pago";
        }
        rutGuardado = rut;
        montoGuardado = monto;
        Float monto_aux = Float.valueOf(montoGuardado);


        Pago pago = new Pago(rutGuardado,monto_aux);
        pagoService.anadirPago(pago);

        return "redirect:/datos-pago";
    }

    @GetMapping("/datos-pago")
    public String mostrarDatosPago(Model model) {
        model.addAttribute("rut", rutGuardado);
        model.addAttribute("monto", montoGuardado);
        return "mostrar_datos_pago";
    }

    @GetMapping("/listado-pagos")
    public String getListadoPagos(Model model){
        model.addAttribute("listadoPagos",pagoService.listarPagos());
        return "listar-pagos";
    }

    @GetMapping("editar-pago")
    public String getEditarPago(
            @RequestParam("id") Integer id,
            Model model){
        model.addAttribute("pago",pagoService.buscarPago(id));
        return "editar-pago";
    }

    @PostMapping("/editarPago")
    public String postEditarPago(
            @RequestParam("id") Integer id,
            @RequestParam("rut") String rut,
            @RequestParam("monto") Float monto,
            Model model
    ){
        Pago pago = new Pago(id,rut,monto);
        pagoService.anadirPago(pago);

        return "redirect:/listado-pagos";
    }

    @GetMapping("eliminar-pago")
    public String getEliminarPago(
            @RequestParam("id") Integer id,
            Model model){
        model.addAttribute("pago",pagoService.buscarPago(id));
        return "eliminar-pago";
    }

    @PostMapping("/eliminarPago")
    public String postEliminarPago(
            @RequestParam("id") Integer id,
            Model model
    ){
        pagoService.eliminarPago(id);

        return "redirect:/listado-pagos";
    }

    @PostMapping("/anadir-pago")
    public String postAnadirPago(
            @RequestParam("rut") String rut,
            @RequestParam("monto") String monto,
            Model model
    ) {
        if (rut.isEmpty() || monto.isEmpty()) {
            model.addAttribute("alerta", "Por favor, complete todos los campos antes de enviar el formulario.");
            return "crear-pago";
        }

        rutGuardado = rut;
        montoGuardado = monto;
        Float monto_aux = Float.valueOf(monto);
        Pago pago = new Pago(rutGuardado,monto_aux);
        pagoService.anadirPago(pago);

        return "redirect:/datos-pago";
    }

}
