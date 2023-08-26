package Modulo_6.modulo6.impl;

import Modulo_6.modulo6.interfaces.IVisitaDAO;
import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.models.Visita;

import java.util.ArrayList;
import java.util.List;

public class VisitaDAOImpl implements IVisitaDAO {

    @Override
    public boolean registrar(Visita visita) {
        return false;
    }

    @Override
    public List<Visita> listarVisitas() {
        List<Visita> visitas = new ArrayList<Visita>();


        return visitas;
    }
}
