package ejerciciosLambda;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        
     List<Integer> cuadrados = new ArrayList<>();
     
     // con un foreach recorre el array de nuemros y lo meta en la lista de cuadrados 
        numeros.forEach(numero -> cuadrados.add(numero*numero));

      System.out.println(cuadrados);
    }
}

