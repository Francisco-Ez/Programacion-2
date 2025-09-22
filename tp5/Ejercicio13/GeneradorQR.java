
package resolucion.tp5.Ejercicio13;

public class GeneradorQR {
     public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); 
        System.out.println("Generado QR para usuario: " + qr.getUsuario().getNombre() +
                           " con valor: " + qr.getValor());
     }
}


