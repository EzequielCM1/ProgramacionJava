package interfaces;
// La clase superHeroe implementa la imterfaz Volador 
public class SuperHeroe implements Volador{
	String nombre;
	
	public SuperHeroe(String nombre) {
		this.nombre=nombre;
	}
	
	//Metodos
	@Override 
	public void volar() {
		System.out.println("El superHeroe" + nombre + "Esta volando");
	}
}
