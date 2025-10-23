package Actividad5;

public abstract class Empleado {
	//Atributos
	public String nombre;
	public double SalarioFinal;
	//Constructor
	public Empleado (String nombre) {
		this.nombre=nombre;
	}
	
	//Metodos
	
	//Metodo abstracto que estara vacio
	public abstract void calcularSalario();
	// Metodo cargado que coge la cantidad  bonus 
	public void calcularSalario(double bonus) {
		
	}
}
