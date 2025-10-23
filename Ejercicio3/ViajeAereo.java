package Ejercicio3;

public class ViajeAereo extends Viaje{
	
	String tipoVuelo;
	
	public ViajeAereo(String destino, double precioBase, int duracion, String tipoVuelo) {
        super(destino, precioBase, duracion);
        this.tipoVuelo = tipoVuelo;
    }
	
	@Override
	public double calcularPrecio() {
		
		if(tipoVuelo.equalsIgnoreCase("Primera clase")) {
			return precioBase = precioBase * 1.10;
		}
		return precioBase;
	}
	
	@Override
    public String toString() {
        return "Viaje Aéreo a " + destino + " (" + tipoVuelo + "), duración: " + duracion + " días, precio final: $" + calcularPrecio();
    }
}
