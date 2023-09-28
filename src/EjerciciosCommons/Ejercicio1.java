package EjerciciosCommons;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {


        File directorio = new File("NUEVODIR");
        File fichero1 = new File(directorio,"FICHERO1.TXT");
        File fichero2 = new File(directorio, "FICHERO2.TXT");

        directorio.mkdir();
        fichero1.createNewFile();
        fichero2.createNewFile();

        if (fichero1.exists()){
            fichero1.renameTo(new File(directorio,"FICHERO-1-COPIA.TXT"));
        }
    }

}
