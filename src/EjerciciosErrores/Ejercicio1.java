package EjerciciosErrores;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length - 1; j++) {
                matriz[i][j] = i + j;

            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();


        // la Excepcion que ocurre es ArrayIndexOutOfBoundsException
        // Si intentas visualizar las posiciones cuya fila es 2 y columna es 3 te salta un error dado que no exista al estar vacia
        // System.out.println(matriz[2][3]);
        // Si queremos solucionar este error nos bastaria con rellenar la ultima columna
    }


}

