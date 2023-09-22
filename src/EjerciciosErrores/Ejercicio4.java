package EjerciciosErrores;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) throws Exception {


        int nota;
        boolean opcion = false;
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su nota"));

            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    JOptionPane.showMessageDialog(null, "insuficiente");
                    opcion = true;
                    throw new Exception("Has suspendido.");
                case 5:
                    JOptionPane.showMessageDialog(null, "suficiente");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "bien");
                    break;
                case 7:
                case 8:
                    JOptionPane.showMessageDialog(null, "notable");
                    break;
                case 9:
                case 10:
                    JOptionPane.showMessageDialog(null, "sobresaliente");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Debe introducir una nota entre 0 y 10");
                    break;
            }
        }while (opcion == false);

    }
}
