package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Buenos dias "+nombre+" tienes "+edad+" años");
    }
}
