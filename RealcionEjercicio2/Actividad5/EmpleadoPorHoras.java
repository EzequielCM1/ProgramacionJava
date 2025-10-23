package Actividad5;

public class EmpleadoPorHoras extends Empleado{
	// Atributos
	public int horas;
	// Eh creado un static para que siempre sea la misma cantidad que te paga por hora
	static final double PagoHora = 7;
	
	//Contructor
	public EmpleadoPorHoras (String nombre, int horas) {
		super(nombre);
		this.horas=horas;
	}
	
	// Metodos
	@Override
	public void calcularSalario () {
		
	}
	@Override
	public void calcularSalario(double bonus) {
		double SalarioFinal ;
		SalarioFinal = (PagoHora * horas) + bonus;
		System.out.println(nombre+ " cobra : "+SalarioFinal+"€");
	}
}
