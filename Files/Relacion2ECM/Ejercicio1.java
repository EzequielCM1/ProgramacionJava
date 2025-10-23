package Relacion2ECM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamosun arrayList para almacenar cada linea en un string 
		List<String> lineas = new ArrayList<>();
		//Se  declara la variable para leer y lo ponemos nulo
		BufferedReader reader= null;
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion2ECM\\fichero.txt");
		fichero.setReadable(true);// Le damos permisos de lectura
        
		//Iniciamos el try catch
		try {
			
			//Metemos en el reader el fichero para poder leerlo
			reader = new BufferedReader(new FileReader(fichero));
			//Atributo
			String Linea;
			// Hacemos un bucle para que por cada linea del archivo lo almacene en la coleccion
			while((Linea = reader.readLine()) != null) {
				lineas.add(Linea);
			}
			
			//Hacemos un bucle para mostrar por pantalla cada linea
			for(String l : lineas) {
				System.out.println(l);
			}
			
			//Mostramos mensaje de error
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
