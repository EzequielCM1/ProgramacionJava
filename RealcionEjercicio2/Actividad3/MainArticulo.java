package Actividad3;

import java.util.Scanner;

public class MainArticulo {

	public static void main(String[] args) {
		
		// Hacemos un escanner pero para que sea mas comodo le cambio el nombre a teclado
		Scanner teclado = new Scanner(System.in);
		
				// Creamos los articulos 
		        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 25.00);
		        Electronico electronico = new Electronico("Laptop", "Dell", "XPS 13", 1500.00);
		    
		        // Atributo para almeenar la opcion
		        String opcion;
		        // Hacemos un do while para que el usuario no introduzca otro dato que no sea que S o N 
		        do {
		            System.out.print("¿Deseas mostrar los precios? (S/N): ");
		            opcion = teclado.nextLine().toUpperCase();
		        } while (!opcion.equals("S") && !opcion.equals("N"));

		        // Este if hace que si el usuario desea ver los precios los muestre  y en caso de que no 
		        // no lo muestra
		        // Le pongo true o flase segun cada caso
		        if (opcion.equals("S")) {
		        	System.out.println("Detalles del libro:");
		            libro.mostrarDetalles(true); 
		        } else {
		            libro.mostrarDetalles(false); 
		        }

		        
		        if (opcion.equals("S")) {
		        	System.out.println("Detalles del electrónico:");
		            electronico.mostrarDetalles(true); 
		        } else {
		            electronico.mostrarDetalles(false); 
		        }

		        teclado.close(); 
		    }
		     
	}


