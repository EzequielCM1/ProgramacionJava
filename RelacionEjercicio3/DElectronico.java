package Ejercicio1;

public interface DElectronico {
	    // Método abstracto
		abstract void encender(); 
		
		// Método predeterminado
	    default void apagar() { 
	        System.out.println("El dispositivo se apaga");
	    }
	}
