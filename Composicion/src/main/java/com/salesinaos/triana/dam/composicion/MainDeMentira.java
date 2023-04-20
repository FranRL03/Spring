package com.salesinaos.triana.dam.composicion;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesinaos.triana.dam.composicion.modal.Asiento;
import com.salesinaos.triana.dam.composicion.modal.Avion;
import com.salesinaos.triana.dam.composicion.modal.TipoAsiento;
import com.salesinaos.triana.dam.composicion.repos.IAvionRepostorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	private final IAvionRepostorio repositorio;
	
	@PostConstruct
	public void ejecutar() {
		
		Avion airbus320 = Avion.builder()
				.modelo("Airbus 320")
				.numPasajeros(300)
				.build();
		
		for (int i = 1; i <=2; i++ ) {
			for(int j = 1; i<=6; j++ ) {
				airbus320.addAsientos(Asiento.builder()
						.tipo(TipoAsiento.PRIMERA)
						.fila(i)
						.columna(j)
						.build()
						);
			}
		}
		
		for (int i = 1; i <=2; i++ ) {
			for(int j = 1; i<=6; j++ ) {
				airbus320.addAsientos(Asiento.builder()
						.tipo(TipoAsiento.TURISTA)
						.fila(i)
						.columna(j)
						.build()
						);
			}
		}
		
		repositorio.save(airbus320);
		
		Asiento asiento = airbus320.getAsientos().get(0); 
		airbus320.removeAsiento(asiento);
		
	}

}
