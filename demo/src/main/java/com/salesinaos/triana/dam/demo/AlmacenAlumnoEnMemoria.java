package com.salesinaos.triana.dam.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class AlmacenAlumnoEnMemoria implements IAlmacenAlumnos {
	
private List <Alumno> lista;
	
	@PostConstruct
	public void init() {
		
		lista = new ArrayList<>();
		
		lista.add(Alumno.builder()
				.nombre("Fran")
				.apellido("Ruiz")
				.fechaNacimiento(LocalDate.of(2003, 2, 7))
				.build());
		
		lista.add(Alumno.builder()
				.nombre("Rafa")
				.apellido("Hernandez")
				.fechaNacimiento(LocalDate.now())
				.build());
	}
	
	@Override
	public List<Alumno> findAll(){
		
		return Collections.unmodifiableList(lista);
		
	}

}
