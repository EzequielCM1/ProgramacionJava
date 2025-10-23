package Actividad3;

public class Gerente extends Empleado {
	
	// Contructor para llamar a la clase
	public Gerente (String nombre) {
		super(nombre);
	}
	
	//Modificamos el metodo trabajar
	 @Override
	    public void trabajar() {
	        System.out.println("Gestionando el equipo");
	    }
}
