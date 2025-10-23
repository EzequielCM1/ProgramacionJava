package Actividad2;

public class Vehiculo {
	
	//Atributos
	String marca;
	
	//Contructor del vehiculo
	public Vehiculo (String marca) {
		this.marca=marca;
		
	}
	
	//Creamos el metodo mover
	public void mover() {
		System.out.println("El vehiculo se esta moviendo");
	}
}
