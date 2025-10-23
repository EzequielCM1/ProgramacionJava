package RepasosFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej4_Main {

	public static void main(String[] args) throws IOException {
		File productos = new File ("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\RepasosFiles\\Productos.txt");
		BufferedReader leer = null;
		BufferedWriter escribir = null;
		
		productos.setReadable(true);
		productos.setWritable(true);
		
		Map<Integer, Ej4_producto> productosList = new HashMap<>();
		productosList.put(1, new Ej4_producto(45, "Tele", 360));
		productosList.put(2, new Ej4_producto(54, "Zapato", 460));
		productosList.put(3, new Ej4_producto(45, "traca", 60));
		
		try {
		leer = new BufferedReader(new FileReader(productos));
		if(productos.exists()) {
			System.out.println("-----Productos----------");
			String linea;
			while((linea = leer.readLine()) != null) {
				System.out.println(linea);
			}
		}else {
			productos.createNewFile();
			System.out.println("Se ha creado el fichero");
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di el producto a buscar :");
		String buscar = teclado.nextLine();
		String encontrar;
		while((encontrar = leer.readLine()) != null) {
			if(encontrar.strip()) {
				System.out.println("Lo eh encontrado");
			}else {
				System.out.println("No se ha encontrado");
			}
		}
		
		
		
		
		
		
		leer.close();
		
		
		
		
		
			
		}catch (IOException e) {
			System.out.println("Ha ocurrido un error : "+ e.getMessage());
		}finally {
			try {
				  if(leer != null) leer.close();
				//Mensaje de error
			}catch (IOException e) {
				 System.out.println("Error al cerrar el fichero: " + e.getMessage());
			}
		}
		
		
	}

}
