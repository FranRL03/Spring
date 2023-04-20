package com.salesianostriana.dam.e02buclesyswitch;



import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {

	private long id;	
	private String name;	
	private String description;	
	private double price;	
	private boolean inStock = false;
	
	//Importar la librería de Spring, de las dos que salen 
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime date; 

}
