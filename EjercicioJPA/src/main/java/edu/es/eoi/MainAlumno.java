package edu.es.eoi;

public class MainAlumno {

	public static void main(String[] args) {

		AlumnoRepository repository= new AlumnoRepository();
		
		//crear un alumno		
		Alumno alumno1= new Alumno();
		alumno1.setName("JJ");
		alumno1.setNif("67423468B");
		
		repository.create(alumno1);
		
		//read alumno		
		Alumno result = repository.read(6);
		System.out.println(result.getName());
		
		//como modifico un registro		
		Alumno toUpdate=repository.read(6);
		toUpdate.setAge(30);
		
		repository.update(toUpdate);
		
		//delete un registro		
		Alumno toDelete=repository.read(6);				
		repository.delete(toDelete);		
		
		
	}

}
