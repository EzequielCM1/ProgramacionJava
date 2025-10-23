package Actividad2;

public class Coche extends Vehiculo{

	//Atributos
	int NumeroPuertas;
	
	//Creamos el contructor de Coche
	public Coche (String marca, int NumeroPuertas) {
		super(marca);
		this.NumeroPuertas=NumeroPuertas;
	}
	
	//Modificamos el metodo mover para cuando es coche
	@Override
    public void mover() {
        System.out.println("El coche está conduciendo.");
    }
}
