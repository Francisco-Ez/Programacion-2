
package resolucion.tp5.Ejercicio7;

public class Main {

    public static void main(String[] args) {
        Conductor conductor = new Conductor("Juan Martínez", "LIC54321");
        Motor motor = new Motor("Gasolina", "MTR0002");
        Vehiculo vehiculo = new Vehiculo("CD456EF", "Ford Ranger", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());

    }

}


