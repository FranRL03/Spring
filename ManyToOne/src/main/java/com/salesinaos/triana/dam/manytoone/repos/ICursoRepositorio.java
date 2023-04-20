package com.salesinaos.triana.dam.manytoone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesinaos.triana.dam.manytoone.model.Curso;


public interface ICursoRepositorio extends JpaRepository<Curso, Long> {

}
