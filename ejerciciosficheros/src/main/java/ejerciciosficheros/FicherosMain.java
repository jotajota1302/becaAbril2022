package ejerciciosficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosMain {
	
	public static void main(String[] args) throws IOException {
		
		//crear un fichero con lineas de informacion
		
//		FileWriter writer=new FileWriter("src/main/resources/pepito.txt",false);
//		writer.write("Esta es mi informacion linea 1 \n");
//		writer.write("Esta es mi informacion linea 2");
//		writer.flush();
//		writer.close();
//		
//		FileReader fr = new FileReader("src/main/resources/pepito.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String linea=br.readLine();
//		
//		while(linea!=null) {
//			System.out.println(linea);
//			linea=br.readLine();
//		}
//		
//		br.close();
		
		System.out.println(findDni("JJ"));
		
		
	}

	private static String findDni(String nombre) throws FileNotFoundException, IOException {
		
		FileReader fr = new FileReader("src/main/resources/alumnos.txt");
		BufferedReader br = new BufferedReader(fr);
		String linea=br.readLine();
		
		while(linea!=null) {
			
			if(linea.contains(nombre)) {
				String dni=linea.substring(linea.indexOf(",")+1,linea.length());
				return dni;
			}		
			
			linea=br.readLine();
		}
		
		br.close();
		
		return "";
	}
	

}
