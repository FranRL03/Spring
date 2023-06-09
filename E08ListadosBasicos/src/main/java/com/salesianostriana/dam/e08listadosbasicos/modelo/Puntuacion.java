package com.salesianostriana.dam.e08listadosbasicos.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.springframework.data.annotation.CreatedDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Puntuacion {

	@Id
	@GeneratedValue
	private Long id;
	
	//Ya hemos visto mejores formas
	//de trabajar con fechas, esto solo es para el ejemplo
	
	@CreatedDate
	private Date fecha;
	
	private int puntuacion;
	
	@ManyToOne
	private Producto producto;

	public Puntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public Puntuacion(int puntuacion, Producto producto) {
		this.puntuacion = puntuacion;
		this.producto = producto;
	}
	
}
