package com.salesianostriana.dam.e06fechas.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.dam.e06fechas.model.Alumno;
import com.salesianostriana.dam.e06fechas.servicios.AlumnoServicio;

@Controller
public class AlumnoController {
	
	private AlumnoServicio alumnoServicio;
	
	public AlumnoController(AlumnoServicio servicio) {
		alumnoServicio = servicio;
	}
	
	//Controller para mostrar la página list con la lista de alumnos
	//Inicialmente no muestra ninguno
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("alumnos", alumnoServicio.findAll());
		return "list";
	}
	
	//En el html list, podemos ver el th:href que nos lleva hasta este controller
	//que muestra primero con este método el formulario vacío que se gestionará 
	//en el último método, procesaFormulario
	@GetMapping("/nuevo")
	public String muestraFormulario(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "form";
	}
	
	/* Redirect:
	 * Significa que al acabar el proceso del controller, no lleva a una 
	 * página html sino que nos lleva a otro controller, en este caso, 
	 * de nuevo al controller que pinta la lista de alumnos, el método
	 * controller que tiene en el GetMapping la barra. Esto
	 * se hace así para "actualizar" la lista con el nuevo alumno insertado
	 * después de procesar el formulario
	 * */
	@PostMapping("/nuevo/submit")
	public String procesaFormulario(@ModelAttribute("alumno") Alumno alumno) {
		/*Como fecha de último acceso no es un campo del formulario, estamos creándola aquí
		 * para poder tenerla en el alumno*/
		alumno.setFechaUltimoAcceso(LocalDateTime.now());
		alumnoServicio.save(alumno);
		
		return "redirect:/";
	}

}
