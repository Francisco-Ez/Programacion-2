
package resolucion.tp8;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable { 
    private List<Producto> productos;
    private String estado;
    private Cliente cliente; // Para la interfaz Notificable

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (this.cliente != null) {
            this.cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado); // Uso de Notificable
        }
    }

    @Override
    public double calcularTotal() { 
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // Suma los totales de cada producto
        }
        return total;
    }
}
