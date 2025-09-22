
package resolucion.tp5.Ejercicio2;

public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sofía Pérez", "87654321");
        Bateria bateria = new Bateria("HTC-4000", 4000);
        Celular celular = new Celular("Xiaomi", "Redmi Note 12", "222333444555666", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
    
}
