
package resolucion.tp5.Ejercicio14;

public class EditorVideo {
        public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); 
        System.out.println("Proyecto '" + render.getProyecto().getNombre() +
                           "' exportado en formato: " + render.getFormato());
    }
}


