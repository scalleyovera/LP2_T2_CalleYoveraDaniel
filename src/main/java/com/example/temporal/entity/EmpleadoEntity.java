package com.example.temporal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name ="tb_empleado")
public class EmpleadoEntity {

    @Id
    @Column(name = "dni_empleado", nullable = false,
            columnDefinition = "CHAR(8)", length = 8, unique = true)
    private int dniEmpleado;

    @Column(name = "nombre_empleado" , nullable = false)
    private String nombreEmpleado;

    @Column(name = "apellido_empleado" , nullable = false)
    private String apellidoEmpleado;

    @Column(name = "fecha_nacimiento", nullable = false, updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecNac;

    @Column(name = "direccion" , nullable = false)
    private String direccion;

    @Column(name = "correo" , nullable = false, unique =true)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "fk_area" , nullable = false)
    private AreaEntity area;



}
