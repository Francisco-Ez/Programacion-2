
package libro;

//3. Encapsulamiento con la Clase Libro
//a. Crear una clase Libro con atributos privados: titulo, autor,
//añoPublicacion.
//Métodos requeridos: Getters para todos los atributos. Setter con validación
//para añoPublicacion.
//Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
//uno válido, mostrar la información final.

public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String tituloLibro, String autorLibro, int anioPublicacionLibro) {
        titulo = tituloLibro;
        autor = autorLibro;
        setAñoPublicacion(anioPublicacionLibro);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void setAñoPublicacion(int anio) {
        if (anio >= 1500 && anio <= 2025) {
            añoPublicacion = anio;
        } else {
            System.out.println("Año inválido. No se modificó.");
        }
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAñoPublicacion());
        libro.setAñoPublicacion(1400);
        libro.setAñoPublicacion(2020);
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAñoPublicacion());
    }
}
