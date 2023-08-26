package Modulo_6.modulo6.impl;

import Modulo_6.modulo6.interfaces.ICapacitacionDAO;
import Modulo_6.modulo6.models.Capacitacion;

import java.util.ArrayList;
import java.util.List;

public class CapacitacionDAOImpl implements ICapacitacionDAO {
    @Override
    public boolean registrar(Capacitacion capacitacion) {
        return false;
    }

    @Override
    public List<Capacitacion> listarCapacitaciones() {
        List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();


        return capacitaciones;

    }
}
