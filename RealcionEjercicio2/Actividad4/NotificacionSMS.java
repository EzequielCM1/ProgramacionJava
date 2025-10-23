package Actividad4;

public class NotificacionSMS extends Notificacion{
	//Atributos
	String destinatario;
	
	//Contructor
	public NotificacionSMS (String destinatario, String mensaje) {
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
