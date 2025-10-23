package Actividades;
import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Arraylist de compañeros
		ArrayList<String> compañeros = new ArrayList<>();
	      
		//Agragar los compañeros al arraylist
	        compañeros.add("Ana");
	        compañeros.add("Carlos");
	        compañeros.add("Daniel");
	        compañeros.add("Rafael");
	        compañeros.add("Nacho");


	        // Interator para recorrer el ArrayList
	        Iterator<String> iterador = compañeros.iterator();

	        // Bucle que imprima los nombres de los compañeros y compruebe si hay siguiente compañero
	        //en caso de nulo este se cierre
	        while (iterador.hasNext()) {
	            System.out.println(iterador.next());
	        }

	}

}

