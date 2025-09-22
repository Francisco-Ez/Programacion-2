
package resolucion.tp5.Ejercicio12;

public class Main {
     public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Luis Diaz", "20-12345678-9");
        Impuesto impuesto = new Impuesto(1500.0, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto); 
     }
}


