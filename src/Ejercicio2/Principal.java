/**
 * Construir un programa que permita dirigir el movimiento de un objeto
 * dentro de un tablero y actualice su pósición dentro del mismo.
 * Los movimientos posibles son arriba, abajo, izquierda y derecha.
 * Tras cada movimiento el programa mostrara la nueva dirección
 * elegida y las cordenadas de situación del objeto dentro del tablero.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Daniel
 * @Github: Dan_raccoon_69
 */
public class Principal {

    public static void main(String[] args) {
        int opcionInicializar, opcion, x, y;
        Scanner datos = new Scanner(System.in);
        Objeto ob;

        //Inicializar objeto por defecto o manual
        do {
            System.out.println("\n1. Inicializar manualmente\n2. Inicio predeterminado");
            System.out.println("\nElige una opcion: ");
            opcionInicializar = datos.nextInt();
        } while (opcionInicializar != 1 && opcionInicializar != 2);

        if (opcionInicializar == 1) {
            System.out.println("Ingresa X: ");
            x = datos.nextInt();
            System.out.println("Ingresa Y: ");
            y = datos.nextInt();
            ob = new Objeto(x, y);
        } else {
            ob = new Objeto();
        }

        // menu principal, los diversos movimientos que realiza el objeto
        do {
            System.out.println("\n1. Mover Arriba\n2. Mover Abajo\n3. Mover Derecha\n4. Mover Izquierda\n5. Salir");
            System.out.println("\nElige una opcion: ");
            opcion = datos.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(ob.moverArriba());
                    break;
                case 2:
                    System.out.println(ob.moverAbajo());
                    break;
                case 3:
                    System.out.println(ob.moverDerecha());
                    break;
                case 4:
                    System.out.println(ob.moverIzquierda());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 5);
    }
}
