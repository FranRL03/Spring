package com.salesinaos.triana.dam.demodata;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	
	@Autowired
	private IAlumnoRepositorio alumnoRepositorio;
	
	@PostConstruct
	public void ejecutar() {
		
		Alumno a1 = Alumno.builder()
				//.id(1L)
				.nombre("Fran")
				.apellidos("Ruiz")
				.email("fran@gmail.com")
				.fechaNacimiento(LocalDate.of(2003, 2, 7))
				.build();
		
		alumnoRepositorio.save(a1);
				
			
		List<Alumno> result = alumnoRepositorio.findAll();
		
		result.forEach(System.out::println);
	}
	

}
