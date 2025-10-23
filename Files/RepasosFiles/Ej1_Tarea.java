package RepasosFiles;

public class Ej1_Tarea {
	String nombre;
	String fechaLimit;
	
	public Ej1_Tarea (String nombre, String fechalimit) {
		this.nombre=nombre;
		this.fechaLimit=fechalimit;
	}
	
	public String meter() {
		return nombre+" fecha limite : "+ fechaLimit;
		
	}
	
}
