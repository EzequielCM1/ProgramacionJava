package Abstacto;

public class Coche extends Vehiculo{

	//Attributo
	// String marca;
	
	//Contructor
	
	public Coche (String marca) {
		super(marca);
	}
	
	// public Coche (String marca) {
	// 	this.marca=marca;
	// }
	
	//Metodo
	
	
	@Override
	public void arrancar() {
		System.out.println("El coche ah arrancado");
		
	}
	
	//Metodo de sobrecarga 
	@Override
	public void arrancar(int velocidad) {
		System.out.println("El coche " + marca +"ha arramcado a "+velocidad+"Km/h");
	}
	
}
