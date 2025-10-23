package Abstacto;

public class MainVehiculo {

	public static void main(String[] args) {
		// Instancia los objetos
		
		Vehiculo micoche=new Coche("VM");
		Vehiculo mibici= new Bici ("Orbea", "trek");
		
		micoche.arrancar(54);
		mibici.arrancar(6);
		
		micoche.arrancar();
		mibici.arrancar();
		
		
	}

}
