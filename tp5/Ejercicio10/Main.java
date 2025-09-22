
package resolucion.tp5.Ejercicio10;

public class Main {
     public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("1234", "2025-09-15");
        CuentaBancaria cuenta = new CuentaBancaria("30-99999999-9", 15000.0, clave);
        Titular titular = new Titular("Pedro Sanchez", "11332211");

        cuenta.setTitular(titular);

        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Cuenta CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Clave de seguridad: " + cuenta.getClave().getCodigo());
        System.out.println("Última modificación: " + cuenta.getClave().getUltimaModificacion());
    }
}


