package Actividad2;

public class Camion extends Vehiculo {
	//Atributos
	double litros;
	
	//Contructor
	public Camion (String marca, double litros) {
		super(marca);
		this.litros=litros;
	}
	
	//Metodos
	@Override
	public void cargarCombustible() {
		
	}
	
	@Override
	public void cargarCombustible (double litros) {
		System.out.println("El camion "+marca+" se esta llenando "+litros+ "L de Diesel");
	}
}
