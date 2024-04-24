package com.codeinnova.objmercado.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class plazas {
//    Atributos
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    private boolean Ventafrutas;
    private boolean Ventagranos;
    private boolean VentaVerduras;

//    Constructores


    public plazas() {
    }

    public plazas(Long id, String nombre, String direccion, boolean ventafrutas, boolean ventagranos, boolean ventaVerduras) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        Ventafrutas = ventafrutas;
        Ventagranos = ventagranos;
        VentaVerduras = ventaVerduras;
    }

    //    Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isVentafrutas() {
        return Ventafrutas;
    }

    public void setVentafrutas(boolean ventafrutas) {
        Ventafrutas = ventafrutas;
    }

    public boolean isVentagranos() {
        return Ventagranos;
    }

    public void setVentagranos(boolean ventagranos) {
        Ventagranos = ventagranos;
    }

    public boolean isVentaVerduras() {
        return VentaVerduras;
    }

    public void setVentaVerduras(boolean ventaVerduras) {
        VentaVerduras = ventaVerduras;
    }

}
