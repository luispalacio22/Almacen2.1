/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.luis.Almacen2.service;

import com.example.luis.Almacen2.models.Cliente;
import com.example.luis.Almacen2.models.Factura;
import com.example.luis.Almacen2.models.Pedido;
import com.example.luis.Almacen2.models.ProductoCliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS AMD A12
 */
@Service
public class ClienteService {
    private ProductoClienteService productoClienteService;
    private List<Cliente> clientes;
   
    
    public ClienteService(ProductoClienteService productoClienteService){
        this.productoClienteService = productoClienteService;
        clientes=new ArrayList<>();
        clientes.add(new Cliente(12345,"Luis","cra 11# 14-08","3225688278"));
        clientes.add(new Cliente(12346,"Carlos","cra 10# 14-08","3525679"));
        clientes.add(new Cliente(12347,"Juan","cra 21# 14-08","3678768"));
        clientes.add(new Cliente(12348,"Ana","cra 31# 14-08","34567876"));
        clientes.add(new Cliente(12349,"Luisa","cra 81# 14-08","35678765"));
        clientes.add(new Cliente(12340,"Jose","cra 41# 14-08","3456787876"));
    }
    
    public List<Cliente> list(){
		return clientes;
	}

    
	//BuscarCliente
	
    public Cliente find(int cedula) {
	for(Cliente cliente : clientes) {
            if(cliente.getCedula() == cedula) {
		return cliente;
            }
	}
	return null;
    }
    
    public Factura ImprimirFactura(int cedula){
        Cliente cliente=find(cedula);
        ArrayList<ProductoCliente> productos = (ArrayList<ProductoCliente>) productoClienteService.ProductosPorCliente(cliente.getCedula());
        
        Factura factura= new Factura();
        double total=0;
        for(ProductoCliente p:productos){
            total=total+(p.getCantidad()*p.getPrecio());
        }
        factura.setSubtotal(total/1.19);
        factura.setIva(total/1.19*0.19);
        factura.setTotal(total);
        
        if(total>70000&&total<100000){
            factura.setDomicilio(5000);
        }
        if(total>100000){
            factura.setDomicilio(0);
        }
        
        return factura;
    }
    
    public Factura generar(Pedido pedido){
        Factura factura=new Factura();
        double total=0;
        for(ProductoCliente p:pedido.getProductos()){
            total=total+(p.getCantidad()*p.getPrecio());
        }
        factura.setSubtotal(total/1.19);
        factura.setIva(total/1.19*0.19);
        factura.setTotal(total);
        
        if(total>70000&&total<100000){
            factura.setDomicilio(5000);
        }
        if(total>100000){
            factura.setDomicilio(0);
        }
        
        return factura;
    }
}
