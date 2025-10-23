package Ejercicio2;
import java.util.Scanner;
public class GestionFabrica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Trabajador operador1 = new Operario("Juan", 30, "Operario", 1500, 160);
		Trabajador operario2 = new Operario("Pedro", 25, "Operario", 1500, 170);  // 170 horas trabajadas
        Trabajador supervisor1 = new Supervisor("Luis", 45, "Supervisor", 3000, 1000); // 1000 bono extra
		
        
        Trabajador[] trabajadores = new Trabajador[3];
        trabajadores[0] = operador1;
        trabajadores[1] = operario2;
        trabajadores[2] = supervisor1;
        
        int opcion=0;
        do {
        	System.out.println("Que salarios deseas calcular ");
        	System.out.println("1. operarios");
        	System.out.println("2. supervisores");
        	opcion =teclado.nextInt();
        	if(opcion<=0 || opcion>=3) {
        		System.out.println("Porfavor introduce los datos correctamente ");
        	}
        }while(opcion<=0 || opcion>=3);
        
        switch (opcion) {
        
        case 1:
        	for (Trabajador t : trabajadores) {
                // Verificamos si la clase exacta de t es Operario
                if (t.getClass() == Operario.class) {
                    // Hacemos un cast a Operario
                    Operario o = (Operario) t;
                    System.out.println("El salario de " + o.nombre + " es: " + o.calcularSalario(500)); // Bono adicional
                }
            }
        	break;

        case 2:
            // Recorrer el array de trabajadores y calcular el salario de los supervisores
            System.out.println("\n>>> Calculando salarios de los supervisores:");
            for (Trabajador t : trabajadores) {
                // Verificamos si la clase exacta de t es Supervisor
                if (t.getClass() == Supervisor.class) {
                    // Hacemos un cast a Supervisor
                    Supervisor s = (Supervisor) t;
                    System.out.println("El salario de " + s.nombre + " es: " + s.calcularSalario()); // No requiere bono adicional
                }
            }
            break;
        
        }
        teclado.close();
	}

}
