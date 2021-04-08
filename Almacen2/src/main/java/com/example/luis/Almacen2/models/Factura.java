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
    private double domicilio;
    private double subtotal;
    private double iva;
    private double total;
    private double totalcompra;

    public Factura() {
    }

    public Factura(int id, double domicilio, double subtotal, double iva, double total, double totalcompra) {
        this.id = id;
        this.domicilio = domicilio;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.totalcompra = totalcompra;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
