
package resolucion.tp5.Ejercicio5;

public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Ana Torres", "11223344");
        Computadora pc = new Computadora("Dell", "SN987654", "MSI MAG", "B550");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }

}

