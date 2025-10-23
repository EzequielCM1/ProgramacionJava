package Relacion2ECM;

import java.io.*;
import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\notasTrimestre.txt");
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
            
            //Escribimos sobre el
            writer.write("Sistemas infórmaticos : 8");
            writer.newLine();
            writer.write("Base de datos : 4");
            writer.newLine();
            writer.write("Programación : 8");
            writer.newLine();
            writer.write("Lenguaje de marcas : 8");
            writer.newLine();
            writer.write("Entornos de desarrollo : 7");
            writer.newLine();
            writer.write("Digitalización : 8");
            writer.newLine();
            writer.write("Sostenibilidad : 9");
			
            //Mensaje de que se escribio correctamente 
            System.out.println("Se ha escrito las notas correctamente");
			
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
