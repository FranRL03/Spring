package com.salesinaos.triana.dam.practica;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepositorio extends JpaRepository<Task, Id> {

}
