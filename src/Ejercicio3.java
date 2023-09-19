import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {



            String letra = JOptionPane.showInputDialog("Introduzca un caracter");


            char caracter = letra.charAt(0);

            if (Character.isDigit(caracter)) {
                JOptionPane.showMessageDialog(null, "El caracter introducido es un numero, porfavor introduzca un caracter");

            } else if (Character.isLowerCase(caracter)) {
                JOptionPane.showMessageDialog(null, "La letra es minuscula");
            } else {

                JOptionPane.showMessageDialog(null, "La letra es Mayuscula");

            }




    }
}
