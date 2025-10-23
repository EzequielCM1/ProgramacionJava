package Actividad3;

public abstract class Articulo {
	//Atributo
	public String nombre;
	
	//Contructor
	public Articulo (String nombre) {
		this.nombre=nombre;
	}
	
	//Metodo abstracto que estra vacio
	public abstract void  mostrarDetalles();
	//Metodo sobrecargado 
	public void mostrarDetalles(boolean mostrar) {}
}
