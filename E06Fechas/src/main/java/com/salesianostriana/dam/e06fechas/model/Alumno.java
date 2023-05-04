package com.salesianostriana.dam.e06fechas.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Anotaciones de Lombok y entidad
@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alumno {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String apellidos;
	private String email;
	
	
	//Anotamos con @DateTimeFormat de Spring para indicar el formato en el que queremos 
	//la fecha, en este caso, año, mes y día aunque realmente, indicamos cómo se muestra
	//en el html, dentro de #temporals.format(alumno.fechaNacimiento, 'dd/MMM/yyyy HH:mm')
	//e incluso dependiendo del navegador y la internacionalización se mostrará de 
	//una u otra forma, pero si queremos dar luego formato hay que usar esta anotación
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	//No anotamos la forma para ver cómo se puede mostrar "por defecto"
	private LocalDateTime fechaUltimoAcceso;
		
	/**
	 * @param nombre
	 * @param apellidos
	 * @param email
	 */
	public Alumno(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}


	/**
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param fechaNacimiento
	 */
	public Alumno(String nombre, String apellidos, String email, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
	
}