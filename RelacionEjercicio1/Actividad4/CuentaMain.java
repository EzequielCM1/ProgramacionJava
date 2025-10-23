package Actividad4;

public class CuentaMain {

	public static void main(String[] args) {
		
		//Creamos el objeto
		CuentaDeAhorros micuenta = new CuentaDeAhorros("Ezequiel", 3000, 8);

		//Depositamos la cantidad
		micuenta.depositar(500);
		
		//Metodos para mostrar en pantalla
		micuenta.calcularInteres();
	}

}
