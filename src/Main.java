public class Main {
    public static void main(String[] args) {
        Alumnos alum[] = new Alumnos[3];
        Archivo AC = new Archivo();
        SCR SC = new SCR();
        AC.Archivocsv();
        int z = 0;

        for (int i = 0; i < alum.length; i++) {
            alum[i] = new Alumnos();
            for (int j = 0; j < alum[0].calificaciones.length; j++) {
                alum[i].calificaciones[j] = AC.calificaciones[z];
                z++;
            }
            alum[i].Calcularprom();
        }

        for (Alumnos alumno : alum) {
            alumno.ImpAlumno();
        }
        SC.Archivos(alum);
    }
}