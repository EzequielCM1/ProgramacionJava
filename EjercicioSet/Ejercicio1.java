package EjercicioSet;

import java.util.HashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		HashSet<String> frutas = new HashSet<>();

        frutas.add("manzana");
        frutas.add("plátano");
        frutas.add("cereza");
        frutas.add("manzana"); 
        frutas.add("naranja");
        frutas.add("plátano"); 

        
        // Mostrar las frutas almacenadas 
        System.out.println("La lista de frutas : ");
        frutas.forEach(fruta -> System.out.print(fruta + " "));
        
        //Eliminar  cereza
        frutas.removeIf(fruta -> fruta.equals("cereza"));
        
        //Mostrar la lista modificada
        System.out.println("La lista de frutas : ");
        frutas.forEach(fruta -> System.out.print(fruta + " "));
        

	}

}
