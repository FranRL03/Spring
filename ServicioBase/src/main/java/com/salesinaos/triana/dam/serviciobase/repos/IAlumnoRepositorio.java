package com.salesinaos.triana.dam.serviciobase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesinaos.triana.dam.serviciobase.model.Alumno;

public interface IAlumnoRepositorio extends JpaRepository <Alumno, Long> {

}
