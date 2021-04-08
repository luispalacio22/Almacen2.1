/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.luis.Almacen2.controller;

import com.example.luis.Almacen2.models.Cliente;
import com.example.luis.Almacen2.models.Factura;
import com.example.luis.Almacen2.models.Pedido;
import com.example.luis.Almacen2.models.ProductoCliente;
import com.example.luis.Almacen2.service.ClienteService;
import com.example.luis.Almacen2.service.ProductoClienteService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS AMD A12
 */
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    private final ClienteService service;
    private final ProductoClienteService service1;
	
    /**
     *
     * @param service
     */
   
    public ClienteController(ClienteService service,ProductoClienteService service1) {
		this.service = service;
                this.service1= service1;
	}
    
    //Listado de clientes
    @GetMapping
    public Iterable<Cliente> list(){
		return service.list();
	}
    
    //Obtener cliente por cedula
    @GetMapping("/{cedula}")
    public Cliente find (@PathVariable("cedula") int cedula) {
		return service.find(cedula);
    }
    
    
    //Generar factura con la cedula
     @PostMapping("/{cedula}")
	public Factura create(@PathVariable("cedula")int cedula) {
		return service.ImprimirFactura(cedula);
	}
    
    //Generar factura por pedido
     @PostMapping("/factura")
	public Factura create(@RequestBody Pedido pedido) {
		return service.generar(pedido);
	}
        
     
     //Obtener productos por cedula de cliente
     @GetMapping("/productos/{cedula}")
        public List<ProductoCliente> obtener(@PathVariable("cedula")int cedula){
            return service1.ProductosPorCliente(cedula);
        }
    
}
