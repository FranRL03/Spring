package com.salesinaos.triana.dam.demo2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
	
	private String nombre;
	private int codProducto;
	private String descripcion;

}
