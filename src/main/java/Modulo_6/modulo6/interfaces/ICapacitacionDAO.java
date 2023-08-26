package Modulo_6.modulo6.interfaces;

import Modulo_6.modulo6.models.Capacitacion;

import java.util.List;

public interface ICapacitacionDAO {
    public boolean registrar(Capacitacion capacitacion);
    public List<Capacitacion> listarCapacitaciones();
}
