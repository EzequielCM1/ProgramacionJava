package Relacion1;

import java.io.File;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Instanciamos el fichero
			File ruta = new File ("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\miFichero.txt");

			try {
			//comprobamos si existe en caso de no creael fichero
			if(!ruta.exists()) {
			ruta.createNewFile();
		}
				
		// Mostramos la ruta padre
			System.out.println(ruta.getParent());
				
		//Mostramos el mensaje de error
			}catch (Exception e) {
			System.out.println("Algo anda mal." + e.getMessage());
		}

	}

}
