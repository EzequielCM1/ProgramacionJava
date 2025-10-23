package Ejercicio;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {
    public static void main(String[] args) {
    	//Hacemos un ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<>();
        
        //Instanciamos diferentes números 
        numeros.add(22);
        numeros.add(59);
        numeros.add(89);
        numeros.add(75);
        numeros.add(52);
        numeros.add(29);
        numeros.add(19);
        numeros.add(65);
        numeros.add(82);
        numeros.add(99);
        
        // Instanciamos el iterador para recorrer el ArrayList
        Iterator<Integer> iterador = numeros.iterator();
        //Hacemos un bucle que mientras detecte que existe otro nombre , este lo muestre 
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        
        
    }
}
