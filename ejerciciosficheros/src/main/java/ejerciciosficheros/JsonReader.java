package ejerciciosficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonReader {

	public static void main(String[] args) throws FileNotFoundException {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject json=gson.fromJson(new FileReader("src/main/resources/pokemon.json"),JsonObject.class);
		
		PokemonJson[] pokemon = gson.fromJson(json.get("pokemon"), PokemonJson[].class);

		for (int i = 0; i < pokemon.length; i++) {
			System.out.println("num:"+pokemon[i].getNum()+" name:"+pokemon[i].getName()+" img:"+pokemon[i].getImage()+" type:"+pokemon[i].getType());
		}
	
		
	}
	
}
