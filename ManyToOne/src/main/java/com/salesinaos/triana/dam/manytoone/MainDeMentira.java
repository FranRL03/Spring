package com.salesinaos.triana.dam.manytoone;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesinaos.triana.dam.manytoone.model.Alumno;
import com.salesinaos.triana.dam.manytoone.model.Curso;
import com.salesinaos.triana.dam.manytoone.repos.IAlumnoRepositorio;
import com.salesinaos.triana.dam.manytoone.repos.ICursoRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	private final IAlumnoRepositorio alumnoRepo;
	private final ICursoRepositorio cursoRepo;
	
	@PostConstruct
	public void ejecutar() {
		Alumno a1 = new Alumno();
		a1.setNombre("Fran");
		a1.setApellidos("Ruiz");
		a1.setEmail("fran@gmail.com");
		
		Alumno a2 = new Alumno();
		a2.setNombre("JJ");
		a2.setApellidos("Ruiz");
		a2.setEmail("jj@gmail.com");
		
		Curso c = new Curso();
		c.setNombre("1º DAM");
		c.setTutor("Miguel");
		
		cursoRepo.save(c);
		
		/*
		a1.setCurso(c);
		a2.setCurso(c);
		
		c.getAlumnos().add(a1);
		c.getAlumnos().add(a2);
		*/
		
		a1.addToCurso(c);
		a2.addToCurso(c);
		
		alumnoRepo.save(a1);
		alumnoRepo.save(a2);
		 
		
		List<Curso> cursos = 
				cursoRepo.findAll();
		
		/* for(Curso curso : cursos) {
			System.out.println(curso);
			for(Alumno a : curso.getAlumnos()) {
				System.out.println(a);
			}
		} */
		
		System.out.println(c);
		for(Alumno a : c.getAlumnos()) {
			System.out.println(a);
		}
		
	}

}
