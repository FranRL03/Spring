package com.salesinaos.triana.dam.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
	
	@Bean
	public IAlmacenAlumnos almacenAlumnos() {
		
		return new AlmacenAlumnoEnMemoria();
	}

}
