package EjerciciosCommons;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {


        int num_archivos;
        String directoryPath = "C:/Wallpaper Engine";

        File directory = new File(directoryPath);

        if (directory.isDirectory()){
            File [] archivos = directory.listFiles();
            if (archivos != null){
                num_archivos = archivos.length;
                System.out.println("Ficheros en el directorio actual: "+num_archivos);
                for (int i = 0 ; i < num_archivos; i++){
                    System.out.println("Nombre: "+archivos[i].getName()+", es fichero?: "+archivos[i].isFile()+", es directorio?: "+archivos[i].isDirectory());
                }
            }else {
                System.out.println("El directorio está vacio");
            }


        }
    }
}
