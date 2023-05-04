package com.salesinaos.triana.dam.proyectoprovisional.model;

import java.time.LocalDate;
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
public class Hermano {
	
	@Id
	@GeneratedValue
	private long numHer;
	
	private String nombre, apellidos, dni;
	private LocalDate fechaAlta;
	private double cuota;
	private String cargo;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "papeleta", fetch = FetchType.EAGER)
	@Builder.Default
	private List <Papeleta> papeleta = new ArrayList<>();
	
	

}
