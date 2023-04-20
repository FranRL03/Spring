package com.salesinaos.triana.dam.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicioAlumnos {
	
	@Autowired
	@Qualifier("almacenAlumnoEnMemoria")
	private final IAlmacenAlumnos almacenAlumnos;
	
	/**
	 * Método que devuelve una listado con los nombres 
	 * de quellos alumnos que cumplen años hoy
	 * @return lista de nombres o lista vacía si no hay 
	 */
	
	public List<String> cumpleHoy(){
		List<String> result = new ArrayList<>();
		
		result = almacenAlumnos.findAll().stream()
			.filter(a -> a.getFechaNacimiento().getDayOfMonth()==
							LocalDate.now().getDayOfMonth() &&
						a.getFechaNacimiento().getDayOfMonth()==
							LocalDate.now().getDayOfMonth())
			.map(a -> a.getNombre()+ " "+ a.getApellido())
			.toList();
		
		return result;
	}

}
