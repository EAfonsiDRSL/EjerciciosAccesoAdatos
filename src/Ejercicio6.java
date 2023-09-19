import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca un numero del 0 al 10");

        int numero = sc.nextInt();
        if (numero < 0 || numero > 10 ){
            throw new Exception("El numero debe estar comprendido entre 0 y 10");
        }
        int i;
        for ( i = 1; i <= 20 ; i++ ){
            int resultado = numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
}
