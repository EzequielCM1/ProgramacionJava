package Relacion1;

import java.io.File;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		//Instanciamos el fichero
		File ruta = new File ("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\miFichero.txt");

		try {
			//comprobamos si existe en caso de no creael fichero
		if(!ruta.exists()) {
			ruta.createNewFile();
		}
		
		// Mostramos la ruta 
		System.out.println("La ruta es : "+ruta.getAbsolutePath());
		
		//Mostramos el mensaje de error
		}catch (Exception e) {
			System.out.println("Algo anda mal." + e.getMessage());
		}
	}

}
