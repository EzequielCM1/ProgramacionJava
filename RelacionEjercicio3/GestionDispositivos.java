package Ejercicio1;
import java.util.Scanner;
public class GestionDispositivos {

	public static void main(String[] args) {
		
		// instanciamos el scanner con el nombre teclado
		
		Scanner teclado = new Scanner(System.in);
		
		//Intanciamos los objetos
		
		DElectronico eltelevisor = new Televisor();
        DElectronico elsmartphone = new Smartphone();

        // Atributos 
       
        boolean encendido = true; // Por defecto estará encendido
        int dispositivo=0;
        
        // Hacemos el do while para mostrar las opciones al usuario , recoger la opción
        // y para corregir los errores
       
        do {
        	System.out.println("Que dispositivo quieres controlar");
        	System.out.println("1. Televior");
        	System.out.println("2. Smartphone");
        	
        	dispositivo = teclado.nextInt();
        	
        	// If para verificar y si hay un error mostrarle por pantalla el error
        	
        	if(dispositivo>0 && dispositivo<=2) {
        	System.out.println("Todo esta correcto");
        	}else {
        		System.out.println("Porfavor introduzca el numero correcto de las opciones");
        	}
        }while(dispositivo<0 || dispositivo>2);
        
        // Hacemos un switch para segun el caso sea para una instancia del objeto u otro
       
        switch (dispositivo){
        	
        case 1 :
        	
        	//Preguntamos si está encendido y recogemos la opción
        	System.out.println("El televior esta encendido ? (Y/N)");
        	String opcion = teclado.next().toUpperCase();// yoUppercase por si el usuario lo escribe en minúscula 
        	
        	// Si está apagado , ponemos falso al estado encendido
        	if(opcion.equalsIgnoreCase("N")) {
        		encendido = false;
        	}
        	
        	// Un if para segun el estado llama a un meto u otro
        	if (encendido) {
        		eltelevisor.encender();
        	}else {
        		eltelevisor.apagar();
        	}
        	break;
        	
        case 2:
        	//Preguntamos si está encendido y recogemos la opción
        	System.out.println("El smartphone esta encendido ? (Y/N)");
        	String opcion1 = teclado.next().toUpperCase();// yoUppercase por si el usuario lo escribe en minúscula 
        	
        	// Si está apagado , ponemos falso al estado encendido
        	if(opcion1.equalsIgnoreCase("N")) {
        		encendido = false;
        	}
        	
        	// Un if para segun el estado llama a un meto u otro
        	if (encendido) {
        		elsmartphone.encender();
        	}else {
        		elsmartphone.apagar();
        	}
        	break;
        	
        }
        // cerramos el scanner
       teclado.close() ;
    }
		
		
	}
