package com.salesinaos.triana.dam.composicion.modal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
public class Avion {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String modelo;
	private int numPasajeros;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@Builder.Default
	@OneToMany(mappedBy="avion", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Asiento> asientos = new ArrayList<>();
	
	/* MÉTODOS HELPER */
	
	public void addAsientos(Asiento a) {
		a.setAvion(this);
		this.asientos.add(a);
	}
	
	public void removeAsiento(Asiento a) {
		this.asientos.remove(a);
		a.setAvion(null);
		
	}

}
