public class Director extends Empleados {

    private String contrasena;

    public Director(String nombre, int edad, String rfc) {
        super(nombre, edad, rfc);
    }

    public Director(String nombre, int edad, String rfc, String contra) {
        super(nombre, edad, rfc);
        this.contrasena = contra;
    }

    public Director(String nombre, String contra) {
        super(nombre);
        this.contrasena = contra;
    }

    public String getNombre() {
        return Nombre_completo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getEdad() {
        return edad;
    }
}
