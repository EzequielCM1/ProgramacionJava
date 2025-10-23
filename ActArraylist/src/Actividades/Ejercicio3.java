package Actividades;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {

    public static void main(String[] args) {
        // ArrayList de países 
        ArrayList<String> paises = new ArrayList<>();
        // Añadimos los países
        paises.add("Cuba");
        paises.add("México");
        paises.add("España");
        paises.add("Japón");
        paises.add("Brasil");

        // Utilizamos un iterador para eliminar los países que contienen la letra 'a'
        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            String pais = iterator.next();
            if (pais.toLowerCase().contains("a")) {
                iterator.remove();
            }
        }

        // Mostrar la lista 
        System.out.println("Lista después de eliminar los países que contenga la letra 'a': " + paises);
    }
}
