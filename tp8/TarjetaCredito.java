
package resolucion.tp8;

public class TarjetaCredito implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
        return true; // Simulación de pago exitoso
    }
}
