
package resolucion.tp8.Excepciones;

public class EjercicioEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException { // Uso de throws 
        if (edad < 0 || edad > 120) { // Regla de validación 
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120. Valor ingresado: " + edad); // Uso de throw 
        }
        System.out.println("Edad válida.");
    }

    public static void main(String[] args) {
        try {
            validarEdad(150);
        } catch (EdadInvalidaException e) { // Captura la excepción personalizada 
            System.err.println("Validación Fallida: " + e.getMessage());
        }
    }
}