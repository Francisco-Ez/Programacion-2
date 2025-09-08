
package empresa;


public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Gerente", 120000);
        Empleado emp2 = new Empleado("María López", "Analista");
        Empleado emp3 = new Empleado("Carlos Ruiz", "Desarrollador");

        emp1.actualizarSalario(10);
        emp2.actualizarSalario(5000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
