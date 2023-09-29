package EjerciciosCommons;

import java.io.File;

public class Ejercicio7 {

    static void creacionDir(){

        File Dir = new File("Origen");
        File Dir2 = new File("Destino");
        Dir.mkdir();
    }
}
