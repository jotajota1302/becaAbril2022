package ejerciciosficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonExercices {

	public static void main(String[] args) throws IOException  {
		
//		
//		JSONObject json= new JSONObject();
//		json.put("nombre", "JJ");
//		json.put("dni", "12345678-A");	
//	
//		
//		Gson gson= new GsonBuilder().setPrettyPrinting().create();
//		String contenido=gson.toJson(json);
//		
//		FileWriter writter=new FileWriter(new File("src/main/resources/prueba.json"));
//		writter.write(contenido);
//		writter.close();
//		
//		FileReader reader=new FileReader(new File("src/main/resources/prueba.json"));
//		JSONObject leido=gson.fromJson(reader, JSONObject.class);
//		
//		System.out.println(leido);
		
		Asignatura matematicas=new Asignatura("Matematicas");
		Asignatura fisica=new Asignatura("Fisica");
		Asignatura historia=new Asignatura("Historia");
		
		Calificacion c1=new Calificacion(8, matematicas);
		Calificacion c2=new Calificacion(4, fisica);
		Calificacion c3=new Calificacion(8, historia);
		Calificacion c4=new Calificacion(10, matematicas);
		Calificacion c5=new Calificacion(3, fisica);
		Calificacion c6=new Calificacion(5, historia);
		
		List<Calificacion> calificaciones1=new ArrayList<Calificacion>();
		calificaciones1.add(c1);
		calificaciones1.add(c2);		
		calificaciones1.add(c3);
		
		List<Calificacion> calificaciones2=new ArrayList<Calificacion>();
		calificaciones2.add(c4);
		calificaciones2.add(c5);		
		calificaciones2.add(c6);
		
		Alumno a1= new Alumno("JJ","Jimenez",39,calificaciones1);
		Alumno a2= new Alumno("Raquel","Planelles",20,calificaciones2);
		Alumno a3= new Alumno("Pepito","Jimenez",18,calificaciones1);

		JSONObject alumnos=new JSONObject();
		
		alumnos.put("alumno1", a1);
		alumnos.put("alumno2", a2);
		alumnos.put("alumno3", a3);		
		
		Gson gson= new GsonBuilder().setPrettyPrinting().create();
		FileWriter writter=new FileWriter(new File("src/main/resources/alumnos.json"));
		writter.write(gson.toJson(alumnos));
		writter.close();

		
	}

}
