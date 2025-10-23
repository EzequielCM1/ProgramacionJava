package Abstacto;

public class Bici extends Vehiculo {

	//Atributo
	String tipo;
	//Contructor
	public Bici(String marca, String tipo) {
		super (marca);
		this.tipo=tipo;
	}
	//Metodo
	@Override
	public void arrancar() {
		System.out.println("La bici "+tipo+" ha arrancado");
		
	}
	
	//con sobrecarga
	@Override 
	public void arrancar (int velocidad ) {
		System.out.println("La bici "+marca+ " va " +velocidad+ "km/h");
	}
}
