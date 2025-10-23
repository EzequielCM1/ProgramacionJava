package ud6_Ficheros;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class EscrituraFichero {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        File fichero = new File("src\\ud6_Ficheros\\fichero.txt");
        
		fichero.setWritable(true);
        try {
            // Abrir el fichero para escritura
            writer = new BufferedWriter(new FileWriter(fichero));
            
            // Escribir texto en el fichero
            writer.write("Hola, este es un texto en el fichero.");
            writer.newLine();
            writer.write("Otra línea de texto.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        } finally {
            // Cerrar el flujo de escritura
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero: " + e.getMessage());
            }
        }
    }
}

