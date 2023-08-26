package Modulo_6.modulo6.interfaces;

import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.models.Pago;

import java.util.List;

public interface IPagoDAO {
    public boolean registrar(Pago pago);
    public List<Pago> listarPagos();

}
