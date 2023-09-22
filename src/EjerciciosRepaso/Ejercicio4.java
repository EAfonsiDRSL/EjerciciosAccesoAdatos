package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {


        System.out.println("Introduzca una nota de 0 a 10");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("insuficiente");break;
            case 5:
                System.out.println("suficiente");break;
            case 6:
                System.out.println("bien");break;
            case 7:
            case 8:
                System.out.println("notable");break;
            case 9:
            case 10:
                System.out.println("sobresaliente");break;
                default:
                System.out.println("Debe introducir una nota entre 0 y 10");
        }

    }
}
