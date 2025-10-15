
package resolucion.tp7.Ejercicio2;


public class Circulo extends Figura{//Extendemos de figura
    // Declaramos el atributo radio
    private double radio;

    // Creamos el contructor
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Sobreescribimos al metodo calcular area
    @Override
    public void calcularArea(){
        System.out.println("El area del cirulo " + nombre + " es: " +  (radio *  3.14));
    }
}
