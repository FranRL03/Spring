package com.salesinaos.triana.dam.E07crudcompleto.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesinaos.triana.dam.E07crudcompleto.model.Alumno;
import com.salesinaos.triana.dam.E07crudcompleto.repositorios.AlumnoRepository;

/**
 * Clase que encapsula un servicio CRUD de alumnos. Se trata de un "envoltorio"
 * del repositorio de alumnos, ya que tendrá los mismos métodos, y ninguno más.
 * En ejemplos y tutoriales posteriores ofreceremos la posibilidad de crear un servicio
 * abstracto, del cual podrán extender los demás, para preocuparse solo de la 
 * lógica propia del servicio.
 */

@Service
public class AlumnoServicio {

	// Inyectamos la dependencia al nuevo estilo, sin @Autowired
		//(Si lo habéis visto con Luismi con @Autowired, lo hacéis con eso)
		private AlumnoRepository alumnoRepository;
		
		public AlumnoServicio(AlumnoRepository repo) {
			this.alumnoRepository = repo;
		}
		
		/**
		 * Inserta un nuevo alumno
		 * 
		 * @param a el Alumno a insertar
		 * @return El alumno ya insertado (con el Id no vacío).
		 */
		public Alumno add(Alumno a) { return alumnoRepository.save(a); }
		
		
		/**
		 * Edita un alumno, si existe; si no, lo inserta como uno nuevo.
		 * @param a
		 * @return
		 */
		public Alumno edit(Alumno a) { return alumnoRepository.save(a); }

		/**
		 * Elimina el alumno
		 * 
		 * @param a
		 */
		public void delete(Alumno a) { alumnoRepository.delete(a); }
		
		/**
		 * Elimina a un alumno por su Id
		 * @param id
		 */
		public void delete(long id) { alumnoRepository.deleteById(id); }
		
		/**
		 * Devuelve todos los alumnos
		 * @return
		 */
		public List<Alumno> findAll() { return alumnoRepository.findAll(); }
		
		
		/**
		 * Devuelve un alumno en base a su Id
		 * @param id
		 * @return el alumno encontrado o <code>null</code>
		 */
		public Alumno findById(long id) {
			return alumnoRepository.findById(id).orElse(null);
		}
}
