package EjerciciosRepaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>numeros_ordenados=new ArrayList<>();

        for (int i = 0; i<=2;i++){
            System.out.println("Introduzca un numero");
            numeros_ordenados.add(i,sc.nextInt());

        }
        numeros_ordenados.sort(Comparator.naturalOrder());

        System.out.println(numeros_ordenados);
    }
}

