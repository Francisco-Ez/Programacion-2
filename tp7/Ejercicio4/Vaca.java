
package resolucion.tp7.Ejercicio4;

public class Vaca extends Animal{ // extendemos de animal
    // Sobreescribimos hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("MUUU!!");
    }
}