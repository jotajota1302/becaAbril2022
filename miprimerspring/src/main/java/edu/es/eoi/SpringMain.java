package edu.es.eoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMain {

	@Autowired
	public Alumno temp;
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		FileSystemXmlApplicationContext context2=new FileSystemXmlApplicationContext("src/main/resources/spring.xml");
		
		Alumno alumnoTest=context2.getBean(Alumno.class);
		
		System.out.println(alumnoTest.getNombre());
		
		context.register(AlumnoService.class);
		context.refresh();
		
		context.register(Alumno.class);
		context.register(Perro.class);
		
		Alumno alumno1=context.getBean(Alumno.class);
		Alumno alumno2=context.getBean(Alumno.class);
		
		alumno2.setNombre("pepito");
		
		System.out.println(alumno1.getPerro().getRaza());
		
		AlumnoService service1= context.getBean(AlumnoService.class);
		AlumnoService service2= context.getBean(AlumnoService.class);
		AlumnoService service3= context.getBean(AlumnoService.class);
		AlumnoService service4= context.getBean(AlumnoService.class);
		AlumnoService service5= context.getBean(AlumnoService.class);
		AlumnoService service6= context.getBean(AlumnoService.class);		
		
		service1.doSomething();
		service2.doSomething();
		service3.doSomething();
		service4.doSomething();
		service5.doSomething();
		service6.doSomething();
		
		System.out.println("Helloworld");

		context.close();
		context2.close();
		
	}

}
