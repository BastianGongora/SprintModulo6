package Modulo_6.modulo6.services;


import Modulo_6.modulo6.models.Pago;
import Modulo_6.modulo6.repository.IPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
    @Autowired
    IPagoRepository iPagoRepository;


    public List<Pago> listarPagos(){
        List<Pago> lpagos = iPagoRepository.findAll();
        return lpagos;
    }

    public Pago buscarPago(Integer id){
        Pago pago = iPagoRepository.findPagoById(id);
        return pago;
    }

    public void eliminarPago(Integer id) {
        iPagoRepository.delete(buscarPago(id));
    }

    public boolean anadirPago(Pago pago){
        if(iPagoRepository.save(pago)!=null){
            System.out.println(pago.getRut());
            System.out.println(pago.getMonto());
            return true;
        }else{
            return false;
        }
    }
}

