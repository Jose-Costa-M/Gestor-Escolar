public class Profesor extends Empleados {

    private static int CantProf;

    public Profesor(String nombre, int edad, String rfc) {
        super(nombre, edad, rfc);
        IncrementarProf();
    }

    public static void IncrementarProf() {
        CantProf++;
    }

    public static int GetProfes() {
        return CantProf;
    }

}

/*
 * Persona
 * |
 * Empleados - Alumnos
 * |
 * Director - Profesores - Encargados de lab
 * 
 * 
 * 
 * 
 * 
 */