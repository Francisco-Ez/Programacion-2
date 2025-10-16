
package resolucion.tp8.Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioLecturaArchivo {
    public static void leerArchivo(String ruta) {
        System.out.println("-> Intentando leer archivo): " + ruta);
        
        try {
            // Se usa el constructor de File que puede lanzar FileNotFoundException
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);
            
            if (lector.hasNextLine()) {
                System.out.println("Contenido encontrado: " + lector.nextLine() + "...");
            } else {
                System.out.println("Archivo encontrado, pero está vacío.");
            }
            lector.close(); // Se cierra manualmente
            
        } catch (FileNotFoundException e) {
            // Si el archivo no existe en la ruta, se ejecuta este bloque
            System.err.println("¡ERROR! (FileNotFoundException) El archivo no se encontró.");
        }
    }
}