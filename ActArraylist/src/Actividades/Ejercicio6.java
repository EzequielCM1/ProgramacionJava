package Actividades;

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Crear un ArrayList numeros
		ArrayList<Integer> numeros = new ArrayList<>();
		//Hacemos un bucle for para instanciar numero del 1 al 10 y asio ahorrar codigo
		for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
		//Mostramos en pantalla 
		 System.out.println("Números multiplicados por 2:");
		 //Hacemos un buvle que recorra cada nuemro y en el muestre la multiplicacion 
	        for (int num : numeros) {
	            System.out.println(num * 2);
	        }
	}

}
