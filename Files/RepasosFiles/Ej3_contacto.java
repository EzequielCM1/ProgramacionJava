package RepasosFiles;

public class Ej3_contacto {
	String nombre;
	int telefono;
	String correo;
	
	public Ej3_contacto(String nombre, int telefono, String correo) {
	this.nombre=nombre;
	this.telefono=telefono;
	this.correo=correo;
	}
	
	public String mostrarej3() {
		return nombre + ", "+telefono+", "+correo ;
	}
}
