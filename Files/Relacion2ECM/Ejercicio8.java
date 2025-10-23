package Relacion2ECM;

import java.io.*;
import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\diasSemana.txt");
		// Declaramos la variable y lo ponemos nulo para cuando inciemos el try catch este lo abra 
		BufferedWriter writer = null ;
		fichero.setWritable(true);// nos damos permisos de escritura

		//Array de la semana 
		List<String> listaDias = new ArrayList<>();
		listaDias.add("Lunes");
		listaDias.add("Martes");
		listaDias.add("Miércoles");
		listaDias.add("Jueves");
		listaDias.add("Viernes");
		listaDias.add("Sábado");
		listaDias.add("Domingo");
		
		
		try {
		//Creamos el fichero si no existe 
		if(!fichero.exists()) {
		fichero.createNewFile();	
		}
		// Abrir el fichero para escritura
		writer = new BufferedWriter(new FileWriter(fichero));
		
		//Atributo contador para que al llegar al ultimo dia este lo escriba sin la coma 
		int contador = 0;
		for (String dia : listaDias) {
		    writer.write(dia);
		    contador++;
		    //Mientras sea menor este escribe la coma para separlos
		    if (contador < listaDias.size()) {
		        writer.write(", ");
		    }
		}
			
	
		System.out.println("Se ha creado correctamente los dias de la semana");
		}catch (IOException e) {
			 System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}finally {
			//aun que haya error cerrar la escritura
			try {
				if (writer != null) {
		    		writer.close();
		         }
		        //Mensaje de error
		    } catch (IOException e) {
		               System.out.println("Error al cerrar el fichero: " + e.getMessage());
		    }
		}
	}

}
