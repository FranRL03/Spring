package com.salesinaos.triana.dam.asociacionproyecto.model;

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
public class Venta {
	
	@Id
	@GeneratedValue
	private long idPedido;
	
	private LocalDate fecha;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_venta_cliente"))
	private Cliente cliente;
	
	/*
	 * MÉTODOS HELPER PARA LA ASOCIACIÓN CON CURSO
	 */
	
<<<<<<< HEAD
	public void addToCurso(Cliente cliente) {
=======
	public void addToCliente(Cliente cliente) {
>>>>>>> 33744bc2998eb9d78bc5d4421dfcddf99b5bf8ea
		this.cliente = cliente;
		cliente.getVenta().add(this);
	}
	
<<<<<<< HEAD
	public void removeToCurso(Cliente cliente) {
=======
	public void removeToCliente(Cliente cliente) {
>>>>>>> 33744bc2998eb9d78bc5d4421dfcddf99b5bf8ea
		cliente.getVenta().remove(this);
		this.cliente = null;
	}
	
	
	

}
