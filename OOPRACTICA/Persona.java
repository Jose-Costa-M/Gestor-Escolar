public class Persona {

    private static int Gente;
    protected String Nombre_completo;
    protected int edad;

    public Persona(String nombre, int edad) {
        Nombre_completo = nombre;
        this.edad = edad;
        IncrementarGente();
    }

    public Persona(String nombre) {
        Nombre_completo = nombre;
        IncrementarGente();

    }

    public void IncrementarGente() {
        Gente++;
    }

    public int getGente() {
        return Gente;
    }

    public String getNombre() {
        return Nombre_completo;
    }

    public int getEdad() {
        return edad;
    }
}
