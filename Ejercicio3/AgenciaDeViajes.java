package Ejercicio3;

public class AgenciaDeViajes {

	public static void main(String[] args) {
		
		Viaje[] viajes = new Viaje[4];
		
		viajes[0] = new ViajeAereo("Valencia", 1000, 1, "primera clase");
        viajes[1] = new ViajeAereo("París", 1500.0, 7, "primera clase");
        viajes[2] = new ViajeTerrestre("Andorra", 1600.0, 2, "bus");
        viajes[3] = new ViajeTerrestre("Chipiona", 300.0, 1, "privado");
		
		mostrarDetallesViaje(viajes);
	}
	public static void mostrarDetallesViaje(Viaje[] viajes) {
        for (int i = 0; i < viajes.length; i++) {
            System.out.println(viajes[i].toString());
        }
    }

}
