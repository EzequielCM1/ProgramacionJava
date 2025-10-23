package Ejercicio1;

public class Smartphone implements DElectronico{
	
	// Modificamos el metodo encender 
	@Override
    public void encender() {
        System.out.println("El smartphone está encendido");
    }
}
