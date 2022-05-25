package ejerciciosficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class PokemonMain {
	
	public static Pokemon[] pokemon;
	
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
				
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject json=gson.fromJson(new FileReader("src/main/resources/pokemon.json"),JsonObject.class);
		
		Pokemon[] pokemon = gson.fromJson(json.get("pokemon"), Pokemon[].class);
		
		Map<Integer,Pokemon> pokemonMap=new HashMap<Integer, Pokemon>();
		
		for (int i = 0; i < pokemon.length; i++) {
			pokemonMap.put(Integer.valueOf(pokemon[i].getNum()), pokemon[i]);
		}			
		
		System.out.println("Introduce un numero: ");
	
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);		
		int opcion=scanner.nextInt();
		
		if(opcion>251) {
			
			System.out.println("no existe");
			main(args);
			
		}else{			
			System.out.println(pokemonMap.get(opcion).getName());			
		}
		
		main(args);
		
	}

}
