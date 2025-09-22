
package resolucion.tp5.Ejercicio14;

public class Main {
     public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Tutorial", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}


