package Relacion2ECM;

import java.io.*;
import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\notas.txt");
		// Declaramos la variable y lo ponemos nulo para cuando inciemos el try catch este lo abra 
		BufferedWriter writer = null ;
		
		fichero.setWritable(true);// nos damos permisos de escritura

		try {
			//Creamos el fichero si no existe 
			if(!fichero.exists()) {
				fichero.createNewFile();	
			}
			 // Abrir el fichero para escritura
            writer = new BufferedWriter(new FileWriter(fichero));
            
            // Escribir nombre y nota
            writer.write("mi nombre es Ezequiel");
            writer.newLine();
            writer.write("Y la nota que espero es un 6.0 ");// Se hara lo que se pueda ;)
            System.out.println("Datos escritos correctamente");
			
            //Mensaje de error
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
