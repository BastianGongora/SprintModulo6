package Modulo_6.modulo6.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pagos")
public class Pago {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="rut")
    private String rut;

    @Column(name = "monto")
    private float monto;

    public Pago(String rut, float monto) {
        this.rut = rut;
        this.monto = monto;
    }
}
