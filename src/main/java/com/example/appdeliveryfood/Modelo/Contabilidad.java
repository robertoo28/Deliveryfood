package com.example.appdeliveryfood.Modelo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;
import java.util.Date;




@Getter
@Setter
@Entity
@Table(name = "TCONTABILIDAD")
public class Contabilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double ingreso;
    private String concepto;
    @Temporal(TemporalType.DATE)
    private Date fecha;
}
