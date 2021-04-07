/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.luis.Almacen2.controller;

import com.example.luis.Almacen2.models.Cliente;
import com.example.luis.Almacen2.models.Factura;
import com.example.luis.Almacen2.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS AMD A12
 */
@RestController
@RequestMapping("/factura")
public class ClienteController {
    
    private final ClienteService service;
	
    /**
     *
     * @param service
     */
   
    public ClienteController(ClienteService service) {
		this.service = service;
	}
    
    @GetMapping
    public Iterable<Cliente> list(){
		return service.list();
	}
    
    @GetMapping("/{cedula}")
    public Factura find (@PathVariable("cedula") int cedula) {
		return service.ImprimirFactura(cedula);
    }
}
