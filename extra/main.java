package extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Estudiantes> est = new ArrayList<>();

		try {
			est.add(new Estudiantes("Ruben", 19 , "Bach"));
			est.add(new Estudiantes("Nacho", 14, "1DAM"));
			est.add(new Estudiantes("Juan", 20 , "Bach"));
			est.add(new Estudiantes("Samuel", 19, "1DAM"));
			est.add(new Estudiantes("Jesus", 19 , "Bach"));
		}catch(IllegalArgumentException e) {
			System.out.println("Datos invalidos " + e.getMessage());
		}
		
		
		try {
			
			//Creamos iterator
			Iterator<Estudiantes> it = est.iterator();
			// hasnext , next , remove
			while(it.hasNext()) {
				Estudiantes estudiantes = it.next();
				// Metodos mostrar datos
				System.out.println(estudiantes.getNombre() + " tiene de " +estudiantes.getEdad() + " esta cursando en " + estudiantes.getCurso());
			}
		}catch(NullPointerException e) {
			System.out.println("Error, se inento acceder a un datos inexistente  " + e.getMessage());
		}

		System.out.println("-------------------------------------------------");
		// metodo para eliminar menores de edad 
		Iterator<Estudiantes> it2 = est.iterator();
		while(it2.hasNext()) {
			if(it2.next().getEdad() <18) {
				it2.remove();
			}
			
		}
		est.forEach((a)  -> a.mostrar());
		
		
	
	}

}
