import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [5];
        for (int i = 0; i<numeros.length; i++){
            System.out.println("Introduzca el numero en la posicion "+(i+1));
            numeros[i] = sc.nextInt();
        }
        System.out.println("El array introducido es el siguiente:");
        System.out.println(Arrays.toString(numeros));
        System.out.print("La media del array es: ");
        System.out.println(CalcularMediaArray(numeros));
    }
    public static double CalcularMediaArray (int [] numero){

        double media;
        int suma = 0;
        for (int i = 0; i<numero.length;i++){
            suma = numero[i] + suma;
        }
        media = suma / numero.length;
        return media;
    }
}
