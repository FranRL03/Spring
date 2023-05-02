package com.salesianostriana.dam.e04formularios1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Empleado {
	
	@Id
	@GeneratedValue
    private long id;
	private String nombre;
    private String email;
    	
}
