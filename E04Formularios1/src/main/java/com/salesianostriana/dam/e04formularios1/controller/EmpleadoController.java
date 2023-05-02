package com.salesianostriana.dam.e04formularios1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.e04formularios1.model.Empleado;

@Controller
public class EmpleadoController {

	/*Para los formularios necesitamos siempre dos métodos controladores (dos para cada formulario):
	 * Uno para VER (petición tipo Get) los campos/datos del formulario, es decir, 
	 * para pintar el formulario al comienzo del proceso antes de hacer nada, 
	 * si es de alta, por ejemplo, estará vacío, como en este caso 
	 * Otro para GESTIONAR (petición tipo Post) los datos que se recojan del formulario.
	 * Necesitamos que sea post, porque vamos a "mandar" datos en la petición, los recogidos de los 
	 * campos del formulario
	 * */
		
	/* Este primer método solo muestra el formulario y es igual a los que ya hemos usado en otras ocasiones
	 * un Model al que añadimos una instancia de nuestra clase modelo tipo Empleado
	 * sin ningún valor, por eso el objeto está vacío, petición tipo Get
	 * Atenderá a peticiones con la ruta empleado*/
	
	@GetMapping ("/empleado")
	public String showForm(Model model) {
		
		//Creado vacío porque es el que se usa para pintar el formulario 
		//sin datos que estamos creando
		
		Empleado empleado = new Empleado(); 		
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
		
	}

	/* Para la petición tipo Post (ojo, se anota con @PostMapping y la ruta
	 * Este método gestionará los datos que se introduzcan en el formulario recogiendo 
	 * los datos de los diferentes campos.
	 * Para ello añadimos la anotación @ModelAttribute como parámetro del método 
	 * para decirle de qué formulario debe coger los datos y montar un objeto
	 * (el mismo nombre que se escribe en el th:object del form en la plantilla)
	 * y "crear" un Empleado, de ahí el Empleado empleado
	 * Se le pasa también el model como siempre*/
	
	@PostMapping ("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado,  Model model) {

		//Se añade al modelo, el empleado que se creará al recoger los datos del formulario
		model.addAttribute("empleado", empleado);
		//En este ejemplo sencillo, se muestra la página con la información mandada en 
		//el formulario al pulsar el botón submit, no se guarda en la basa de datos, 
		//solo mostramos lo que se escribe en el formulario en otra página web
		return "view";
	}
	
}