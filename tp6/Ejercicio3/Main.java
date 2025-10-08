
package resolucion.tp6.Ejercicio3;


public class Main {
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("1", "Pablo Castro", "ADO");
        Profesor profesor2 = new Profesor("2", "Alejandra Ramírez", "Programacion");
        Profesor profesor3 = new Profesor("3", "Álvaro Fernández", "Financiera");

        Curso programacion1 = new Curso("1", "Programacion1");
        Curso ado = new Curso("2", "ADO");
        Curso financiera = new Curso("3", "Financiera 1");
        Curso programacion2 = new Curso("4", "Programacion 2");
        Curso baseDatos = new Curso("5", "Base de Datos");
        
        
        
        Universidad uni = new Universidad("UTN");
        
        uni.agregarProfesor(profesor3);
        uni.agregarProfesor(profesor2);
        uni.agregarProfesor(profesor1);

        uni.agregarCurso(ado);
        uni.agregarCurso(programacion1);
        uni.agregarCurso(financiera);
        uni.agregarCurso(programacion2);
        uni.agregarCurso(baseDatos);

        uni.asignarProfesorACurso("2", "1"); 
        uni.asignarProfesorACurso("1", "2"); 
        uni.asignarProfesorACurso("4", "2");
        uni.asignarProfesorACurso("5", "2"); 
        uni.asignarProfesorACurso("3", "3"); 

       
        uni.listarProfesor();

        uni.listarCursos();

        uni.listarProfesor();

        System.out.println("//////////////////////////////////////////////////////////////////");
        System.out.println("Reasignamos el curso de Programacion 1 al docente" + "Pablo Castro");
        uni.asignarProfesorACurso("1", "1");
        uni.listarCursos();
        uni.listarProfesor();


        System.out.println("******************************************************************");
        System.out.println("Removemos el curso de id=2 y vemos los profesores");
        uni.eliminarCurso(financiera); 
        uni.listarProfesor();
        uni.listarCursos();


        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Removemos al profesor de id=1");
        uni.eliminarProfesor(profesor1);

        uni.listarProfesor();
    }
}