
package resolucion.tp5.Ejercicio9;

public class Main {
    public static void main(String[] args) {
         Paciente paciente = new Paciente("María López", "OSDE");
        Profesional profesional = new Profesional("Dr. Juan Pérez", "Cardiología");

        CitaMedica cita = new CitaMedica("2025-09-20", "10:00");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        System.out.println("Cita médica:");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
}



