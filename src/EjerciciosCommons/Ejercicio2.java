package EjerciciosCommons;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {


        File directorio = new File("NUEVODIR");
        File fichero1 = new File(directorio,"FICHERO1.TXT");
        File fichero2 = new File(directorio, "FICHERO2.TXT");
        File fichero_renombrado = new File(directorio, "FICHERO-1-COPIA.TXT");


            if (directorio.mkdir()) {
                System.out.println("Directorio con nombre " + directorio.getName() + " ha sido creado");
            }
            if (fichero1.createNewFile() && fichero2.createNewFile()) {
                System.out.println("Los ficheros se han creado exitosamente");
            }

            if (fichero1.renameTo(fichero_renombrado)) {
                System.out.println("El fichero ha sido renombrado");
            }

            if (fichero_renombrado.delete() && fichero2.delete()) {
                System.out.println("Los ficheros han sido borrados");
            }

           if (directorio.delete()) {
                System.out.println("El directorio " + directorio.getName() + " ha sido borrado");
            }


    }
}
