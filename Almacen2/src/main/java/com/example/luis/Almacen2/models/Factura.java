/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.luis.Almacen2.models;

import java.util.List;

/**
 *
 * @author ASUS AMD A12
 */
public class Factura {
    private int id;
    private int cedula;
    private String direccion;
    private List<ProductoCliente> productos;
    private double domicilio;
    private double subtotal;
    private double iva;
    private double total;

    public Factura() {
    }

    public Factura(int id, int cedula, String direccion, List<ProductoCliente> productos, double domicilio, double subtotal, double iva, double total) {
        this.id = id;
        this.cedula = cedula;
        this.direccion = direccion;
        this.productos = productos;
        this.domicilio = domicilio;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<ProductoCliente> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoCliente> productos) {
        this.productos = productos;
    }

    public double getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(double domicilio) {
        this.domicilio = domicilio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
