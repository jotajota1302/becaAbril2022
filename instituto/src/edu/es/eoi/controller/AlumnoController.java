package edu.es.eoi.controller;

import java.util.List;

import edu.es.eoi.Main;
import edu.es.eoi.entity.Alumno;
import edu.es.eoi.service.AlumnoService;
import edu.es.eoi.view.Menu;

public class AlumnoController {
	
	public static AlumnoService service=new AlumnoService();
	
	public static void navigate(int opcion) {
		
		Alumno alumno=null;
		
		switch (opcion) {
		case 1:			
			List<Alumno> alumnos = service.findAll();
			Menu.printMenuListado(alumnos);
			break;
		case 2:			
			String dni=Menu.printMenuBusquedaAlumnoDni();		
			alumno=service.findByDni(dni);
			Menu.printAlumno(alumno);
			break;
		case 3:			
			alumno=Menu.printCreateAlumno()	;
			service.createAlumno(alumno);
			Main.main(null);
			break;
		default:
			Main.main(null);
			break;
		}
		
	}

	
}
