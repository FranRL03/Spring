package com.salesianostriana.dam.e02buclesyswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	//Nuevamente anotamos con el tipo de petición que atenderá este método (get) 
	//cuando se escriba la ruta
	//localhost:9000/listGen
	
	@GetMapping("/listGen")
	public String listarVarios (Model model) {
			
		//Agregamos la lista al modelo como siempre, ojo al nombre. 
		//Debe ser el usado en el html
		
		model.addAttribute("customerList", service.getLista());
		
		return "PlantillaSwitch";
	}
	
}