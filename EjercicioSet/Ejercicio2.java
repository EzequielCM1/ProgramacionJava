package EjercicioSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		
		// Mostrar si existe el numero 30
		Iterator<Integer> presente = numeros.iterator();
		while(presente.hasNext()) {
			if(presente.next() == 30) {
				System.out.println(" El nuemro 30 está en la lista" );
			}
		}
		
		// Imprimir el total de elementos
		System.out.println("El total de elementos es de : " +numeros.size());
		
		// eliminar el numero 20
		numeros.remove(20);
		System.out.println("Lista : ");
		System.out.println(numeros);
	}

}
