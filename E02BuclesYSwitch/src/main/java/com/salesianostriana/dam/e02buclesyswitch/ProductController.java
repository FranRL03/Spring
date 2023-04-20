package com.salesianostriana.dam.e02buclesyswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Anotamos con controller
@Controller
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	/*Anotamos con el tipo de petición que atenderá este método, tipo get ("sin datos-parámetros"), 
	cuando se escriba en el navegador la ruta
	barra productos (después de localhost....
	*/
	@GetMapping ("/productos")
	public String controladorCondicionales (Model model){

		model.addAttribute("productList", service.getLista());
		return "PlantillaBucleYFormateo";//Se devuelve la plantilla en HTML
	}
}