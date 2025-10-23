package Ejercicio3;

public abstract class Viaje {
	String destino;
	double precioBase;
	int duracion;
	
	
	public Viaje (String destino, double precioBase,int duracion) {
		this.destino=destino;
		this.precioBase=precioBase;
		this.duracion=duracion;
	}
	
	public abstract double calcularPrecio();
	
}
