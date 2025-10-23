package RepasosFiles;

public class Ej4_producto {
	int id ;
	String nombre;
	double precio;
	
	public Ej4_producto (int id, String nombre, double precio) {
		this.id=id;
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public String escribirEj4 () {
		return id+": "+nombre+ " cuesta "+precio;
	}
}
