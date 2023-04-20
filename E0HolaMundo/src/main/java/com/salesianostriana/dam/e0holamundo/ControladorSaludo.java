package com.salesianostriana.dam.e0holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSaludo {
	
	/*
	 * El GetMapping se le pone entre paréntesis es la palabra que
	 *llama al método de la petición cada vez que en la ruta se ponga esa 
	 *palabra.
	 *
	 *Cuando se quiere atender a más de una se pone entre llaves y separadas por
	 *una coma.
	 */
	
	@GetMapping({"/", "welcome"})
	public String welcome (@RequestParam(name="nombre", required=false, defaultValue= "Mundo") String
			nombre, Model model) {
		
		model.addAttribute("nombre", nombre);
		
		return "Index";
		
	}
	
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		
		model.addAttribute("persona", new Persona ("Fran", "Ruiz Lebron"));
		
		return "SaludoPersonalizado";
	}
	
	@GetMapping("/saludo3")
	public String welcome3 (Model model) {
		
		model.addAttribute("saludo", "Hola Mundo");
		model.addAttribute("mensaje", "Se me está haciendo largo el proyecto final");
		model.addAttribute("url", "https://triana.salesianos.edu");
		
		return "SaludoYEnlace";
	}

}
