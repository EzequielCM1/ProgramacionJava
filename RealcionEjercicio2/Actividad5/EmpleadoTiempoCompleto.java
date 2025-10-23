package Actividad5;

public class EmpleadoTiempoCompleto extends Empleado{
	// Atributos
	public double SalarioFijo;
	
	// Contructor
	public EmpleadoTiempoCompleto (String nombre ,double SalarioFijo) {
		super(nombre);
		this.SalarioFijo=SalarioFijo;
	}
	
	//Metodos
	@Override
	public void calcularSalario () {
		
	}
	@Override
	public void calcularSalario(double bonus) {
		// Creo un atributo salario final 
	double SalarioFinal ;
	SalarioFinal = SalarioFijo+ bonus;
	System.out.println(nombre + " cobra : "+ SalarioFinal+"€");
	}
}
