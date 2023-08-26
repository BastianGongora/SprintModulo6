package Modulo_6.modulo6.impl;

import Modulo_6.modulo6.interfaces.IPagoDAO;
import Modulo_6.modulo6.models.Pago;
import Modulo_6.modulo6.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PagoDAOImpl implements IPagoDAO {
    @Override
    public boolean registrar(Pago pago) {
        return false;
    }

    @Override
    public List<Pago> listarPagos() {
        List<Pago> pagos = new ArrayList<Pago>();


        return pagos;
    }
}
