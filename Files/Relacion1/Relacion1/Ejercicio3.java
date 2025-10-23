package Relacion1;

import java.io.File;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Instanciamos el fichero 
		File fichero1 = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\fichero1.txt");
		File fichero2 = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1");
		
		//Hacemos el try catch
		try {
			//creamos el fichero
			if(!fichero1.exists()) {
			fichero1.createNewFile();
			}
			//Comprobamos si existe 
		if (fichero1.exists()) {
			//En caso de que exista indicamos si es un fichero
		    if(fichero1.isFile()) {
		    	System.out.println(fichero1.getName() + " es un fichero ");
		    	// En caso de ninguno muestre error 
		    }else {
		    	System.out.println(fichero1.getName() + " es un directorio");
		    }
		}else {
		    System.out.println("El fichero no existe!");
		}
		
		//Comprobamos si existe 
		if(fichero2.exists()) {
			//Si es un directorio se lo indicamos 
		if(fichero2.isDirectory()) {
			System.out.println(fichero2.getName() + " es un directorio ");
		}else {
			System.out.println(fichero2.getName()+" es un fichero");
		}
		// En caso de ninguno muestre error 
		}else {
			System.out.println("No se encuentra la ruta");
		}
		// En caso de ninguno muestre error 
		}catch (Exception e) {
			System.out.println("Algo ha ocurrido ... "+ e.getMessage());
		}
	}

}
