class Materias {
    private String mat;
    private Profesor master;

    public Materias(String topic, String nombre_prof, int edad, String rfc) {
        this.mat = topic;
        master = new Profesor(nombre_prof, edad, rfc);
    }

    public String getMateria() {
        return mat;
    }

    public String getMaster() {
        return master.getNombre();
    }

    public String getRfc() {
        return master.getRFC();
    }

}