import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Scanner;

class Main {
    public static Double Prom(ArrayList<Double> calificaciones) {
        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        return suma / calificaciones.size();
    }

    // 1CM1
    public static ArrayList<Materias> BDMaterias1CM1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\MATUTINO\\1CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos1CM1() throws IOException {
        ArrayList<Materias> TOPICS_1CM1 = BDMaterias1CM1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        // Almacena las calificaciones randoms

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\MATUTINO\\ALUMNOS_1CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_1CM1), calificaciones));
        }

        return listAlumnos;
    }

    // 2CM1
    public static ArrayList<Materias> BDMaterias2CM1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\MATUTINO\\2CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos2CM1() throws IOException {
        ArrayList<Materias> TOPICS_2CM1 = BDMaterias2CM1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\MATUTINO\\ALUMNOS_2CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_2CM1), calificaciones));
        }

        return listAlumnos;
    }

    // 3CM1
    public static ArrayList<Materias> BDMaterias3CM1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\MATUTINO\\3CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos3CM1() throws IOException {
        ArrayList<Materias> TOPICS_3CM1 = BDMaterias3CM1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\MATUTINO\\ALUMNOS_3CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_3CM1), calificaciones));
        }

        return listAlumnos;
    }

    // 4CM1
    public static ArrayList<Materias> BDMaterias4CM1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\MATUTINO\\4CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos4CM1() throws IOException {
        ArrayList<Materias> TOPICS_4CM1 = BDMaterias4CM1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\MATUTINO\\ALUMNOS_4CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_4CM1), calificaciones));
        }

        return listAlumnos;
    }

    // 5CM1
    public static ArrayList<Materias> BDMaterias5CM1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\MATUTINO\\5CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos5CM1() throws IOException {
        ArrayList<Materias> TOPICS_5CM1 = BDMaterias5CM1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\MATUTINO\\ALUMNOS_5CM1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_5CM1), calificaciones));
        }

        return listAlumnos;
    }

    // 1CV1
    public static ArrayList<Materias> BDMaterias1CV1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\VESPERTINO\\1CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos1CV1() throws IOException {
        ArrayList<Materias> TOPICS_1CV1 = BDMaterias1CV1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\VESPERTINO\\ALUMNOS_1CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_1CV1), calificaciones));
        }

        return listAlumnos;
    }

    // 2CV1

    public static ArrayList<Materias> BDMaterias2CV1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\VESPERTINO\\2CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos2CV1() throws IOException {
        ArrayList<Materias> TOPICS_1CV1 = BDMaterias2CV1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\VESPERTINO\\ALUMNOS_2CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_1CV1), calificaciones));
        }

        return listAlumnos;
    }

    // 3CV1

    public static ArrayList<Materias> BDMaterias3CV1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\VESPERTINO\\3CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos3CV1() throws IOException {
        ArrayList<Materias> TOPICS_1CV1 = BDMaterias3CV1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\VESPERTINO\\ALUMNOS_3CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_1CV1), calificaciones));
        }

        return listAlumnos;
    }

    // 4CV1
    public static ArrayList<Materias> BDMaterias4CV1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\VESPERTINO\\4CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos4CV1() throws IOException {
        ArrayList<Materias> TOPICS_1CV1 = BDMaterias4CV1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\VESPERTINO\\ALUMNOS_4CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_1CV1), calificaciones));
        }

        return listAlumnos;
    }

    // 5CV1

    public static ArrayList<Materias> BDMaterias5CV1() throws IOException {
        String materia = "", nombre_bd = " ", rfc_bd = " ", limite = ",", linea;
        int edad_bd = 0;
        ArrayList<Materias> listMateria = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\MateriasBD\\VESPERTINO\\5CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        materia = a[l];// Materia
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);// Edad del profe
                        break;
                    case 2:
                        nombre_bd = a[l];// Nombre del profe
                        break;
                    case 3:
                        rfc_bd = a[l];
                        break;

                }
            }

            listMateria.add(new Materias(materia, nombre_bd, edad_bd, rfc_bd));
        }
        return listMateria;
    }

    public static ArrayList<Alumno> BDAlumnos5CV1() throws IOException {
        ArrayList<Materias> TOPICS_1CV1 = BDMaterias5CV1();
        ArrayList<Double> calificaciones = new ArrayList<>();
        double min_val = 5;
        double max_val = 9;

        String nombre_bd = "", turno_bd = " ", grupo_bd = " ", limite = ",", linea;
        int edad_bd = 0, boleta_bd = 0;
        double promedio_bd = 0;
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        File archivo = new File("E:\\OOPRACTICA\\DataBaseStatic\\Alumnos\\VESPERTINO\\ALUMNOS_5CV1.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        while (((linea = br.readLine()) != null)) {

            String a[] = linea.split(limite);
            for (int l = 0; l < a.length; l++) {
                switch (l) {
                    case 0:
                        nombre_bd = a[l];
                        break;
                    case 1:
                        edad_bd = Integer.parseInt(a[l]);
                        break;
                    case 2:
                        boleta_bd = Integer.parseInt(a[l]);
                        break;
                    case 3:
                        grupo_bd = a[l];
                        break;
                    case 4:
                        turno_bd = a[l];
                        break;

                }
            }
            // Almacena las calificaciones randoms
            for (int i = 0; i < 5; i++) {
                calificaciones.add(ThreadLocalRandom.current().nextDouble(min_val, max_val));
            }
            promedio_bd = Prom(calificaciones);
            listAlumnos.add(new Alumno(nombre_bd, edad_bd, boleta_bd, grupo_bd, turno_bd, promedio_bd,
                    new Grupo(grupo_bd, TOPICS_1CV1), calificaciones));
        }

        return listAlumnos;
    }

    // -> SPACE <-1

    public static void MenuEscolar() {
        System.out.print("\n|---------------------------------------|");
        System.out.print("\n|       ° BIENVENIDO ESCOM °            |");
        System.out.print("\n|--------------------|------------------|");
        System.out.print("\n| 1. ALUMNO          | 4. SALIR         |");
        System.out.print("\n| 2. PROFESOR        |                  |");
        System.out.print("\n| 3. DIRECTOR        |                  |");
        System.out.println("\n|--------------------|------------------|");
        System.out.print("Elige la opcion: ");
    }

    public static void MenuRoot() {
        System.out.print("\n|---------------------------------------|");
        System.out.print("\n|       ° BIENVENIDO SR. DIRECTOR °     |");
        System.out.print("\n|--------------------|------------------|");
        System.out.print("\n| 1. EXPULSAR ALUMNO | 3. INFO ESCOLAR  |");
        System.out.print("\n| 2. PERMITIR INS.   | 4. SALIR         |");
        System.out.println("\n|--------------------|------------------|");
        System.out.print("Elige la opcion: ");

    }

    public static void getAlumnos(ArrayList<Alumno> al1) {
        for (Alumno alumno : al1) {
            System.out.println("NOMBRE: " + alumno.getNombre());
            System.out.println("EDAD: " + alumno.getEdad());
            System.out.println("BOLETA: " + alumno.getBoleta());
            System.out.println("PROMEDIO: " + String.format("%.2f", alumno.getProm()));
            System.out.println("GRUPO: " + alumno.getGrupo());
            System.out.println("TURNO: " + alumno.getTurno());
            System.out.println("REPORTES: " + alumno.getReporte());
            System.out.println("\n\n");

        }

    }

    public static boolean BuscaAlumno(ArrayList<Alumno> al1, String ID, Integer boleta, String grupo) {
        boolean n = false;
        for (Alumno alumno : al1) {
            if (alumno.getBoleta().equals(boleta) && alumno.getNombre().equals(ID)) {
                n = alumno.getBoleta().equals(boleta) && alumno.getNombre().equals(ID);
                break;
            }
        }
        return n;
    }

    public static int eleccionGrupo(String g) {
        ArrayList<String> topics = new ArrayList<>();
        int cont = 1;
        topics.add("1CM1"); // 1
        topics.add("2CM1");// 2
        topics.add("3CM1");// 3
        topics.add("4CM1");// 4
        topics.add("5CM1");// 5
        topics.add("1CV1");// 6
        topics.add("2CV1");// 7
        topics.add("3CV1");// 8
        topics.add("4CV1");// 9
        topics.add("5CV1");// 10

        for (String topic : topics) {
            if (topic.equals(g)) {
                return cont;
            }
            cont++;
        }

        return 0;
    }

    public static void PrintAlumno(ArrayList<Alumno> al1, String ID, Integer boleta, String grupo) {

        for (Alumno alumno : al1) {
            if (alumno.getBoleta().equals(boleta) && alumno.getNombre().equals(ID)) {

                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Edad: " + alumno.getEdad());
                System.out.println("Grupo: " + alumno.getGrupo());
                System.out.println("Boleta: " + alumno.getBoleta());
                System.out.println("Turno: " + alumno.getTurno());
                System.out.println("Promedio: " + String.format("%.2f", alumno.getProm()));

            }
        }
    }

    // public static void PrintCalif(ArrayList<Alumno> al1, String ID)
    public static void MenuAlumnos() {
        System.out.print("\n|---------------------------------------|");
        System.out.print("\n|                ° MENU °               |");
        System.out.print("\n|--------------------|------------------|");
        System.out.print("\n| 1. VERIFICAR INFO  | 3. INSCRIBIR GPO |");
        System.out.print("\n| 2. CALIFICACIONES  | 4. SALIR         |");
        System.out.println("\n|--------------------|------------------|");
    }

    public static void getAlumnoCalif(ArrayList<Alumno> al1, String ID, Integer boleta, String grupo) {
        for (Alumno alumno : al1) {
            if (alumno.getBoleta().equals(boleta) && alumno.getNombre().equals(ID)) {
                alumno.getMatCal();
            }
        }
    }

    public static void EliminaAlumno(ArrayList<Alumno> a, int nboleta) {
        for (Alumno alumno : a) {
            if (alumno.getBoleta() == nboleta) {
                a.remove(alumno);
                return;
            }
        }
    }

    public static void MenuProfes() {
        System.out.print("\n|---------------------------------------|");
        System.out.print("\n|             ° MENU PROFES °           |");
        System.out.print("\n|--------------------|------------------|");
        System.out.print("\n| 1. ASIG CAL        | 3. SALIR         |");
        System.out.print("\n| 2. ASIG REPORT     |                  |");
        System.out.println("\n|--------------------|------------------|");
        System.out.println("Digita la opcion: ");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion, boleta, g;
        boolean permiso = false;
        String termino, contrasenia;
        String Nombre_registro, grupo;
        Scanner entrada = new Scanner(System.in);
        Director root = new Director("ANDRES ORTIGOZA CAMPOS", 60, "CAOA620321A25", "TOOR");
        int num_grup;

        // Se declara la informacion de la escuela

        // ->MATUTINO
        ArrayList<Alumno> Alumnos1CM1 = new ArrayList<Alumno>();
        Alumnos1CM1 = BDAlumnos1CM1();
        ArrayList<Alumno> Alumnos2CM1 = new ArrayList<Alumno>();
        Alumnos2CM1 = BDAlumnos2CM1();
        ArrayList<Alumno> Alumnos3CM1 = new ArrayList<Alumno>();
        Alumnos3CM1 = BDAlumnos3CM1();
        ArrayList<Alumno> Alumnos4CM1 = new ArrayList<Alumno>();
        Alumnos4CM1 = BDAlumnos4CM1();
        ArrayList<Alumno> Alumnos5CM1 = new ArrayList<Alumno>();
        Alumnos5CM1 = BDAlumnos5CM1();

        // ->VESPERTINO
        ArrayList<Alumno> Alumnos1CV1 = new ArrayList<Alumno>();
        Alumnos1CV1 = BDAlumnos1CV1();
        ArrayList<Alumno> Alumnos2CV1 = new ArrayList<Alumno>();
        Alumnos2CV1 = BDAlumnos2CV1();
        ArrayList<Alumno> Alumnos3CV1 = new ArrayList<Alumno>();
        Alumnos3CV1 = BDAlumnos3CV1();
        ArrayList<Alumno> Alumnos4CV1 = new ArrayList<Alumno>();
        Alumnos4CV1 = BDAlumnos4CV1();
        ArrayList<Alumno> Alumnos5CV1 = new ArrayList<Alumno>();
        Alumnos5CV1 = BDAlumnos5CV1();

        do {
            MenuEscolar();
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
            // Screen (cls) solo para terminales; para cualquiera
            // System.out.print("\033[H\033[2J");

            if (opcion == 1) {
                // ALUMNOS
                System.out.print("Escribe tu nombre completo en mayusculas y sin acentos:");
                Nombre_registro = entrada.nextLine();
                Nombre_registro = Nombre_registro.toUpperCase(); // .toUpperCase() sirve para convertir la cadena en

                System.out.print("Escribe tu boleta:");
                boleta = entrada.nextInt();
                entrada.nextLine();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                System.out.print("Escribe tu grupo:");
                grupo = entrada.nextLine();
                grupo = grupo.toUpperCase();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                num_grup = eleccionGrupo(grupo);

                switch (num_grup) {
                    case 1:
                        if (BuscaAlumno(Alumnos1CM1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos1CM1, Nombre_registro, boleta, grupo);
                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos1CM1, Nombre_registro, boleta, grupo);
                                        break;

                                    case 3:
                                        /// Inscribir Grupo PENDIENTE
                                        if (permiso) {

                                        } else {

                                        }

                                        break;

                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;

                    case 2:
                        if (BuscaAlumno(Alumnos2CM1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos2CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos2CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;
                    case 3:
                        if (BuscaAlumno(Alumnos3CM1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos3CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos3CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;

                    case 4:
                        if (BuscaAlumno(Alumnos4CM1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos4CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos4CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }

                        break;

                    case 5:
                        if (BuscaAlumno(Alumnos5CM1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos5CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos5CM1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;

                    case 6:
                        if (BuscaAlumno(Alumnos1CV1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos1CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos1CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;

                    case 7:
                        if (BuscaAlumno(Alumnos2CV1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos2CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos2CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;
                    case 8:
                        if (BuscaAlumno(Alumnos3CV1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos3CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos3CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;

                    case 9:
                        if (BuscaAlumno(Alumnos4CV1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos4CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos4CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;
                    case 10:
                        if (BuscaAlumno(Alumnos5CV1, Nombre_registro, boleta, grupo)) {

                            do {
                                MenuAlumnos();
                                System.out.print("Digita la opcion: ");
                                opcion = entrada.nextInt();

                                switch (opcion) {
                                    case 1:
                                        // Verificar
                                        PrintAlumno(Alumnos5CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 2:
                                        // Calificaciones: Ya estan pre-definidas
                                        getAlumnoCalif(Alumnos5CV1, Nombre_registro, boleta, grupo);

                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// Clear
                                        break;
                                    default:
                                        ;
                                }

                            } while (opcion != 4);
                            opcion = 1;

                        } else {
                            System.out.println("El perfil mencionado no esta inscrito");
                        }
                        break;

                    default:
                        System.out.println("Opcion no valida, escriba de nuevo la opcion");
                        ;
                }

            } else if (opcion == 2) {
                // PROFESORES
                String nombre_prof, RFC_prof, grupo_prof;
                int op_g;
                boolean n = false;
                System.out.println("Digite el nombre del profesor: ");
                nombre_prof = entrada.nextLine();
                nombre_prof = nombre_prof.toUpperCase();
                System.out.println("Digite el RFC del profesor: ");
                RFC_prof = entrada.next();
                RFC_prof = RFC_prof.toUpperCase();
                entrada.nextLine();
                System.out.println("Digite el grupo del profesor: ");
                grupo_prof = entrada.next();
                grupo_prof = grupo_prof.toUpperCase();
                entrada.nextLine();

                op_g = eleccionGrupo(grupo_prof);
                switch (op_g) {
                    case 1:
                        for (Alumno a : Alumnos1CM1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 2:
                        for (Alumno a : Alumnos2CM1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 3:
                        for (Alumno a : Alumnos3CM1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 4:
                        for (Alumno a : Alumnos4CM1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 5:
                        for (Alumno a : Alumnos5CM1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 6:
                        for (Alumno a : Alumnos1CV1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 7:
                        for (Alumno a : Alumnos2CV1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 8:
                        for (Alumno a : Alumnos3CV1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 9:
                        for (Alumno a : Alumnos4CV1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    case 10:
                        for (Alumno a : Alumnos5CV1) {
                            if (a.GetProfes(nombre_prof, RFC_prof)) {
                                n = true;
                            }
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida, escriba de nuevo la opcion");
                        ;
                }

                if (n) {
                    do {
                        MenuProfes();
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                // Asignar calificacion
                                entrada.nextLine();
                                System.out.println("Escribe el nombre completo del alumno:");
                                Nombre_registro = entrada.nextLine();
                                Nombre_registro = Nombre_registro.toUpperCase(); // .toUpperCase() sirve para convertir
                                                                                 // la
                                                                                 // cadena en

                                System.out.print("Escribe la  boleta:");
                                boleta = entrada.nextInt();
                                entrada.nextLine();
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.print("Escribe el  grupo:");
                                grupo = entrada.nextLine();
                                grupo = grupo.toUpperCase();
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                num_grup = eleccionGrupo(grupo);

                                switch (num_grup) {
                                    case 1:
                                        for (Alumno a : Alumnos1CM1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;

                                    case 2:
                                        for (Alumno a : Alumnos2CM1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (Alumno a : Alumnos3CM1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 4:
                                        for (Alumno a : Alumnos4CM1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 5:
                                        for (Alumno a : Alumnos5CM1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 6:
                                        for (Alumno a : Alumnos1CV1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 7:
                                        for (Alumno a : Alumnos2CV1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 8:
                                        for (Alumno a : Alumnos3CV1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 9:
                                        for (Alumno a : Alumnos4CV1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;
                                    case 10:
                                        for (Alumno a : Alumnos1CM1) {
                                            if (a.getBoleta() == boleta && a.getNombre().equals(Nombre_registro)) {
                                                double cal_aux;
                                                System.out.println("Escribe la calificacion:");
                                                cal_aux = entrada.nextDouble();
                                                a.setCalif(cal_aux, nombre_prof, a);
                                            }
                                        }
                                        break;

                                    default:
                                        System.out.println("Opcion no valida, escriba de nuevo la opcion");
                                        ;
                                }

                                break;

                            case 2:
                                // Asignar reporte
                                System.out.print("Escribe tu nombre completo en mayusculas y sin acentos:");
                                Nombre_registro = entrada.nextLine();
                                Nombre_registro = Nombre_registro.toUpperCase(); // .toUpperCase() sirve para convertir
                                                                                 // la
                                                                                 // cadena en
                                entrada.nextLine();
                                System.out.print("Escribe tu boleta:");
                                boleta = entrada.nextInt();
                                entrada.nextLine();
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.print("Escribe tu grupo:");
                                grupo = entrada.nextLine();
                                grupo = grupo.toUpperCase();
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                num_grup = eleccionGrupo(grupo);

                                switch (num_grup) {
                                    case 1:
                                        for (Alumno a : Alumnos1CM1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos1CM1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;
                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (Alumno a : Alumnos2CM1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos2CM1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }

                                        break;
                                    case 3:
                                        for (Alumno a : Alumnos3CM1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos3CM1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }

                                        break;
                                    case 4:
                                        for (Alumno a : Alumnos4CM1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos4CM1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        for (Alumno a : Alumnos5CM1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos5CM1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 6:
                                        for (Alumno a : Alumnos1CV1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos1CV1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 7:
                                        for (Alumno a : Alumnos2CV1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos2CV1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 8:
                                        for (Alumno a : Alumnos3CV1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos3CV1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 9:
                                        for (Alumno a : Alumnos4CV1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos4CV1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    case 10:
                                        for (Alumno a : Alumnos5CV1) {

                                            if (a.getReporte() >= 3) {
                                                EliminaAlumno(Alumnos5CV1, boleta);
                                                System.out.println("Alumno eliminado por exceso de reportes");
                                                break;

                                            } else {
                                                if (a.getBoleta() == boleta) {
                                                    System.out.println("El alumno " + a.getNombre() + " "
                                                            + "con boleta "
                                                            + a.getBoleta() + " " + "y grupo " + a.getGrupo() + " "
                                                            + "ha sido asignado a un reporte");
                                                    a.setReporte();
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("El grupo no se encuentra");
                                        ;

                                        break;

                                }

                            case 3:
                                // salir
                                break;
                            default:
                                System.out.println("Opcion no valida, escriba de nuevo la opcion");

                                ;
                        }
                    } while (opcion != 3);
                    opcion = 1;
                } else {
                    System.out.println("Informacion incorrecta");
                }
            } else if (opcion == 3) {
                // ADMINS
                System.out.println("Digita tu nombre: ");
                Nombre_registro = entrada.nextLine();
                Nombre_registro = Nombre_registro.toUpperCase();
                System.out.println("Digita tu contrasenia: ");
                contrasenia = entrada.next();

                if (Nombre_registro.equals(root.getNombre()) && contrasenia.equals(root.getContrasena())) {
                    do {
                        MenuRoot();
                        System.out.print("Digita la opcion: ");
                        opcion = entrada.nextInt();

                        switch (opcion) {
                            case 1:
                                // ELIMINAR ALUMNO
                                entrada.nextLine();
                                System.out.println("Digita el nombre del alumno a eliminar: ");
                                Nombre_registro = entrada.nextLine();
                                Nombre_registro = Nombre_registro.toUpperCase();
                                System.out.println("Digita el grupo del alumno a eliminar: ");
                                grupo = entrada.nextLine();
                                grupo = grupo.toUpperCase();
                                System.out.println("Digita la boleta del alumno a eliminar: ");
                                boleta = entrada.nextInt();
                                g = eleccionGrupo(grupo);
                                switch (g) {
                                    case 1:
                                        if (BuscaAlumno(Alumnos1CM1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos1CM1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }

                                        break;
                                    case 2:
                                        if (BuscaAlumno(Alumnos2CM1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos2CM1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 3:
                                        if (BuscaAlumno(Alumnos3CM1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos3CM1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 4:
                                        if (BuscaAlumno(Alumnos4CM1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos4CM1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 5:
                                        if (BuscaAlumno(Alumnos5CM1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos5CM1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 6:
                                        if (BuscaAlumno(Alumnos1CV1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos1CV1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 7:
                                        if (BuscaAlumno(Alumnos2CV1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos2CV1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 8:
                                        if (BuscaAlumno(Alumnos3CV1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos3CV1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 9:
                                        if (BuscaAlumno(Alumnos4CV1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos4CV1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    case 10:
                                        if (BuscaAlumno(Alumnos5CV1, Nombre_registro, boleta, grupo)) {
                                            EliminaAlumno(Alumnos5CV1, boleta);
                                            System.out.println("Alumno eliminado");
                                        } else {
                                            System.out.println("El alumno no esta inscrito");
                                        }
                                        break;
                                    default:
                                        System.out.println("Grupo no valido");
                                        break;
                                }

                                break;
                            case 2:
                                // PERMITIR INSCRIPCION
                                System.out.print("\n|---------------------------------------|");
                                System.out.print("\n|        ° ¿TERMINO EL SEMESTRE? °      |");
                                System.out.print("\n|--------------------|------------------|");
                                System.out.print("\n|       1. YES       |       4. NO      |");
                                System.out.println("\n|--------------------|------------------|");
                                System.out.print("Elige la opcion: ");
                                opcion = entrada.nextInt();
                                if (opcion == 1) {
                                    permiso = true;
                                } else {
                                    permiso = false;
                                }
                                break;
                            case 3:

                                // INFO ESCOLAR
                                int Cantidad = (Alumnos1CM1.size() + Alumnos2CM1.size() + Alumnos3CM1.size()
                                        + Alumnos4CM1.size() + Alumnos5CM1.size() + Alumnos1CV1.size()
                                        + Alumnos2CV1.size() + Alumnos3CV1.size() + Alumnos4CV1.size()
                                        + Alumnos5CV1
                                                .size());
                                System.out.println("Cantidad de alumnos: " + Cantidad);
                                System.out.println("Cantidad de profesores: " + Profesor.GetProfes());

                                break;
                            case 4:
                                // SALIR
                                System.out.println("El programa se ha ejecutado correctamente");
                                break;

                            default:
                                ;
                        }

                    } while (opcion != 4);
                    opcion = 1;
                } else {
                    System.out.println("Usuario o contrasenia incorrectos");
                }

            } else {
                System.out.println("El programa se ha ejecutado con exito.");
            }

        } while (opcion != 4);

    }
}
