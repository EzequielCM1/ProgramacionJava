package Relacion1;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		//Instanciamos el fichero 
		File fichero1 = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\miFichero.txt");
		
		try {
			//Si no existe creamos el fichero
			if(!fichero1.exists()) {
				fichero1.createNewFile();
			}
			
			//Comprobamos los permisos de lectura
			if (fichero1.canRead()) {
			    System.out.println(fichero1.getName() + " tiene permisos de lectura");
			}else {
			    System.out.println(fichero1.getName() + " no tiene permisos de lectura");
			}
			//Comprobamos los permisos de escritura
			if (fichero1.canWrite()) {
			    System.out.println(fichero1.getName() + " tiene permisos de escritura");
			}else {
			    System.out.println(fichero1.getName() + " no tiene permisos de escritura");
			}
			//Comprobamos los permisos de ejecucion
			if (fichero1.canExecute()) {
			    System.out.println(fichero1.getName() + " tiene permisos de ejecución");
			}else {
			    System.out.println(fichero1.getName() + " no tiene permisos de ejecución");
			}

			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
