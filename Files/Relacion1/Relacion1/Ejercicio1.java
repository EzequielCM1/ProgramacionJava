package Relacion1;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear el fichero
        File fichero = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\Relacion1\\miFichero.txt");
        try {
        	//comprobamos si existe
        	if(fichero.exists()) {
        		System.out.println("El fichero ya existia");
        	}else {
        		//Si no existe este lo crea de nuevo 
        		fichero.createNewFile();
        		System.out.println("El fichero se ha creado correctamente ");
        	}
        	//Mensaje de error 
        }catch(IOException e) {
        	System.out.println("Algo ha salido mal " + e.getMessage());
        }

	}

}
