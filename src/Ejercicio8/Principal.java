/**
 * Construir un programa para trabajar con 2 numeros complejos, implemente el siguiente menu:
 * 1. Sumar 2 numeros complejos.
 * 2. Multiplicar 2 numeros complejos.
 * 3. Comparar 2 numeros complejos (iguales o no).
 * 4. Multiplicar un numero complejo por un entero.
 */
package Ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 * @Github: Dan-raccoon-69
 */
public class Principal {

    public static void main(String[] args) {
        int opcion, numReal1, numImaginario1, numReal2, numImaginario2, numEntero;
        boolean salir = false;

        NumerosComplejos.mostrarMenu();
        opcion = Integer.parseInt(JOptionPane.showInputDialog("\nIngresa la opcion deseada"));
        NumerosComplejos complejo1;

        switch (opcion) {
            case 1 -> {
                numReal1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real1: "));
                numImaginario1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario1: "));
                numReal2 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real2: "));
                numImaginario2 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario2: "));
                complejo1 = new NumerosComplejos(numReal1, numImaginario1, numReal2, numImaginario2);
                System.out.println(complejo1.sumar2NumComplejos());
            }
            case 2 -> {
                numReal1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real1: "));
                numImaginario1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario1: "));
                numReal2 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real2: "));
                numImaginario2 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario2: "));
                complejo1 = new NumerosComplejos(numReal1, numImaginario1, numReal2, numImaginario2);
                System.out.println(complejo1.multiplicar2NumComplejos());
            }
            case 3 -> {
                numReal1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real1: "));
                numImaginario1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario1: "));
                numReal2 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real2: "));
                numImaginario2 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario2: "));
                complejo1 = new NumerosComplejos(numReal1, numImaginario1, numReal2, numImaginario2);
                System.out.println(complejo1.comparar2NumComplejos());
            }
            case 4 -> {
                numReal1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Real1: "));
                numImaginario1 = Integer.parseInt(JOptionPane.showInputDialog("Numero Imaginario1: "));
                numEntero = Integer.parseInt(JOptionPane.showInputDialog("Numero Entero: "));
                complejo1 = new NumerosComplejos(numReal1, numImaginario1, numEntero);
                System.out.println(complejo1.multiplicarComplejoPorEntero());
            }
            default -> System.out.println("Opcion no encontrada");
        }

    }

}
