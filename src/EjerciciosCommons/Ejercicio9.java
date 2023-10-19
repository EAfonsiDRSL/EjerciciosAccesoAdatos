package EjerciciosCommons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.CopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio9 {

    static final int TAMAÑO_KB = 1000;
    static final int MULTIPLICADOR_KB_B = 1024;
    static final String EXTENSION = ".pdf";

    public static void main(String[] args) {

        File directorio_busqueda = new File("C:\\Users\\EliotAlfonsoAriasO\\Downloads");

        File directorio_destino_pequeños = new File("C:\\Users\\EliotAlfonsoAriasO\\Downloads","DirPDFpeques");
        File directorio_destino_grandes = new File("C:\\Users\\EliotAlfonsoAriasO\\Downloads","DirPDFmayores");
        File [] archivos = directorio_busqueda.listFiles();
        File directorio_A_N = new File(directorio_destino_pequeños,"DirPDFpequesAN");

        if (archivos != null){
            ArrayList <File> archivos_filtrados_pequeño = ficherosPeques(archivos,directorio_destino_pequeños);
            ficheros_A_N(archivos_filtrados_pequeño,directorio_A_N);
            ArrayList <File> archivos_filtrados_grande = ficherosGrandes(archivos,directorio_destino_grandes);
            ordenDecreciente_y_Renombrar(archivos_filtrados_grande);
        }

    }
    //metodo para copiar ficheros con extencion <= 1000KB
    static ArrayList<File> ficherosPeques(File [] archivos, File destino){
        //creamos el arraylist donde guardaremos los archivos
        ArrayList <File> archivos_filtrados = new ArrayList<>();

        int contador = 0;
        for (File e : archivos){
            //evaluamos si cada archivo es un fichero o no y si su tamaño coincide con el establecido
            if (e.isFile() && e.length() <= (TAMAÑO_KB * MULTIPLICADOR_KB_B) ){
                archivos_filtrados.add(e);
                contador++;
                System.out.println(contador+ " == "+e.getName()+" ============== "+e.length());
                //crearemos los archivos que se iran copiando al nuevo directorio
                File archivoDestino = new File(destino,e.getName());
                try{
                    FileUtils.copyFile(e,archivoDestino);

                }catch (IOException exception){
                    System.out.println("No se pueden copiar los archivos");
                    exception.printStackTrace();
                }
            }
            if (contador == 20){
                break;
            }
        }
        return archivos_filtrados;
    }

    //con este metodo cogemos todos los archivos filtrados por tamaño y movemos solo los archivos cuyo nombre empieza entre el rango de a - n
    static void ficheros_A_N(ArrayList <File> archivos, File directorio_destino){
        for (File e : archivos){
            File archivos_a_mover = new File(directorio_destino,e.getName());
            try {
                if (e.getName().charAt(0) >= 'a' && e.getName().charAt(0) <='n' && e.length()<=TAMAÑO_KB){
                    FileUtils.moveFile(e,archivos_a_mover);
                }
            }catch (IOException exception){
                System.out.println("No se han podido mover los archivos ");
                exception.printStackTrace();
            }

        }


    }

    static ArrayList<File> ficherosGrandes (File [] archivos, File destino){

        //creamos el arraylist donde guardaremos los archivos
        ArrayList <File> archivos_filtrados = new ArrayList<>();

        int contador = 0;
        for (File e : archivos){
            //evaluamos si cada archivo es un fichero o no y si su tamaño coincide con el establecido
            if (e.isFile() && e.length() >= (TAMAÑO_KB * MULTIPLICADOR_KB_B) && e.getName().toLowerCase().endsWith(EXTENSION)){
                archivos_filtrados.add(e);
                contador++;
                System.out.println(contador+ " == "+e.getName()+" ============== "+e.length());
                //crearemos los archivos que se iran copiando al nuevo directorio
                File archivoDestino = new File(destino,e.getName());
                try{
                    FileUtils.copyFile(e,archivoDestino);

                }catch (IOException exception){
                    System.out.println("No se pueden copiar los archivos");
                    exception.printStackTrace();
                }
            }
            if (contador == 20){
                break;
            }
        }
        return archivos_filtrados;

    }

    static void ordenDecreciente_y_Renombrar (ArrayList<File>archivos){


        archivos.sort(Comparator.comparing(File::length).reversed());
        System.out.println("=============================================");
        for (int i =0; i< archivos.size() ; i++){

            File archivo = archivos.get(i);
            String nombre_renombrado = (i+1)+"-"+archivo.getName();
            File archivo_renombrado = new File(archivo.getParent(), nombre_renombrado);
            if (archivo.renameTo(archivo_renombrado)){
                System.out.println("El archivo renombrado es: "+archivo_renombrado.getName());
            }else {
                System.out.println("No se ha podigo renombrar el archivo");
            }

        }


        System.out.println(archivos);



    }


}