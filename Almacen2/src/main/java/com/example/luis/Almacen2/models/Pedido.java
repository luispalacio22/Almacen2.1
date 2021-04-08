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
public class Pedido {
    private int cedulaCliente;
    private String direccion;
    private List<ProductoCliente> productos;

    public Pedido(int cedulaCliente, String direccion, List<ProductoCliente> productos) {
        this.cedulaCliente = cedulaCliente;
        this.direccion = direccion;
        this.productos = productos;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
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
    
    
}
