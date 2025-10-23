package Actividad1;

public abstract class Producto {

	//Atributos
	public String nombre;
	public double precio;
	public int codigo;
	
	//Constructor
	public Producto (String nombre, double precio, int codigo) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
	}
	
	//Metodo abstracto que estará vacío
	public abstract void calcularDescuento();
	
	//Metodo cargado que recoga el descuento
	public void calcularDescuento(double descuento) {}
	

}
