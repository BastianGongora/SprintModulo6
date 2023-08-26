package Modulo_6.modulo6.interfaces;


import Modulo_6.modulo6.models.Visita;

import java.util.List;

public interface IVisitaDAO {

    public boolean registrar(Visita visita);
    public List<Visita> listarVisitas();

}
