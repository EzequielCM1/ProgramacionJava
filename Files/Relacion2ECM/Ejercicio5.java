package Relacion2ECM;

import java.io.*;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Se  declara la variable para leer y lo ponemos nulo
		BufferedReader reader= null;
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\fichero.txt");
		fichero.setReadable(true);// Le damos permisos de lectura

		//Creamos un array hashset para evitar duplicados
		Set<String> listaPalabras = new HashSet<String>();
				
		try {
			//Metemos en el reader el fichero para poder leerlo
			reader = new BufferedReader(new FileReader(fichero));
			//Atributo
			String linea ;
			
			while((linea = reader.readLine()) != null) {
				// Creamos un array donde almacenamos las palabras en minusculas y separamos por espacios y signos de puntuación
				String[] palabras = linea.toLowerCase().split("[\\s\\p{Punct}]+"); 
				
				// Hacemos un bucle para almacenar cada palabra 
				for(String sal : palabras) {
					// Para en caso de que No este vacio es decir contanga letras este lo almacene el el array
					if (!sal.isBlank()) {
                        listaPalabras.add(sal);
                    }
				}
			}
			 // Mostrar las palabras extraídas
	        System.out.println("Palabras en minúsculas :");
	        for (String palabra : listaPalabras) {
	            System.out.println(palabra);
	        }
			
	        // Mensaje de error
		}catch (IOException e) {
			System.out.println("Error al leer el archivo : " + e.getMessage());
		}finally {
			try {
				 // cerramos el flujo de lectura
	                if (reader != null) {
	                    reader.close();
	                }
	                // mensaje de error en pantalla
	            } catch (IOException e) {
	                System.out.println("Error al cerrar el fichero: " + e.getMessage());
	            }
		}
	}

}
