
package resolucion.tp5.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Luciano Martinez", "Luciano@mail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("ABC123XYZ", usuario);
    }
}


