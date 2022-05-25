package ejerciciosficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonExercices {

	public static void main(String[] args) throws IOException  {
		
		
		JSONObject json= new JSONObject();
		json.put("nombre", "JJ");
		json.put("dni", "12345678-A");	
	
		
		Gson gson= new GsonBuilder().setPrettyPrinting().create();;
		String contenido=gson.toJson(json);
		
		FileWriter writter=new FileWriter(new File("src/main/resources/prueba.json"));
		writter.write(contenido);
		writter.close();
		
		FileReader reader=new FileReader(new File("src/main/resources/prueba.json"));
		JSONObject leido=gson.fromJson(reader, JSONObject.class);
		
		System.out.println(leido);
		
	}

}
