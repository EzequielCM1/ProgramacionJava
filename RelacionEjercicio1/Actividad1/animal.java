package Actividad1;

public class animal {
	
	//Atributos
	String nombre;
	
	//Creamos el contructor de animal
	public animal(String nombre) {
		this.nombre=nombre;
	}
	
	//Creamos el metodo HacerSonido
	public void HacerSonido() {
		System.out.println("El Animal hace un sonido");
	}
}
