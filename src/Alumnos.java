import java.io.Serializable;

public class Alumnos implements Serializable {
    private String nom;
    private String matr;
    float Promedio;
    float calificaciones[] = new float[7];

    public Alumnos() {
        setNom(CapturaEntrada.CapturarString("Alumno"));
        setMatr(CapturaEntrada.CapturarString("Matricula"));
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNom() {
        return nom;
    }

    public String getMatr() {
        return matr;
    }

    public void Calcularprom() {
        Promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            Promedio += calificaciones[i];
        }
        Promedio /= calificaciones.length;
    }

    public void ImpAlumno() {
        System.out.println("Alumno:" + nom);
        System.out.println("Matricula:" + matr);
        System.out.println("Calificaciones");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("Promedio:" + Promedio);

    }

}