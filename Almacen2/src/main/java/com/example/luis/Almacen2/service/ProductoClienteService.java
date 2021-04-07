/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.luis.Almacen2.service;

import com.example.luis.Almacen2.models.ProductoCliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS AMD A12
 */
@Service
public class ProductoClienteService {
    
    private List<ProductoCliente> productos;
    
    public ProductoClienteService(){
        productos=new ArrayList<>();
        productos.add(new ProductoCliente(1,"aceite",1,20000,12345));
        productos.add(new ProductoCliente(2,"verduras",2,20000,12346));
        productos.add(new ProductoCliente(3,"carnes",1,50000,12345));
        productos.add(new ProductoCliente(4,"juguete",1,40000,12346));
        productos.add(new ProductoCliente(5,"arroz",2,5000,12345));
        productos.add(new ProductoCliente(6,"gaseosa",1,15000,12345));
        productos.add(new ProductoCliente(7,"jugo",3,3000,12345));
                
    }
    public List<ProductoCliente> list(){
		return productos;
	}
    
    public List<ProductoCliente> ProductosPorCliente(int cedula){
        List<ProductoCliente> productoPorCliente=new ArrayList<>();
        for(ProductoCliente p : productos){
            if(p.getCedulaCliente()==cedula){
                productoPorCliente.add(p);
            }
        }
        
        return productoPorCliente;
    }
}
