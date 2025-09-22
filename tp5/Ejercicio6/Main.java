
package resolucion.tp5.Ejercicio6;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucía Gómez", "22334455");
        Mesa mesa = new Mesa(3, 6);
        Reserva reserva = new Reserva("2025-09-12","20:30", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }

}



