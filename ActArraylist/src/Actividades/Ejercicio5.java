package Actividades;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejercicio5 {

	public static void main(String[] args) {
		 // Crear un ArrayList de palabras
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Casa");
        palabras.add("Montaña");
        palabras.add("Perro");
        palabras.add("Automóvil");
        palabras.add("Sol");

        // Mostrar la lista
        System.out.println("Lista original: " + palabras);

        // Crear un iterador para recorrer la lista
        ListIterator<String> iterator = palabras.listIterator();

        // Iterar sobre los elementos de la lista y modificar los que tienen más de 5 caracteres
        while (iterator.hasNext()) {
            String palabra = iterator.next();
            if (palabra.length() > 5) {
                iterator.set("MODIFICADO");
            }
        }

        // Mostrar la lista después de la modificación
        System.out.println("Lista después de modificar elementos con más de 5 caracteres: " + palabras);
  

	}

}
