package com.emartinez.CRUD.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbtinaco")
public class Tinaco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "volumen")
    private float volumen;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "presión")
    private String presion;

    @Column(name = "flujo")
    private String flujo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getFlujo() {
        return flujo;
    }

    public void setFlujo(String flujo) {
        this.flujo = flujo;
    }
}