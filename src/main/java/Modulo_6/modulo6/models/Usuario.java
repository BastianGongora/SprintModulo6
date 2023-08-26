package Modulo_6.modulo6.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name="rut")
    private String rut;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="contrasena")
    private String contrasena;

    @Column(name="correo")
    private String correo;

    @Column(name="rol")
    private String rol;




}
