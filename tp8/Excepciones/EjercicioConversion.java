
package resolucion.tp8.Excepciones;

public class EjercicioConversion {
    
    // La firma del método debe aceptar un String como parámetro
    public static void convertir(String texto) { 
        System.out.print("   -> Intentando convertir \"" + texto + "\" a entero: ");
        
        try {
            // Se usa el parámetro 'texto'
            int numero = Integer.parseInt(texto);
            System.out.println("Resultado: " + numero);
            
        } catch (NumberFormatException e) {
            // Manejo de la excepción
            System.err.println("¡ERROR! La cadena no es un número entero válido.");
        }
    }
}