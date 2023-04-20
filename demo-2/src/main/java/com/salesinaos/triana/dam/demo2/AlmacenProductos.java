package com.salesinaos.triana.dam.demo2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class AlmacenProductos {
	
	private List <Producto> lista;
	
	@PostConstruct
	public void init() {
		
		lista = new ArrayList<>();
		
		lista.add(Producto.builder()
				.nombre("Plátano")
				.codProducto(1)
				.descripcion("fruta")
				.build());
	}
}
