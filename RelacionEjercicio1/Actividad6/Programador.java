package Actividad6;

public class Programador extends Empleado {
	
	//Creamos el contructor del programador 
	public Programador(String nombre) {
        super(nombre); 
    }
	
	//Modificamos el metodo de mostrar detalles par en caso de ser Programador
	@Override
	public void mostrarDetalles() {
		System.out.println(nombre + " está en Programador");
	}
}
