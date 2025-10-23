package interfaces;

public class Avion implements Volador {
	
	@Override
	public void volar() {
		System.out.println("El avion calienta los motores");
	}
	
	@Override 
	public void despegar () {
		System.out.println("El avion esta despegando ");
	}
}
