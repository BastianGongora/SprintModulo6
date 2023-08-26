package Modulo_6.modulo6.services;

import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.repository.ICapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CapacitacionService {
    @Autowired
    ICapacitacionRepository iCapacitacionRepository;


    public List<Capacitacion> listarCapacitaciones(){
        List<Capacitacion> lcapacitaciones = iCapacitacionRepository.findAll();
        return lcapacitaciones;
    }

    public Capacitacion buscarCapacitacion(Integer id){
        Capacitacion capacitacion = iCapacitacionRepository.findCapacitacionById(id);
        return capacitacion;
    }

    public void eliminarCapacitacion(Integer id) {
        iCapacitacionRepository.delete(buscarCapacitacion(id));
    }

    public boolean anadirCapacitacion(Capacitacion capacitacion){
        if(iCapacitacionRepository.save(capacitacion)!=null){
            System.out.println(capacitacion.getNombre());
            System.out.println(capacitacion.getFecha());
            System.out.println(capacitacion.getHora_inicio());
            System.out.println(capacitacion.getHora_termino());
            System.out.println(capacitacion.getLugar());
            System.out.println(capacitacion.getNro_asistentes());
            System.out.println(capacitacion.getDetalle());
            return true;
        }else{
            return false;
        }
    }
}

