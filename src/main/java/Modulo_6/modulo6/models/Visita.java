package Modulo_6.modulo6.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="visitas")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "estado")
    private String estado;

    public Visita(String fecha, String lugar, String detalle, String estado) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.detalle = detalle;
        this.estado = estado;
    }
}




