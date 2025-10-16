
package resolucion.tp8.Excepciones;

public class EjercicioDivision {
    
    // El método debe recibir dos enteros (el numerador y el denominador)
    public static void dividir(int num, int den) { 
        System.out.print("   -> Dividiendo " + num + " / " + den + ": ");
        
        try {
            // Lógica de división
            int resultado = num / den;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
           // Manejo de la división por cero
            System.err.println("¡ERROR! No se puede dividir por cero.");
        }
    }
}
