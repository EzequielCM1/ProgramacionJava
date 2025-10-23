package RepasosFiles;

import java.io.*;
import java.util.*;


public class Ej3_mian {

	public static void main(String[] args) {
		File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\RepasosFiles\\contactos.txt");
		BufferedWriter escribir = null;
		BufferedReader leer = null;
		//Permisos 
		fichero.setWritable(true);
		fichero.setReadable(true);
		Map<Integer, Ej3_contacto> listaContact = new HashMap<>();
		listaContact.put(1, new Ej3_contacto("Eider", 345456456, "eiderlabiano@gmil.com"));
		listaContact.put(2, new Ej3_contacto("Alex", 78789778, "dsdasdasd@gamil.com"));
		listaContact.put(3, new Ej3_contacto("Nacho", 37878456, "eid456454ano@gmil.com"));
		listaContact.put(4, new Ej3_contacto("Ruben", 787898989, "d5645454asd@gamil.com"));

		try {
			if(!fichero.exists()) {
				fichero.createNewFile();
				System.out.println("Se ha creado el archivo correctamente");
			}else {
				System.out.println("El fichero ya existe");
			}
			// Abrir el fichero para escritura
			escribir = new BufferedWriter(new FileWriter(fichero, false));
			
			int contador = 0;
			for(Ej3_contacto contact : listaContact.values()) {
				escribir.write(contact.mostrarej3());
				contador ++;
				if(contador < listaContact.size()) {
					escribir.newLine();
				}
			}
			// Agrega esto antes de leer
			escribir.flush();
			
			List<String> contactosW = new ArrayList<>();
			leer = new BufferedReader(new FileReader(fichero));
            String linea;
            while((linea = leer.readLine()) != null) {
            	contactosW.add(linea);
            }
			
           //ContactoBuscar
         // Buscar contacto por nombre
         Scanner teclado = new Scanner(System.in);
         System.out.print("Introduce el nombre del contacto a buscar: ");
         String nombreBuscar = teclado.nextLine().trim().toLowerCase();
         boolean encontrado = false;

         for (String contacto : contactosW) {
             String[] partes = contacto.split(",");
             if (partes.length == 3) {
                 String nombre = partes[0].trim().toLowerCase();
                 if (nombre.equals(nombreBuscar)) {
                     System.out.println("Contacto encontrado: " + contacto);
                     encontrado = true;
                     break;
                 }
             }
         }
         if(!encontrado) {
        	 System.out.println("No se ha encontrado el contacto");
         }
         teclado.close();
			
		}catch (IOException e) {
			System.out.println("Ha ocurrido un error : "+ e.getMessage());
		}finally {
			try {
				  if (escribir != null) escribir.close();
				  if(leer != null) leer.close();
				//Mensaje de error
			}catch (IOException e) {
				 System.out.println("Error al cerrar el fichero: " + e.getMessage());
			}
		}
	}

}
