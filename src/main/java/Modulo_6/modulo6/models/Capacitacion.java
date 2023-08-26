package Modulo_6.modulo6.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
@Data
@Entity
@Table(name="capacitaciones")
public class Capacitacion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="fecha")
    private String fecha;

    @Column(name="hora_inicio")
    private String hora_inicio;

    @Column(name="hora_termino")
    private String hora_termino;

    @Column(name="lugar")
    private String lugar;

    @Column(name="nro_asistentes")
    Integer nro_asistentes;

    @Column(name="detalle")
    private String detalle;

    public Capacitacion() {
    }

    public Capacitacion(int id, String nombre, String fecha, String hora_inicio, String hora_termino, String lugar, int nro_asistentes, String detalle) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_termino = hora_termino;
        this.lugar = lugar;
        this.nro_asistentes = nro_asistentes;
        this.detalle = detalle;
    }

    public Capacitacion(String nombre, String fecha, String hora_inicio, String hora_termino, String lugar, Integer nro_asistentes, String detalle) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_termino = hora_termino;
        this.lugar = lugar;
        this.nro_asistentes = nro_asistentes;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_termino() {
        return hora_termino;
    }

    public void setHora_termino(String hora_termino) {
        this.hora_termino = hora_termino;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNro_asistentes() {
        return nro_asistentes;
    }

    public void setNro_asistentes(int nro_asistentes) {
        this.nro_asistentes = nro_asistentes;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
