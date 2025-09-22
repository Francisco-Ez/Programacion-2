
package resolucion.tp5.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("George Orwell", "Británica");
        Editorial editorial = new Editorial("Secker & Warburg", "Londres 45");
        Libro libro = new Libro("1984", "978-0-452-28423-4", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }

}
