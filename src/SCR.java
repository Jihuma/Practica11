import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileWriter;

public class SCR {
    public void Archivos(Alumnos[] alum) {

        try {
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("Calificaciones.txt"));
            for (int i = 0; i < alum.length; i++) {
                s.writeObject(alum[i]);
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Archivo creado con exito.");
    }
}