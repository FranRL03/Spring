package com.salesianostriana.dam.e02buclesyswitch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public List<Product> getLista() {
		return Arrays.asList(
				new Product(1, "Botijo", "Enfría agua hasta menos 10 grados", 20.5055, true, LocalDateTime.now()),
				new Product(2, "BotijoExtra", "Enfría agua hasta menos 200 grados", 200.50, true, LocalDateTime.now())
				);		
	}

}
