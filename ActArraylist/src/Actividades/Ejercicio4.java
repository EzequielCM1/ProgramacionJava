package Actividades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        // Creamos un ArrayList de nuemros
        ArrayList<Double> numeros = new ArrayList<>();
        
        // Creamos una instancia de Random para generar valores aleatorios
        Random random = new Random();
        
        // Llenamos la lista con 10 valores aleatorios 
        for(int i = 0; i < 10 ; i++) {
            numeros.add(random.nextDouble() * 100);
        }

        // Mostramos la lista 
        System.out.println("Lista de números aleatorios: " + numeros);

        // Creamos un iterador para recorrer la lista
        Iterator<Double> iterator = numeros.iterator();
        
        // Variable para almacenar el primer número mayor a 50 encontrado
        Double encontrado = null;

        // buscamos el primer número mayor a 50
        while (iterator.hasNext()) {
            Double num = iterator.next();
            if (num > 50) {
                encontrado = num; 
                break; 
            }
        }

        // Mostramos el número encontrado , en caso de no se lo indicamos 
        if (encontrado != null) {
            System.out.println("Primer número mayor a 50 encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró ningún número mayor a 50.");
        }
    }
}
