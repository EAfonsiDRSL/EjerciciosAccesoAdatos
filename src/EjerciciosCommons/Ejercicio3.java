package EjerciciosCommons;

import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {

        String directorio_a_buscar = "C://Users//EliotAlfonsoAriasO//IdeaProjects//EjerciciosAccesoAdatos/.idea";

        File directorio = new File(directorio_a_buscar);

        if (directorio.isDirectory()){
            File [] archivos = directorio.listFiles();
            if (archivos != null){
                int num_archivos = archivos.length;
                System.out.println("El numero de archivos en el directorio "+directorio+ " es : "+num_archivos);
            }else {
                System.out.println("La carpeta esta vacia");
            }
        }

    }
}
