package Modulo_6.modulo6.services;

import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.models.Visita;
import Modulo_6.modulo6.repository.IVisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaService {
    @Autowired
    IVisitaRepository iVisitaRepository;

    public List<Visita> listarVisitas(){
        List<Visita> lvisitas = iVisitaRepository.findAll();
        return lvisitas;
    }

    public Visita buscarVisita(Integer id){
        Visita visita = iVisitaRepository.findVisitaById(id);
        return visita;
    }

    public void eliminarVisita(Integer id) {
        iVisitaRepository.delete(buscarVisita(id));
    }

    public boolean anadirVisita(Visita visita){
        if(iVisitaRepository.save(visita)!=null){
            return true;
        }else{
            return false;
        }
    }


}
