package Modulo_6.modulo6.models;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private static List<Capacitacion> capacitaciones = new ArrayList<>();

    public static List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public static void agregarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

}
