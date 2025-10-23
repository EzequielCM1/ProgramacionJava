package Actividad4;

public class NotificacionEmail extends Notificacion {
	//Artibutos
	String destinatario;
	
	//Contructor
	public NotificacionEmail (String destinatario, String mensaje) {
		super(mensaje);
		this.destinatario=destinatario;
		
	}

	//Metodos
	@Override
	public void enviar() {
	}
	
	@Override
	public void enviar(String destinatario) {
		System.out.println("Para : "+destinatario);
		System.out.println("Mensaje : "+mensaje);
		
	}
}
