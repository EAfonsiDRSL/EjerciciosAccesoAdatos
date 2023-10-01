package EjerciciosCommons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio7 {


    public static void main(String[] args) {
        copiaArchivos();
    }

    static void copiaArchivos(){

        File Dir = new File("C:\\Users\\arias\\IdeaProjects\\EjerciciosAccesoAdatos\\Prueba");
        File Dir2 = new File(Dir,"Copia_Prueba");

        File archivo1, archivo2;
        archivo1 = new File("C:\\Users\\arias\\IdeaProjects\\EjerciciosAccesoAdatos\\Prueba\\a");
        archivo2 = new File("C:\\Users\\arias\\IdeaProjects\\EjerciciosAccesoAdatos\\Prueba\\b");

        try {

            FileUtils.copyFileToDirectory(archivo1,Dir2);
            FileUtils.copyFileToDirectory(archivo2,Dir2);

            System.out.println("Archivos copiados correctamente");


        }catch (IOException e){
            System.out.println("No se han podido copiar los archivos");
        }


    }
}
