package Relacion1;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		//Instanciamos el fichero
		File ruta = new File ("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\miFichero.txt");

		try {
			//Comprobamos si existe el fichero
		if(ruta.exists()) {
			//Mostramos cuantos bytes ocupa
			System.out.println("El fichero "+ ruta.getName()+ " ocupa "+ruta.length()+ "Bytes");
		}else {
			//En caso de que no exista creamos el fichero y mostramos los datos 
			ruta.createNewFile();
			System.out.println("El fichero se ha creado correctamente");
			System.out.println("El fichero "+ ruta.getName()+ " ocupa "+ruta.length()+ "Bytes");
		}
		//Mensaje de error
		}catch (Exception e) {
			System.out.println("Se ha producido un error : " +e.getMessage());
		}
	}

}
