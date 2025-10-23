package ud6_Ficheros;

import java.io.File;
import java.io.IOException;

public class AccionesConFicheros {

	public static void main(String[] args) {
		//-------------------------Crear un fichero-------------------------------------------------------------------------
		File nuevoFichero = new File("fichero.txt");
		try {
		    //Creamos el fichero
		    if (nuevoFichero.createNewFile()) {
		        System.out.println("Fichero creado correctamente!");
		    }else {
		        System.out.println("No se ha podido crear el fichero!");
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		
		//-------------------------Comprobamos si existe el fichero-------------------------------------------------------------------------
				
		if (nuevoFichero.exists()) {
		    System.out.println("El fichero existe!");
		}else {
		    System.out.println("El fichero no existe!");
		}
		
		
		
		//-------------------------Comprobamos si es un fichero o un directorio-------------------------------------------------------------------------
		
		File miFichero = new File("pruebaFichero.txt");
		File miDirectorio = new File(".");
		         
		//Comprobamos si miFichero es un fichero
		if (miFichero.isFile()) {
		    System.out.println(miFichero.getName() + " es un fichero");
		}
		         
		//Comprobamos si miDirectorio es un directorio
		if (miDirectorio.isDirectory()) {
		    System.out.println(miDirectorio.getName() + " es un directorio");
		}
		
		
		
		
		//--------------------------Permisos de un fichero------------------------------------------------------------------------
		
		//Comprobamos los permisos de lectura
		if (miFichero.canRead()) {
		    System.out.println(miFichero.getName() + " tiene permisos de lectura");
		}else {
		    System.out.println(miFichero.getName() + " NO tiene permisos de lectura");
		}
		//Comprobamos los permisos de escritura
		if (miFichero.canWrite()) {
		    System.out.println(miFichero.getName() + " tiene permisos de escritura");
		}else {
		    System.out.println(miFichero.getName() + " NO tiene permisos de escritura");
		}
		//Comprobamos los permisos de ejecución
		if (miFichero.canExecute()) {
		    System.out.println(miFichero.getName() + " tiene permisos de ejecución");
		}else {
		    System.out.println(miFichero.getName() + " NO tiene permisos de ejecución");
		}
		
		
		
		
		//--------------------------Cambiar permisos de un fichero------------------------------------------------------------------------
		
		//Modificamos los permisos
		miFichero.setExecutable(false);
		miFichero.setReadable(false);
		miFichero.setWritable(false);
		 
		//Mostramos los permisos
		if (!miFichero.canExecute()) {
		    System.out.println(miFichero.getName() + " no tiene permisos de ejecución");
		}
		         
		if (!miFichero.canRead()) {
		    System.out.println(miFichero.getName() + " no tiene permisos de lectura");
		}
		         
		if (!miFichero.canWrite()) {
		    System.out.println(miFichero.getName() + " no tiene permisos de escritura");
		}
			
		
		
		
		
		
		//--------------------------Ruta completa de un fichero------------------------------------------------------------------------
		
		System.out.println(miFichero.getAbsolutePath());
		
		
		
		
		//--------------------------Obtener ruta padre de un fichero------------------------------------------------------------------------
		// Realmente lo que vamos a buscar es la ruta absoluta HASTA el directorio que contiene al fichero
		
		System.out.println(miFichero.getParent());
		
		
		
		
		//--------------------------Obtenemos el tamaño de un fichero------------------------------------------------------------------------
		
		System.out.println(miFichero.getName() + " ocupa: " + miFichero.length() + " bytes");

		
		
		
		
		//--------------------------Creamos un directorio------------------------------------------------------------------------
		
		File nuevoDirectorio = new File(".\\mi directorio\\directorio nuevo");
        
		//Creamos el directorio
		nuevoDirectorio.mkdir();
		
	
		
		//--------------------------Listar todos los archivos de un directorio------------------------------------------------------------------------
		
		File miFichero2 = new File(".\\mi directorio");
        
		//Obtenemos el Array de files
		File [] ficheros = miFichero2.listFiles();
		         
		//Iteramos sobre el Array
		for (File f: ficheros) {
		    if (f.isFile()) {
		        System.out.println(f.getName() + " es un fichero");
		    }
		             
		    if (f.isDirectory()) {
		        System.out.println(f.getName() + " es un directorio");
		    }
		}
		
		
				
		
		//--------------------------Borramos un fichero------------------------------------------------------------------------
		
   
				//Borramos el fichero
		miFichero.delete();
		         
		//Comprobamos si existe el fichero
		if (miFichero.exists()) {
		    System.out.println(miFichero.getName() + " existe");
		}else {
		    System.out.println(miFichero.getName() + " NO existe");
		}

	}

}
