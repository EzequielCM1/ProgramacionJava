package Actividad2;

public class Coche  extends Vehiculo{
	//Atributos
	double litros;
	
	//Contructor
	public Coche (String marca,double litros) {
		super(marca);
		this.litros=litros;
	}
	
	//Metodos
	@Override
	public void cargarCombustible() {
		
	}
	@Override
	public void cargarCombustible (double litros) {
		System.out.println("El coche "+marca+" se esta llenando "+litros+"L de Gasolina");
	}
}
