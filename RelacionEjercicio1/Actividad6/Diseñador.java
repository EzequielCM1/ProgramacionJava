package Actividad6;

public class Diseñador extends Empleado{
	
	//Creamos el contructor de Diseñador
	public Diseñador(String nombre) {
        super(nombre); 
    }
	
	//Modificamos el metodo de mostrar detalles paara en caso de ser Diseñador
	@Override
	public void mostrarDetalles() {
		System.out.println(nombre + " está en Diseño");
	}
}
