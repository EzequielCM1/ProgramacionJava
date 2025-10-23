package Ejercicio2;

public class Supervisor extends Trabajador {
	double bonoExtra;
	
	
	public Supervisor(String nombre, int edad, String puesto, double salarioB, double bonoExtra) {
		super(nombre, edad, puesto, salarioB);
		this.bonoExtra=bonoExtra;
	}
	
	 @Override
	    public double calcularSalario() {
	        salarioB += bonoExtra;  // Suma el bono extra al salario base
	        return salarioB;  // Retorna el salario calculado
	    }
	
}
