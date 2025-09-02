package gallina;
//4. Gestión de Gallinas en Granja Digital
//a. Crear una clase Gallina con los atributos: idGallina, edad,
//huevosPuestos.
//Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
//Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
//mostrar su estado.

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(int id, int edadInicial) {
        idGallina = id;
        edad = edadInicial;
        huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos: " + huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.ponerHuevo();
        g1.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }

}
