package Actividad4;

public abstract class Notificacion {
	//Atributos
	String mensaje;
	
	//Contructor
	public Notificacion (String mensaje) {
		this.mensaje=mensaje;
	}
	
	//Metodo abstrapto vacío
	public abstract void enviar();
	//Metodo sobrecargado 
	public void enviar(String destinatario) {
		
	}

}
