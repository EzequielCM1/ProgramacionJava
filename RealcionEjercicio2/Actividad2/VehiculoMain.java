package Actividad2;

public class VehiculoMain {

	public static void main(String[] args) {

		Vehiculo coche1 = new Coche ("Kia", 0);
		Vehiculo coche2 = new Coche ("Skoda", 0);
		
		Vehiculo camion1 = new Camion ("Volvo", 0);
		Vehiculo camion2 = new Camion ("RENAULT",0);
		
		
		
		
		coche1.cargarCombustible(6.76);
		coche2.cargarCombustible(8.00);
		camion1.cargarCombustible(20);
		camion2.cargarCombustible(30);
		
		
	}
	
}
