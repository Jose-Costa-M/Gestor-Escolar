import java.util.ArrayList;

public class Grupo {

    private String grupo;
    private ArrayList<Materias> materias;

    public Grupo(String group, ArrayList<Materias> mat) {
        this.grupo = group;
        this.materias = mat;
    }

    public String getGrupo() {
        return grupo;
    }

    public ArrayList<Materias> getMaterias() {
        return materias;
    }

    public boolean getProfes(String ID, String Rfc) {
        for (Materias m : materias) {
            if (m.getMaster().equals(ID) && m.getRfc().equals(Rfc)) {
                return true;
            }
        }
        return false;// No encontro profesor
    }

    public int IndexArray(String ID) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i).getMaster().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

}
