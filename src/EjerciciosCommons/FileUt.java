package EjerciciosCommons;

import java.io.File;
import java.io.IOException;

public class FileUt {
    public static void main(String[] args) throws IOException {

        File d = new File("Directorio");
        File f1 = new File("Directorio/fichero1.txt");
        File f2 = new File("fichero2.txt");


        if (!d.mkdir()) {
            if (!d.exists()) {
                System.out.println("No se ha podido crear el directorio");
                System.exit(0);
            }
        }

            if (f1.createNewFile()) {
                System.out.println("Fichero "+f1+ " creado correctamente");

            } else {
                System.out.println("No se puede crear el fichero con nombre " + f1);
            }
            if (f2.createNewFile()){
                System.out.println("Fichero "+f2+" creado correctamente");
            }else {
                System.out.println("No se puede crear el fichero con nombre " + f2);
            }
        try {
            if (f1.exists()) {
                f1.renameTo(new File("Ficheros_copia.txt"));
            }
        }catch (Exception i){
            System.out.println("No se ha podido renombrar el fichero");
            i.getMessage();
        }

        if (f1.exists() && f2.exists()){
            if (f1.delete()){
                System.out.println("fichero borrado correctamente");
            }
            f2.delete();
        }




    }
}
