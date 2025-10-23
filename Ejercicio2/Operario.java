package Ejercicio2;

public class Operario extends Trabajador{
	int horasTrabajadas;
	 static final int  tarifa = 9;
	
	public Operario(String nombre, int edad, String puesto, double salarioB ,int horasTrabajadas) {
		super(nombre, edad, puesto, salarioB);
		this.horasTrabajadas=horasTrabajadas;
	}
	
	
	 @Override
	    public double calcularSalario() {
	        salarioB = tarifa * horasTrabajadas;  // Calcula el salario por horas
	        return salarioB;  // Retorna el salario calculado
	    }

	    // Sobrecarga
	    public double calcularSalario(double bono) {
	        salarioB = tarifa * horasTrabajadas + bono;  // Calcula el salario con bono
	        return salarioB;  // Retorna el salario calculado
	    }
	
}
	