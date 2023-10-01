package EjerciciosCommons;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {

        String directoryPath = "C:\\Users\\arias\\IdeaProjects\\EjerciciosAccesoAdatos\\Prueba";

        File directory = new File(directoryPath);

        //crear_fichero();

       for (int i = 0 ; i< args.length; i++){
            System.out.println("El argumento "+i+" es : "+args[i]);
            if (esFichero(directory,args[i])){
                System.out.println("El archivo "+args[i]+" es un fichero del directorio "+directory);
            }else {
                System.out.println("El archivo no es un fichero");
            }
       }
    }

    //En este metodo verificamos si el archivo leido es un fichero o no y si este coincide con el argumento pasado
    static boolean esFichero(File f, String argumento){
        File f2 = new File(f,argumento);
        return f2.isFile();
    }


    //Con este metodo creamos un directorio y sus archivos para realizar la prueva
    static void crear_fichero() throws IOException {

        File directorio = new File("Prueba");
        File fichero1 = new File(directorio,"a");
        File fichero2 = new File(directorio, "b");
        File directorio2 = new File(directorio,"c");



        if (directorio.mkdir()) {
            System.out.println("Directorio con nombre " + directorio.getName() + " ha sido creado");
        }
        if (fichero1.createNewFile() && fichero2.createNewFile() && directorio2.mkdir()) {
            System.out.println("Los ficheros y el directorio se han creado exitosamente");
        }
    }
}
