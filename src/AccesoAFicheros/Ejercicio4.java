package AccesoAFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

        String fichero ="C:\\Users\\EliotAlfonsoAriasO\\IdeaProjects\\EjerciciosAccesoAdatos\\fich texto.txt";

        try {
            // Crea un objeto FileReader para el archivo en filePath
            FileReader reader = new FileReader(fichero);

            int character;

            // Lee el archivo caracter por caracter y muestra el contenido
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Cierra el FileReader una vez que hayas terminado de leer
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
