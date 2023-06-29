package com.apiinventario.models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "inventario")
public class Activo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serial;
    private String descripcion;
    private String nombre;
    private Date fechaCompra;
    private Double valor_compra;

}
