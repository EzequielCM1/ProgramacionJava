package ejerciciosLambda;

import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");

       
        nombres.forEach(nombre -> System.out.println(nombre));
    }
}

