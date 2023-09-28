package EjerciciosCommons;

import java.io.File;
import java.sql.SQLOutput;

public class Ejercicio4 {
    public static void main(String[] args) {

        String directoriPath = "C:/Users/EliotAlfonsoAriasO/Documents/Desarrollo de Interfaces/Segunda tarea.pdf";

        File directorio = new File(directoriPath);

        System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
        System.out.println("Nombre del fichero: "+directorio.getName());
        System.out.println("Ruta: "+directorio.getPath());
        System.out.println("Ruta absoluta: "+directorio.getAbsolutePath());
        System.out.println("Se puede leer: "+directorio.canRead());
        System.out.println("Se puede escribir: "+directorio.canWrite());
        System.out.println("Tamaño: "+directorio.length());
        System.out.println("Es un directorio: "+directorio.isDirectory());
        System.out.println("Es un fichero: "+directorio.isFile());
        System.out.println("Nombre del directorio padre: "+directorio.getParent());

    }
}
