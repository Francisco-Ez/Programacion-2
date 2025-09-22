
package resolucion.tp5.Ejercicio12;

public class Calculadora {
     public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() +
                           " para el contribuyente: " + impuesto.getContribuyente().getNombre());
        
   }      
}



