package Relacion2ECM;

import java.io.*;
import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Intanciamos el fichero
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\Relacion2ECM\\diasSemana.txt");
		// Declaramos la variable y lo ponemos nulo para cuando inciemos el try catch este lo abra 
		BufferedWriter writer = null ;
		fichero.setWritable(true);// nos damos permisos de escritura

		//Creamos un array set
		Set<String> mesesAño = new LinkedHashSet<>();
		mesesAño.add("Enero");
        mesesAño.add("Febrero");
        mesesAño.add("Marzo");
        mesesAño.add("Abril");
        mesesAño.add("Mayo");
        mesesAño.add("Junio");
        mesesAño.add("Julio");
        mesesAño.add("Agosto");
        mesesAño.add("Septiembre");
        mesesAño.add("Octubre");
        mesesAño.add("Noviembre");
        mesesAño.add("Diciembre");
				
				
		try {
			//Creamos el fichero si no existe 
			if(!fichero.exists()) {
				fichero.createNewFile();	
			}
			// Abrir el fichero para escritura
			writer = new BufferedWriter(new FileWriter(fichero, true));
		
			//Para separar con los meses de la semana
			writer.newLine();
			
			int contador=0;
			// Con el for loop que nos garantiza el orden , podemos recorrer el HasSet y escribir los meses
			for(String mes : mesesAño) {
				writer.write(mes);
				contador ++;
				if(contador < mesesAño.size()) {
					writer.write(", ");
				}
			}
		
		System.out.println("Se ha creado correctamente los meses del año ");
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
