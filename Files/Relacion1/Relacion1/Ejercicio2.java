package Relacion1;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos el fichero 
		File fichero = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\fichero_prueba.txt");

		
		try {
		//creamos el fichero
			if(!fichero.exists()) {
				fichero.createNewFile();	
			}
		
		//Comprobamos si el fichero existe 
		if(fichero.exists()) {
			System.out.println("El fichero existe");
		}else {
			System.out.println("El fichero no se encuentra");
		}
		//Mostramos el mensaje de error
		}catch (Exception e) {
			System.out.println("Algo ha ocurrido ... "+ e.getMessage());
		}
		
	}

}
