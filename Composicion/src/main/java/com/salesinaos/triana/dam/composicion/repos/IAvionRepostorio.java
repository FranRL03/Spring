package com.salesinaos.triana.dam.composicion.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesinaos.triana.dam.composicion.modal.Avion;

public interface IAvionRepostorio extends JpaRepository<Avion, Long> {

}
