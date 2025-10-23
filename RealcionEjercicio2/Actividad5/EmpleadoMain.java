package Actividad5;

import java.util.Scanner;

public class EmpleadoMain {

	public static void main(String[] args) {
		// Scanner con el nombre de teclado
		Scanner teclado = new Scanner(System.in);
		
		//Atributos
		int opcion;
		
		//Instanciamos los empleados
		Empleado empleado1 = new EmpleadoTiempoCompleto("Juan Alberto", 1500 );
		Empleado empleado2 = new EmpleadoPorHoras("Juan Alberto", 20 );
		
			// Mostramos las opciones en pantalla y recogemos la opción
	            System.out.println("Que Empleados deseas ver : ");
	            System.out.println(" 1.Ver empleados de tiempo Completo");
	            System.out.println(" 2.Ver empleados por horas ");
	            opcion= teclado.nextInt();
	            
	       // Hacemos un switch para que segun la opcion te muestre datos diferentes 
		switch(opcion) {
		case 1 :
			System.out.println("Empleados de tiempo Completo");
			empleado1.calcularSalario(50);
			break;
			
		case 2:
			System.out.println("Empleados por Horas");
			empleado2.calcularSalario(30);
		
		 default:
             System.out.println("Opción no válida. Por favor introduce el numero de la opcion");
             break;
		}
		
		// Cerramos el scanner 	
	teclado.close();
	}

}
