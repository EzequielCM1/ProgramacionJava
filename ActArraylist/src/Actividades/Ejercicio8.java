package Actividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejercicio8 {

	public static void main(String[] args) {
		  // Hacemos un ArrayList de nombres
		ArrayList<String> nombres = new ArrayList<>();
		//Instanciamos los nombres
		nombres.add("Samuel");
		nombres.add("Carlos");
		nombres.add("Juan");
		nombres.add("Jorge");
		nombres.add("Daniel");
		nombres.add("Nacho");
		nombres.add("Alberto");
		
		//Instanciamos collection y usamos el sort para ordenar los nombres
		 Collections.sort(nombres);
		 
		// Instanciamos el iterador para recorrer el ArrayList
		Iterator<String> iterator = nombres.iterator();
		
		//Un bucle para que si existe un siguiente nombre en el array, este lo muestre por pantalla
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/* con lamba para ordernar y mostrar  (usalo ezequiel te lo advierto desde el pasado)
		Collections.sort(nombres);
		nombres.forEach((a) -> System.out.println(a));*/
	}

}
