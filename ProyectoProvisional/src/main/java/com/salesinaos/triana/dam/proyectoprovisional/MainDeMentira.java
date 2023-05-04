package com.salesinaos.triana.dam.proyectoprovisional;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesinaos.triana.dam.proyectoprovisional.model.Hermano;
import com.salesinaos.triana.dam.proyectoprovisional.repos.IHermanoRepositorio;
import com.salesinaos.triana.dam.proyectoprovisional.repos.IPapeletaRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	private final IHermanoRepositorio hermanoRepo;
	private final IPapeletaRepositorio papeletaRepo;
	
	@PostConstruct
	public void ejecutar() {
		Hermano h1 = new Hermano();
		h1.setNombre("Fran");
		h1.setApellidos("Ruiz Lebron");
		h1.setDni("1111A");
		h1.setFechaAlta(LocalDate.of(2003, 4, 17));
		h1.setCuota(50);
		h1.setCargo(null);
		
		Hermano h2 = new Hermano();
		
		
		
	}

}
