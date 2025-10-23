package Relacion2ECM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos un hasset para no permitir duplicados y para almacenar cada palabra en un string 
		HashSet<String> palabras = new HashSet<>();
		//Se  declara la variable para leer y lo ponemos nulo
		BufferedReader reader= null;
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion2ECM\\fichero.txt");
		fichero.setReadable(true);// Le damos permisos de lectura

		try {
			//Metemos en el reader el fichero para poder leerlo
			reader = new BufferedReader(new FileReader(fichero));
			//Atributo
			String Linea;
			
			// Hacemos un bucle para que por cada linea del archivo lo almacene en la coleccion
			while((Linea = reader.readLine()) != null) {
				// Dividimos la línea en palabras usando espacios en blanco como separador
	            String[] palabrasArray = Linea.split("\\s+");
	            for (String palabra : palabrasArray) {
                    palabras.add(palabra); // Se almacenan las palabras únicas
                }
			}	
			//Hacemos un bucle para mostrar por pantalla cada linea
			for(String l : palabras) {
				System.out.println(l);
			}
		}catch (IOException e) {
				System.out.println("Hay un error al leer : "+ e.getMessage());
			}finally { // para que haga si o si a pesar del error
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
