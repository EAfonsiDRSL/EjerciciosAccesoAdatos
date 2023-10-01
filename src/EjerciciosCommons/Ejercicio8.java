package EjerciciosCommons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        File archivo1, archivo2 , destino;

        destino = new File("C:/Users/arias/IdeaProjects/EjerciciosAccesoAdatos/Prueba/Copia_Prueba","archivos_movidos");
        archivo1 = new File("C:/Users/arias/IdeaProjects/EjerciciosAccesoAdatos/Prueba/Copia_Prueba/a");
        archivo2 = new File("C:/Users/arias/IdeaProjects/EjerciciosAccesoAdatos/Prueba/Copia_Prueba/b");

        moverArchivos(archivo1,archivo2,destino);

    }


    static void moverArchivos(File archivo_origen1, File archivo_origen2 , File destino){


        try {
            FileUtils.moveFileToDirectory(archivo_origen1,destino,true);
            FileUtils.moveFileToDirectory(archivo_origen2,destino,true);
            System.out.println("Archivo "+archivo_origen1+" y "+archivo_origen2+" movidos exitosamente al directorio "+destino);

        }catch (IOException e){
            System.out.println("No se ha podido mover el archivo");
            e.printStackTrace();
        }


    }
}
