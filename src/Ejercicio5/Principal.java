/**
 * Diseñar un programa para trabajar con triangulos isósceles.
 * Para ello defina los atributos necesarios que se requieren,
 * proporcione metodos de consulta,
 * un metodo constructor,
 * metodos para calcular el perimetro y area de un triangulo,
 * ademas implementar un metodo que a partir de un arreglo
 * de triangulos devuelva el area del triangulo de mayor superficie.
 *
 */
package Ejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 * @Github: Dan-raccoon-69
 */
public class Principal {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        int cantidadTriangulos;
        double base;
        double lado;

        // inicializando arreglo - cantidad de triangulos
        cantidadTriangulos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos triangulos deseas almacenar"));
        Triangulo tri[] = new Triangulo[cantidadTriangulos];

        // pidiendo datos de cada triangulo
        for (int i = 0; i < tri.length; i++) {
            JOptionPane.showMessageDialog(null, "Triangulo: " + (i + 1));
            base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base"));
            lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado"));
            tri[i] = new Triangulo(base, lado);
        }

        // mostrando todos los triangulos
        System.out.println("\nTriangulos: ");
        for (Triangulo eachTriangulo : tri) {
            System.out.println(eachTriangulo.toString());
        }

        // mostrando triangulo de mayor superficie
        System.out.println("\nTriangulo con mayor superficie: ");
        System.out.println(areaIndiceMayor(tri));

    }

    // metodo que a partir de un arreglo de triangulos devuelva el area del triangulo de mayor superficie
    public static String areaIndiceMayor(Triangulo tri[]) {
        double area = tri[0].getArea();
        int indice = 0;
        for (int i = 1; i < tri.length; i++) {
            if (tri[i].getArea() > area) {
                area = tri[i].getArea();
                indice = i;
            }
        }
        return tri[indice].toString();
    }
}
