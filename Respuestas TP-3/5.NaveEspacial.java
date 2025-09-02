
package naveespacial;
//5. Simulación de Nave Espacial
//Crear una clase NaveEspacial con los atributos: nombre, combustible.
//Métodos requeridos: despegar(), avanzar(distancia),
//recargarCombustible(cantidad), mostrarEstado().
//Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
//se supere el límite al recargar.
//Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
//ecargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

public class NaveEspacial {
 String nombre;
    double combustible;

    public NaveEspacial(String nombreNave, double cantidadCombustible) {
        nombre = nombreNave;
        combustible = cantidadCombustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave ha despegado.");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia / 10;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > 100) {
            combustible = 100;
            System.out.println("Tanque lleno (100 unidades).");
        } else {
            combustible += cantidad;
            System.out.println("Recargado. Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.mostrarEstado();
        nave.avanzar(200);
        nave.recargarCombustible(60);
        nave.despegar();
        nave.avanzar(100);
        nave.mostrarEstado();
    }
}

   
