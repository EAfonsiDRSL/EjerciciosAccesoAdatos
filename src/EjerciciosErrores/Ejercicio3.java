package EjerciciosErrores;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Introduzca una palabra");
            //Si introducimos un tipo de dato distinto al esperado se generara la excepcion
            int numero = sc.nextInt();
        }catch (Exception e){
            System.out.println("Se ha captado la excepcion con nombre "+e);
        }

    }
}