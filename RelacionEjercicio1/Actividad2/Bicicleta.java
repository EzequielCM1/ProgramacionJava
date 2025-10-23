package Actividad2;

public class Bicicleta extends Vehiculo {
	
	//Atributos
	String TipoBicicleta;
	
	//Creamos Contructor de la bicicleta
	public Bicicleta (String marca, String TipoBicicleta) {
		super(marca);
		this.TipoBicicleta=TipoBicicleta;
	}
	
	//Modificamos el metodo mover para cuando sea bicicleta
	@Override
    public void mover() {
        System.out.println("La bicicleta está pedaleando.");
    }
}
