package com.salesinaos.triana.dam.manytoone.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String tutor, nombre;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER) //TODAS LAS PROPIEDADES QUE SEAN TO MANY AÑADIR EL FETCH
	@Builder.Default
	private List<Alumno> alumnos = new ArrayList<>();
	
	

}
