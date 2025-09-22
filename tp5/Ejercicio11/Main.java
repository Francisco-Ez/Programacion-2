
package resolucion.tp5.Ejercicio11;

public class Main {
     public static void main(String[] args) {
        Artista artista = new Artista("Ed Sheeran", "Pop");
        Cancion cancion = new Cancion("Shape of You", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}



