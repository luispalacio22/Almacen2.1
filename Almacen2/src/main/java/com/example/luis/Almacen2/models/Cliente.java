/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.luis.Almacen2.models;

/**
 *
 * @author ASUS AMD A12
 */
public class Cliente {
    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Cliente(int cedula, String direccion){
        this.cedula=cedula;
        this.direccion=direccion;
    }

    public Cliente(int cedula, String nombre, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
        
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
