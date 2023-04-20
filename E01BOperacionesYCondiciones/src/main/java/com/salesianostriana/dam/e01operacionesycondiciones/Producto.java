package com.salesianostriana.dam.e01operacionesycondiciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
	
	private String nombre;
	private String descripcion;
	private float precio;
	private int numeroVotos;
	private float porcentajeSatisfaccion;
	
	public Producto (String nombre, String descripcion, float precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
}
