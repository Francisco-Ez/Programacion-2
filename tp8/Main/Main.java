
package resolucion.tp8.Main;

// Importaciones para las clases de la Parte 1 (Interfaces)
import resolucion.tp8.*; 

// Importaciones para las clases de la Parte 2 (Excepciones)
import resolucion.tp8.Excepciones.*; 

public class Main {
    
    // Rutas para las pruebas de archivos 
    private static final String EXISTENTE = "archivo_de_prueba.txt"; 
    private static final String INEXISTENTE = "archivo_que_no_existe.txt";

    public static void main(String[] args) {
        
        System.out.println("\n PARTE 1: INTERFACES (E-commerce)");

     
        // Uso de Cliente (Notificable) y Pedido (Pagable)
        Cliente cliente = new Cliente("Ana Rodríguez");
        Pedido pedido = new Pedido(cliente);

        // Productos (Pagable)
        Producto prod1 = new Producto("Silla ergonómica", 150.00);
        Producto prod2 = new Producto("Teclado mecánico", 99.99);

        pedido.agregarProducto(prod1);
        pedido.agregarProducto(prod2);
        
        // Demostración de Pagable (calcularTotal)
        double total = pedido.calcularTotal();
        System.out.printf("[Pagable] Total a pagar por el pedido: $%.2f%n", total);

        // Demostración de Pago
        TarjetaCredito procesadorPago = new TarjetaCredito();
        procesadorPago.procesarPago(total);

        // Demostración de Notificable (disparado por setEstado)
        pedido.setEstado("CONFIRMADO"); 
        
        // ----------------------------------------------------
        
        System.out.println("\nPARTE 2: MANEJO DE EXCEPCIONES");

        // 1. División Segura (ArithmeticException)
        System.out.println("\n1. División Segura (ArithmeticException):");
        EjercicioDivision.dividir(10, 2);
        EjercicioDivision.dividir(10, 0); // Falla y captura el error

        // 2. Conversión de cadena a número (NumberFormatException)
        System.out.println("\n2. Conversión de Cadena (NumberFormatException):");
        EjercicioConversion.convertir("12345");
        EjercicioConversion.convertir("abc"); // Falla y captura el error
        
        // 3. Lectura de archivo (FileNotFoundException)
        System.out.println("\n3. Lectura de Archivo (FileNotFoundException):");
        EjercicioLecturaArchivo.leerArchivo(INEXISTENTE); // Falla y captura el error
        EjercicioLecturaArchivo.leerArchivo(EXISTENTE);   // Caso OK
        
        // 5. Uso de try-with-resources (IOException)
        System.out.println("\n5. Uso de try-with-resources (IOException):");
        EjercicioTryWithResources.leerConRecursos(INEXISTENTE); // Falla y captura el error
        EjercicioTryWithResources.leerConRecursos(EXISTENTE);   // Caso OK y cierra el recurso
        
        // 4. Excepción personalizada (EdadInvalidaException)
        System.out.println("\n4. Excepción Personalizada (EdadInvalidaException):");
        try {
            EjercicioEdad.validarEdad(25); // Caso OK
            EjercicioEdad.validarEdad(150); // Lanza la excepción
        } catch (EdadInvalidaException e) {
            // Captura la excepción personalizada en el Main
            System.err.println("[Capturada en Main]: " + e.getMessage());
        }

        System.out.println("\n=============================================");
    }
}