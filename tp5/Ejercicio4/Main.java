
package resolucion.tp5.Ejercicio4;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucía Fernández", "33445566");
        Banco banco = new Banco("BBVA", "30-77777777-7");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "11/29", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());

    }

}
