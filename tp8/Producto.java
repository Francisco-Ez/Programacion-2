
package resolucion.tp8;

public class Producto implements Pagable { 
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters 

    @Override
    public double calcularTotal() {
        return this.precio; // El total de un producto es su precio.
    }
}