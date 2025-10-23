package RepasosFiles;

import java.io.*;
import java.util.*;


public class Ej1_Main {

	public static void main(String[] args) {
		File fichero = new File("C:\\Users\\DAW1-A\\examenDAWN\\Files\\Relacion1Ficheros\\RepasosFiles\\Tareas.txt");
		BufferedReader leer = null;
		BufferedWriter escribrir = null;
		//Permisos 
		fichero.setWritable(true);
		fichero.setReadable(true);
		
		Map<Integer, Ej1_Tarea> listTarea = new HashMap<>();
		listTarea.put(1, new Ej1_Tarea("Aprobar programacion", "16-06-2025"));
		listTarea.put(2, new Ej1_Tarea("Aprobar base de datos", "18-06-2025"));
		listTarea.put(3, new Ej1_Tarea("IHHDJHDAHD", "30-06-2025"));
		listTarea.put(4, new Ej1_Tarea("fsajifhasof", "25-06-2025"));
		
		//Creamos un array hashset para evitar duplicados
		Set<String> tareas = new HashSet<String>();
		
		try {
			if(!fichero.exists()) {
				fichero.createNewFile();
				System.out.println("El fichero se ha creado correctamente");
			}else {
				System.out.println("El fichero ya existe ");
			}
			
			// Abrir el fichero para escritura
			escribrir = new BufferedWriter(new FileWriter(fichero, false));
			
			//Escribir las tareas
			//Atributo para contar 
			int contar = 0;
			for(Ej1_Tarea tarea : listTarea.values()) {
				escribrir.write(tarea.meter());
				contar ++;
				if(contar < listTarea.size()) {
					escribrir.newLine();
				}
			}
			System.out.println("Se ha añadido correctamente las tareas");
			// Agrega esto antes de leer
			escribrir.flush();
			escribrir.close();
            // Abrir el fichero para lectura
            leer = new BufferedReader(new FileReader(fichero));
            String linea;
            System.out.println("Lista de tareas :");
            while((linea = leer.readLine()) != null) {
            	tareas.add(linea);
            }
			
            // Mostramos las lineas
            for(String tt : tareas) {
            	System.out.println(tt);
            }
            
		}catch (IOException e) {
			System.out.println("Ha ocurrido un error : "+ e.getMessage());
		}finally {
			try {
				  if (escribrir != null) escribrir.close();
			      if (leer != null) leer.close();
				//Mensaje de error
			}catch (IOException e) {
				 System.out.println("Error al cerrar el fichero: " + e.getMessage());
			}
		}
	}

}
