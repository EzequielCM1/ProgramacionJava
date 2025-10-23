package Ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Hacemos un ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<>();
        // Instanciamos Random para generar números aleatorios 
        Random random = new Random();
        
        // Hacemos un bucle para que cada número aleatorio se añada al ArrayList hasta el límite de 15
        for (int i = 0; i <= 15; i++) {
            int numero = random.nextInt(100);
            numeros.add(numero);
        }
        // Mostramos la lista de números aleatorios generados
        System.out.println("Lista de números: " + numeros);
        
        // Instanciamos el iterador para recorrer el ArrayList
        Iterator<Integer> iterator = numeros.iterator();
        
        // Un bucle para que si existe un siguiente número en el array, elimine el número si es múltiplo de 3
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        // Mostramos la lista de números modificada
        System.out.println("Lista de números después de eliminar: " + numeros);
    }
}
