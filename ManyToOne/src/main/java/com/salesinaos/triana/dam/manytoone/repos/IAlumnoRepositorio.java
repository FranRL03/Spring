package com.salesinaos.triana.dam.manytoone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesinaos.triana.dam.manytoone.model.Alumno;

public interface IAlumnoRepositorio  extends JpaRepository<Alumno, Long> {

}
