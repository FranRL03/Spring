package com.salesinaos.triana.dam.proyectoprovisional.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Papeleta {
	
	@Id
	@GeneratedValue
	private long numPapeleta;
	
	private long numHer;
	private double precio;
	private String titular, tipo;
	private LocalDate año;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_papeleta_hermano"))
	private Hermano hermano;
	
	/*
	 * MÉTODOS HELPER PARA LA ASOCIACIÓN CON CURSO
	 */
	
	public void sacarPapeleta(Hermano her) {
		this.hermano = her;
		her.getPapeleta().add(this);
		
	}
	
	public void retirarPapeleta(Hermano her) {
		her.getPapeleta().remove(this);
		this.hermano = null;
	}

}
