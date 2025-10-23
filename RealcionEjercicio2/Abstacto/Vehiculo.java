package Abstacto;

public abstract class Vehiculo {
	
	String marca;
	
	//Contructor
	public Vehiculo(String marca) {
		this.marca=marca;
	}
	
	// metodo abstracto arrancar
	public  abstract void arrancar();
	//metodo concreto arrancar
	public void arrancar (int velocidad) {
		System.out.println("El vehiculo se ah arracado y esta andando a " + velocidad + "Km/h");
	}
}
