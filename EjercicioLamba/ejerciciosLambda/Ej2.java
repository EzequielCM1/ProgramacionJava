package ejerciciosLambda;

import java.util.ArrayList;

public class Ej2{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        // Esto remueve aquellos valores con la condicion(if) de que sean pares 
        numeros.removeIf(numero -> numero%2==0);

        System.out.println(numeros);
    }
}

