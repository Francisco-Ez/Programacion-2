
package resolucion.tp5.Ejercicio8;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos Méndez", "carlos@mail.com");
        Documento doc = new Documento("Contrato de Alquiler",  "Contenido del contrato...", "abc123", "2025-09-05", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());

    }
}


