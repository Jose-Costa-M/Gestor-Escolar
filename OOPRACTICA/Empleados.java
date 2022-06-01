public class Empleados extends Persona {
    protected String RFC;

    public Empleados(String nombre, int edad, String rfc) {
        super(nombre, edad);
        RFC = rfc;
    }

    public Empleados(String nombre) {
        super(nombre);

    }

    public String getNombre() {
        return Nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public String getRFC() {
        return RFC;
    }
}
