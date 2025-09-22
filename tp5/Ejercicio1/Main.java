
package resolucion.tp5.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Rodrigo Gonzáles", "12345678");
        Pasaporte pasaporte = new Pasaporte("AB123456", "2023-01-01", "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
