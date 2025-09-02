
package mascota;
//2.Registro de Mascotas
//a. Crear una clase Mascota con los atributos: nombre, especie, edad.
//Métodos requeridos: mostrarInfo(), cumplirAnios().
//Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
//verificar los cambios.

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombreMascota, String especieMascota, int edadInicial) {
        nombre = nombreMascota;
        especie = especieMascota;
        edad = edadInicial;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " es un(a) " + especie + " de " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
    }

    public static void main(String[] args) {
        Mascota m1 = new Mascota("Estrella", "Gata", 3);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
    }
}