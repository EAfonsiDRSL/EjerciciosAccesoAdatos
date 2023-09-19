import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int num_aleatorio = (int)(Math.random()*100);
        int num_adivinado;
        Scanner sc = new Scanner(System.in);
        do {

        System.out.println("Introduzca un numero a adivinar entre 0 y 100");

        num_adivinado = sc.nextInt();

        if (num_adivinado == num_aleatorio){
            System.out.println("Has adivinado");
        }else {
            System.out.println("No has adivinado");
            if (num_adivinado > num_aleatorio){
                System.out.println("Pista: El numero es menor");
            } else {
                System.out.println("Pista: El numero es mayor");
            }
        }
    }
        while (num_adivinado != num_aleatorio);
    }

}
