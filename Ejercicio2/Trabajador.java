package Ejercicio2;

public abstract class Trabajador {
	String nombre;
	int edad;
	String puesto;
	double salarioB;
	
	
	public Trabajador (String nombre, int edad, String puesto, double salarioB) {
		this.nombre=nombre;
		this.edad=edad;
		this.puesto=puesto;
		this.salarioB=salarioB;
		
	}
	
	
	public abstract double calcularSalario();
	
	
}
