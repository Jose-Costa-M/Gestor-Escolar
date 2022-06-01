import java.util.ArrayList;
import java.text.DecimalFormat;

public class Alumno extends Persona {
    // encapsular

    private String grupo, turno;
    private Integer boleta, reportes;
    private double promedio;
    private ArrayList<Double> calificaciones;

    private Grupo group; // Agregacion de clases
    // Constructor

    public Alumno(String nombre, int edad, int nboleta, String grup, String turn, double prom, Grupo g,
            ArrayList<Double> cal) {
        super(nombre, edad);
        boleta = nboleta;
        grupo = grup;
        turno = turn;
        promedio = prom;
        reportes = 0;
        this.group = g;
        calificaciones = cal;
    }

    public String GetNombre() {
        return Nombre_completo;
    }

    public boolean GetProfes(String ID, String Rfc) {
        return group.getProfes(ID, Rfc);
    }

    public int getReporte() {
        return reportes;
    }

    public Integer GetBoleta() {
        return boleta;
    }

    public Integer getBoleta() {
        return boleta;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getTurno() {
        return turno;
    }

    public double getProm() {
        return promedio;
    }

    public String getGroup() {
        return group.getGrupo();
    }

    public void getMatCal() {
        ArrayList<Materias> m = group.getMaterias();
        for (int i = 0; i < m.size(); i++) {
            System.out.print(m.get(i).getMateria() + ": ");
            System.out.println(String.format("%.2f", calificaciones.get(i)));
        }

    }

    public void SetCalif(double cal) {
        calificaciones.add(cal);
    }

    public void setCalif(Double cal, String ID, Alumno a) {
        int n = group.IndexArray(ID);
        if (n != -1) {
            calificaciones.set(n, cal);
            // a.SetCalif(cal);
            this.promedio = this.getPromedio();
        }
    }

    public void setReporte() {
        reportes++;
    }

    public void setProm(double prom) {
        promedio = prom;
    }

    public void setGrupo(String grup) {
        grupo = grup;
    }

    public void setTurno(String turn) {
        turno = turn;
    }

    public void setGroup(Grupo g) {
        group = g;
    }

    public double getPromedio() {
        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        return suma / calificaciones.size();
    }

    public void setPromedio(double prom) {
        promedio = prom;
    }

}
