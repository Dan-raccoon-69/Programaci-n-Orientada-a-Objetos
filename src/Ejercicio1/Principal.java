/**
 * Contruir un programa que calcule el area y el perimetro de cuadrilateros
 * (Cuadrado, rectangulo, rombo, romboide, trapecio) dada la longitud de
 * sus lados. Los valores de la longitud deberan introducirse por
 * linea de ordenes.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 * @Github: Dan_raccoon_69
 */
public class Principal {

    public static void main(String[] args) {
        int opcion;
        Scanner datos = new Scanner(System.in);

        do {
            System.out.println("\n1. Cuadrado\n2. Rectangulo\n3. Rombo\n4. Romboide\n5. Trapecio\n6. Salir");
            System.out.println("\nElige una opcion: ");
            opcion = datos.nextInt();

            switch (opcion) {
                case 1:
                    double lado;
                    System.out.println("Lado: ");
                    lado = datos.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    System.out.println("\n" + cuadrado.mostrarDatos());
                    break;
                case 2:
                    double base,
                     altura;
                    System.out.println("Base: ");
                    base = datos.nextDouble();
                    System.out.println("Altura: ");
                    altura = datos.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("\n" + rectangulo.mostrarDatos());
                    break;
                case 3:
                    double Dmayor, Dmenor, ladoRombo;
                    System.out.println("Diagonal mayor: ");
                    Dmayor = datos.nextDouble();
                    System.out.println("Diagonal menor: ");
                    Dmenor = datos.nextDouble();
                    System.out.println("Lado: ");
                    ladoRombo = datos.nextDouble();
                    Rombo rombo = new Rombo(Dmayor, Dmenor, ladoRombo);
                    System.out.println("\n" + rombo.mostrarDatos());
                    break;
                case 4:
                    double baseRomboide,
                     alturaRomboide;
                    System.out.println("Base: ");
                    baseRomboide = datos.nextDouble();
                    System.out.println("Altura: ");
                    alturaRomboide = datos.nextDouble();
                    Romboide romboide = new Romboide(baseRomboide, alturaRomboide);
                    System.out.println("\n" + romboide.mostrarDatos());
                    break; 
                case 5:
                    double Bmayor, Bmenor, alturaTrapecio, ladoTrapecio;
                    System.out.println("Base Mayor: ");
                    Bmayor = datos.nextDouble();
                    System.out.println("Base Menor: ");
                    Bmenor = datos.nextDouble();
                    System.out.println("Altura: ");
                    alturaTrapecio = datos.nextDouble();
                    System.out.println("Lado: ");
                    ladoTrapecio = datos.nextDouble();
                    Trapecio trapecio = new Trapecio(Bmayor, Bmenor, alturaTrapecio, ladoTrapecio);
                    System.out.println("\n" + trapecio.mostrarDatos());
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        } while (opcion != 6);
    }

}
