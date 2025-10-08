
package resolucion.tp6.Ejercicio2;
import java.util.List;

public class Main {
       public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");


        Autor raul = new Autor("1", "Raul Martinez", "Chile");
        Autor jorge = new Autor("2", "Jorge Rojas", "España");
        Autor maria = new Autor("3", "María Gonzáles", "Argentina");


        biblioteca.agregarLibro("A234", "Logica de Programacion Moderna", 2021, raul);
        biblioteca.agregarLibro("H345", "Sistemas Distribuidos Esenciales", 2023, jorge);
        biblioteca.agregarLibro("S234", "Arquitectura de Software", 2021, raul);
        biblioteca.agregarLibro("C234", "Patron de diseño con Java", 2020, maria);
        biblioteca.agregarLibro("F234", "Estructura de Datos en Profundidad", 2024, jorge);

        System.out.println("Los libros de la biblioteca " + biblioteca.getNombre() + "son:");
        biblioteca.listarLibros();
        System.out.println("------------------------------------------------------------------");

   
        System.out.println("Buscamos un libro por isbn A234");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("A234");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        System.out.println("..................................................................");

        int anioFiltro = 2021;
        List<Libro> librosPorAnio = biblioteca.filtrarLibrosPorAnio(anioFiltro);
        System.out.println("Los libros encontrados del anio " + anioFiltro + " son:");
        for (Libro libro : librosPorAnio) {
            libro.mostrarInfo();
        }
        System.out.println("//////////////////////////////////////////////////////////////////");

        biblioteca.eliminarLibro("S234");

        System.out.println("Imprimimos los libros despues de eliminar uno");
        biblioteca.listarLibros();

        System.out.println("La cantidad total de libros en la biblioteca " + biblioteca.getNombre() + "son: " + biblioteca.obtenerCantidadLibros());

        System.out.println("Los autores de los libros de la biblioteca son:");
        biblioteca.mostrarAutoresDisponibles();
        
        System.out.println("\nBUILD SUCCESSFUL (total time: 1 second)"); // Simulación del output final
    }
}
