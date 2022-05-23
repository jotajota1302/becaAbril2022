package edu.es.eoi.view;

import java.util.List;
import java.util.Scanner;

import edu.es.eoi.Main;
import edu.es.eoi.controller.AlumnoController;
import edu.es.eoi.entity.Alumno;

public class Menu {

	public static void printMenuPrincipal() {

		System.out.println("GESTION INSTITUTO V1");
		System.out.println("-------------------------------");
		System.out.println("1 –Listado Alumnos");
		System.out.println("2 –Busca Alumno (DNI)");
		System.out.println("3 –Crear Alumno");
		System.out.println("4 –Modificar Alumno");
		System.out.println("5 –Eliminar Alumno");
		System.out.println("0 –SALIR");
		System.out.println("-------------------------------");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();

		AlumnoController.navigate(opcion);

	}

	public static void printMenuListado(List<Alumno> alumnos) {

		System.out.println("LISTADO ALUMNOS");
		System.out.println("-------------------------------");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println("-------------------------------");

		Main.main(null);

	}

	public static void printAlumno(Alumno alumno) {

		System.out.println("ALUMNO");
		System.out.println("-------------------------------");
		System.out.println(alumno);
		System.out.println("-------------------------------");

		Main.main(null);

	}
	
	public static Alumno printCreateAlumno() {

		Alumno alumno=new Alumno();
		
		System.out.println("Introduce dni:");		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String dni = scan.next();
		alumno.setDni(dni);
		
		System.out.println("Introduce nombre:");		
		scan = new Scanner(System.in);
		String nombre = scan.next();
		alumno.setName(nombre);
		
		return alumno;

	}

	public static String printMenuBusquedaAlumnoDni() {

		System.out.println("Introduce DNI:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String dni = scan.next();

		return dni;
		
	}
}
