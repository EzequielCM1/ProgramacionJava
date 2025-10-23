package Ejercicio1;

public class Televisor implements DElectronico {
	
	// Modificamos el metodo encender 
	    @Override
	    public void encender() {
	        System.out.println("El televisor está encendido");
	    }

	// Sobre escribimos el metodo apagar
	    @Override
	    public void apagar() {
	        System.out.println("El televisor se apaga");
	    }
	}


