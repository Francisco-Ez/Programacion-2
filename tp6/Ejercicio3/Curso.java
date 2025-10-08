
package resolucion.tp6.Ejercicio3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (profesor == this.profesor) {
            return;
        }

        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = profesor;

        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("El codigo del curso es: " + codigo +
                "\nel nombre del curso es: " + nombre +
                "\nel profesor asignado al curso es: " + profesor.getNombre());
    }
}
