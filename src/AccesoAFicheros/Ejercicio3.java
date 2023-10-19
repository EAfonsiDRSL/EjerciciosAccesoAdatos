package AccesoAFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        String fichero ="C:\\Users\\EliotAlfonsoAriasO\\IdeaProjects\\EjerciciosAccesoAdatos\\fich texto.txt";

        FileWriter fileWriter = new FileWriter(fichero);
        try {

            fileWriter.write("Esto es un texto escrito en un fichero de texto");
            fileWriter.close();

            System.out.println("Fichero escrito correctamente");

        }catch (Exception e){
            System.out.println("No se ha podido escribir sobre el fichero ");
            e.printStackTrace();
        }
    }
}
