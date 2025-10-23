package Relacion2ECM;

import java.io.*;
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Se  declara la variable para leer y lo ponemos nulo
		BufferedReader reader= null;
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\fichero.txt");
		fichero.setReadable(true);// Le damos permisos de lectura
		Map<String, Integer> lista = new HashMap<>();
		
		try {
			//Metemos en el reader el fichero para poder leerlo
			reader = new BufferedReader(new FileReader(fichero));
			//Atributo
			String Linea;
			
			//Bucle para que mientras halla una linea lo almacene
			while((Linea = reader.readLine()) != null) {
				//Array para coger cada palabra quitando las tildes ,mayusculas y espacios
				String[] palabra = Linea.toLowerCase().replaceAll("[^a-zA-Záéíóúüñ]", " ").split("\\s+");
				// Bucle para almacenar cada palabra y si no esta vacia este almcane la palabra y sume la cantidad
                for (String pal : palabra) {
                    if (!pal.isEmpty()) {
                        lista.put(pal, lista.getOrDefault(pal, 0) + 1);
                    }
                }
			}
			

	        // Imprimir cada palabra con su frecuencia
	        lista.forEach((pal, count) -> System.out.println(pal + ": " + count));
			
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
