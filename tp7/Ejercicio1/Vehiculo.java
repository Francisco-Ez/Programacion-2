package resolucion.tp7.Ejercicio1;


public class Vehiculo {
    // Declaramos los atributos de la clase padre protegidos
    protected String marca;
    protected String modelo;

    // Creamos su constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Metodo para mostrar la informacion de un vehiculo, el cual vamos a sobreescribir luego
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + " ,marca: " + marca);
    }
}


