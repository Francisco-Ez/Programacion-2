
package resolucion.tp7.Ejercicio4;

public class Gato extends Animal{ // Extendemos de animal
    // Sobreescribimos hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("Miau!!");
    }
}
