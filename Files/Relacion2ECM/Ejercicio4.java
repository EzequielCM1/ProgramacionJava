package Relacion2ECM;

import java.io.*;
import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Se  declara la variable para leer y lo ponemos nulo
		BufferedReader reader= null;
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\fichero.txt");
		fichero.setReadable(true);// Le damos permisos de lectura

		//Creamos un array hashset para evitar duplicados
		Set<String> CJava = new HashSet<String>();
		
		try {
			//Metemos en el reader el fichero para poder leerlo
			reader = new BufferedReader(new FileReader(fichero));
			//Atributo
			String linea ;
			
			//Hacemos un bucle para almacenar las lineas que contenga JAVA
			while((linea = reader.readLine()) != null) {
				// Si contiene java lo almacene el hashset
				if(linea.contains("Java")) {
					CJava.add(linea);
				}
			}
			
			// Mostrar lso resultados
			for(String li : CJava) {
				System.out.println(li);
			}
			
			
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
