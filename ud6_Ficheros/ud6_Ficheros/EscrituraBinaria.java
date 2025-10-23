package ud6_Ficheros;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraBinaria {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;
        try {
            // Abrir el archivo binario para escritura
            outputStream = new FileOutputStream("miImagenSalida.jpg");

            byte[] datos = { 0x00, 0x01, 0x02 }; // Datos binarios de ejemplo
            outputStream.write(datos); // Escribir los bytes en el archivo
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo binario: " + e.getMessage());
        } finally {
            // Cerrar el flujo de salida
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo binario: " + e.getMessage());
            }
        }
    }
}

