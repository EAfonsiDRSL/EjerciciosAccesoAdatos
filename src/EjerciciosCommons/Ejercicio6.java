package EjerciciosCommons;

import java.io.File;

public class Ejercicio6 {

    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\EliotAlfonsoAriasO\\IdeaProjects\\EjerciciosAccesoAdatos\\src\\si";

        File directory = new File(directoryPath);

       for (int i = 0 ; i< args.length; i++){
            System.out.println("El argumento "+i+" es : "+args[i]);
            if (esFichero(directory,args[i])){
                System.out.println("El archivo "+args[i]+" es un fichero del directorio "+directory);
            }
       }
    }

    static boolean esFichero(File f, String argumento){

        File f2 = new File(f,argumento);



        return false;
    }
}
