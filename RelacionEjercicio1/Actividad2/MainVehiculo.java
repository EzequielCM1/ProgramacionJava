package Actividad2;

public class MainVehiculo {

	public static void main(String[] args) {
		
		//Creamos el objeto
        Coche micoche = new Coche("Nissan", 4);
        Bicicleta mibicicleta = new Bicicleta("Scott", "urbana");
        
        //LLmamamos al contructor
        micoche.mover();
        mibicicleta.mover();
    }
	

}
