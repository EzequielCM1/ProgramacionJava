package Actividad1;
import java.util.Scanner;
public class MainProduto {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner scanner = new Scanner(System.in);
		//Atributos
		String opcion;
		
		//Instanciamos los objetos
		 Producto producto1 = new ProductoElectronico("Teléfono", 500.05, 123);
	     Producto producto2 = new ProductoRopa("Camisa", 30.5, 456);
	     Producto producto3 = new ProductoElectronico("Laptop", 1200.8, 789);
	     Producto producto4 = new ProductoRopa("Pantalon", 45.9, 896);

	     //Mostramos las opciones por pantalla 
	     System.out.println("Los descuentos son : ");
	     System.out.println("Producto Electronicos todos al 10% ");
	     System.out.println("Producto de Ropa todos al 15% ");
	     System.out.println("------------------");
	     System.out.println("Que productos quieres ver? (electronico o ropa)");
	     
	     //Recogemos la opcion
	     opcion = scanner.nextLine().toLowerCase();
	     
	     //Switch  para segun el caso , este devuelva diferentes informaciones
	     switch (opcion) {
         case "electronico":
             System.out.println("Productos Electrónicos:");
             producto1.calcularDescuento(0);
             producto3.calcularDescuento(0);
             break;

         case "ropa":
             System.out.println("Productos de Ropa:");
             producto2.calcularDescuento(0);
             producto4.calcularDescuento(0);
             break;

         default:
             System.out.println("Opción no válida. Por favor elija 'electronico' o 'ropa'.");
             break;
     }

     scanner.close();
	}

}
