package Ejercicio3;

public class ViajeTerrestre extends Viaje{
	String Transporte;
	
	public ViajeTerrestre(String destino, double precioBase, int duracion, String Transporte) {
        super(destino, precioBase, duracion);
        this.Transporte=Transporte;
    }
	
	@Override
	public double calcularPrecio() {
		
		if(Transporte.equalsIgnoreCase("Bus")) {
			return precioBase = precioBase * 0.90;
		}else if(Transporte.equalsIgnoreCase("privado")) {
			return precioBase * 1.20;
		}
		return precioBase;
			
				
	}
	
	@Override
    public String toString() {
        return "Viaje Terrestre a " + destino + " (" + Transporte + "), duración: " + duracion + " días, precio final: $" + calcularPrecio();
    }
	
		
	}
