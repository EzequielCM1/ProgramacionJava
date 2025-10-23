package interfaces;

import java.util.Iterator;

public class MainVolar {

	public static void main(String[] args) {
		// Creamos el array de objetos
		Volador [] volador = new Volador [4];
		
		volador[0]= new Pajaro(); 
		volador[1]= new Avion(); 
		volador[2]= new SuperHeroe("SuperHeore"); 
		volador[3]= new SuperHeroe("Thor"); 

		
		
		for (Volador volador2 : volador) {
			volador2.volar();
		}
		
		System.out.println("-----------------");
		
		for (Volador v : volador) {
			v.despegar();
			}
	}

}
