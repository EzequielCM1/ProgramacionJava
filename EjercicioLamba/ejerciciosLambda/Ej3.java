package ejerciciosLambda;

import java.util.ArrayList;
import java.util.Collections;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");

      
      Collections.sort(nombres, (o1, o2) -> o1.compareTo(o2));

        System.out.println(nombres);
    }
}

;