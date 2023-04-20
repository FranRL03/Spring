package com.salesinaos.triana.dam.asociacionproyecto.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesinaos.triana.dam.asociacionproyecto.model.Cliente;

public interface IClienteRepositorio extends JpaRepository <Cliente, Long> {

}
