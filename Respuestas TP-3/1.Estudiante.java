package estudiante;
//1. Registro de Estudiantes
//a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
//calificación.
//Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
//bajarCalificacion(puntos).
//Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
//calificaciones.

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombreEstudiante, String apellidoEstudiante, String cursoEstudiante, double notaInicial) {
        nombre = nombreEstudiante;
        apellido = apellidoEstudiante;
        curso = cursoEstudiante;
        calificacion = notaInicial;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(1);
        e1.mostrarInfo();
        e1.bajarCalificacion(0.5);
        e1.mostrarInfo();
    }
}


