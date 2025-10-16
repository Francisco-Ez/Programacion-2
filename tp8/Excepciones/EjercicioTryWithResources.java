
package resolucion.tp8.Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioTryWithResources {
/**
     * Lee un archivo usando try-with-resources para asegurar el cierre automático.
     */
    public static void leerConRecursos(String ruta) {
        System.out.println("   -> Intentando leer (Punto 5, try-with-resources): " + ruta);
        
        // El BufferedReader se declara dentro del paréntesis del 'try'.
        // Java garantiza que el 'br' será cerrado automáticamente al salir del bloque.
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            
            String linea;
            System.out.print("Contenido: ");
            if ((linea = br.readLine()) != null) {
                System.out.println(linea + "...");
            } else {
                System.out.println("Archivo encontrado, pero está vacío.");
            }
            
        } catch (IOException e) { // IOException maneja errores de I/O, incluyendo FileNotFound
            System.err.println("¡ERROR! (IOException) Ocurrió un error al leer el archivo.");
        }
    }
}
