package com.salesinaos.triana.dam.practica;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	
	@Autowired
	private ITaskRepositorio taskRepo;
	
	@PostConstruct
	public void ejecutar() {
		
		Task t = Task.builder()
				.tittle("Entorno")
				.done(true)
				.limitDate(LocalDate.now())
				.build();
		
		Task t2 = Task.builder()
				.tittle("Programación")
				.done(false)
				.limitDate(LocalDate.now())
				.build();
		
		taskRepo.save(t);
		taskRepo.save(t2);
		
		List<Task> result = taskRepo.findAll();
		
		result.forEach(System.out::println);
	}
	

}
