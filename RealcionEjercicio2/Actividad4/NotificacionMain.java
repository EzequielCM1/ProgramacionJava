package Actividad4;

import java.util.Scanner;

public class NotificacionMain {

	public static void main(String[] args) {
		//Creamos el Scanner y le puse de nombre teclado
		Scanner teclado = new Scanner(System.in);
			
		//Atributos
		String opcion;
			
			//Mostramos las opciones al usuario y lo ercogemos la opcion elegida
			System.out.println("Que deseas enviar un SMS o un Email");
			opcion= teclado.nextLine().toUpperCase();
			
			// Creamos un if para verificar que el usuario ah introducido los datos correctos . 
			// En el else es en caso que fuera erroneo
			if (opcion.equals("SMS") || opcion.equals("EMAIL")) {
				
				// Le pedimos al usuario el destinatario y lo metemos en un nuevo string 
                System.out.println("Indica el destinatario:");
                String destinatario = teclado.nextLine();

                // Le pedimos al usuario el mensaje y lo metemos en un nuevo string 
                System.out.println("Indica el mensaje:");
                String mensaje = teclado.nextLine();

                // Creamos otro if para que segun el caso introducimos los datos en diferentes subclases
                // Y se mostraria por pantalla
                if (opcion.equals("EMAIL")) {
                    Notificacion mensajeEmail= new NotificacionEmail(destinatario, mensaje);
                    mensajeEmail.enviar(destinatario);
                } else {
                    Notificacion mensajeSMS= new NotificacionSMS(destinatario, mensaje);
                    mensajeSMS.enviar(destinatario);
                }   
            } else {
                System.out.println("Opción inválida. Por favor, elige SMS o EMAIL.");
            }
			
		
	}

}
