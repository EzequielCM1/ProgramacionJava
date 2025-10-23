package RepasosFiles;

import java.io.*;
import java.util.*;

public class Ej2_TareaEliminar {

    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\Zequi\\eclipse-workspace\\Files\\FilesEjercicios\\RepasosFiles\\Tareas.txt");

        Map<Integer, Ej1_Tarea> listTarea = new HashMap<>();
        listTarea.put(1, new Ej1_Tarea("Aprobar programacion", "16-06-2025"));
        listTarea.put(2, new Ej1_Tarea("Aprobar base de datos", "18-06-2025"));
        listTarea.put(3, new Ej1_Tarea("IHHDJHDAHD", "30-06-2025"));
        listTarea.put(4, new Ej1_Tarea("fsajifhasof", "25-06-2025"));

        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(fichero))) {
            for (Ej1_Tarea tarea : listTarea.values()) {
                escribir.write(tarea.meter());
                escribir.newLine();
            }
            System.out.println("Se han añadido las tareas correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir tareas iniciales: " + e.getMessage());
            return;
        }

        List<String> tareas = new ArrayList<>();

        // Leer tareas del fichero
        try (BufferedReader leer = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = leer.readLine()) != null) {
                tareas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer tareas: " + e.getMessage());
            return;
        }

        // Mostrar tareas
        System.out.println("Lista de tareas:");
        for (String tarea : tareas) {
            System.out.println(tarea);
        }

        // Pedir tarea a eliminar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la tarea que deseas eliminar: ");
        String buscar = teclado.nextLine();
        teclado.close();

        // Buscar y eliminar
        boolean eliminada = false;
        Iterator<String> it = tareas.iterator();
        while (it.hasNext()) {
            String t = it.next();
            if (t.toLowerCase().contains(buscar.toLowerCase())) {
                it.remove();
                eliminada = true;
                break;
            }
        }

        if (eliminada) {
            System.out.println("Tarea eliminada correctamente.");

            // Reescribir el fichero con la lista actualizada
            try (BufferedWriter escribir = new BufferedWriter(new FileWriter(fichero))) {
                for (int i = 0; i < tareas.size(); i++) {
                    escribir.write(tareas.get(i));
                    if (i < tareas.size() - 1) {
                        escribir.newLine();
                    }
                }
                System.out.println("Fichero actualizado.");
            } catch (IOException e) {
                System.out.println("Error al reescribir fichero: " + e.getMessage());
            }

        } else {
            System.out.println("La tarea no existe.");
        }
    }
}
