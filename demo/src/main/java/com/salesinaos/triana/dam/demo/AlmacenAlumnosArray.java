package com.salesinaos.triana.dam.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlmacenAlumnosArray implements IAlmacenAlumnos {

	@Override
	public List<Alumno> findAll() {
		Alumno [] lista = new Alumno[] {
				
				Alumno.builder()
				.nombre("Fran")
				.apellido("Ruiz")
				.fechaNacimiento(LocalDate.of(2003, 2, 7))
				.build()
		};
		return Arrays.asList(lista);
	}

}
