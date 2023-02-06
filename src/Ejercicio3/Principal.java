/**
 * Construir un programa que dada una serie de vehiculos caracterizados
 * por su marca, modelo y precio, imprima las propiedades del vehiculo
 * mas barato. Para ello, se deberan leer por teclado las caracteristicas
 * de cada vehiculo y crear una clase que represente a cada uno de ellos.
 *
 */
package Ejercicio3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 * @Github: Dan_raccoon_69
 */
public class Principal {

    public static void main(String[] args) {

        int cantidadCarros, opcion;
        String marca, modelo;
        double precio;
        Scanner datos = new Scanner(System.in);

        // inicializando el tamaño del arreglo - cantidad de vehiculos
        cantidadCarros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de vehiculos a guardar: "));
        Vehiculo veh[] = new Vehiculo[cantidadCarros];

        // pidiendo datos
        for (int i = 0; i < veh.length; i++) {
            JOptionPane.showMessageDialog(null, "Vehiculo: " + (i + 1));
            marca = JOptionPane.showInputDialog("Ingresa la Marca");
            modelo = JOptionPane.showInputDialog("Ingresa el modelo");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio"));
            veh[i] = new Vehiculo(marca, precio, modelo);
        }

        // mostrando todos los vehiculos
        System.out.println("\nVehiculos: ");
        for (Vehiculo eachVehiculo : veh) {
            System.out.println(eachVehiculo.toString());
        }

        // encontrando el indice del vehiculo mas barato
        int indice = 0;
        System.out.println("\nVehiculo mas barato: ");
        double precio2 = veh[0].getPrecio();
        for (int i = 0; i < veh.length - 1; i++) {
            if (precio2 > veh[i + 1].getPrecio()) {
                indice = i + 1;
                precio2 = veh[i + 1].getPrecio();
            }
        }

        // mostrando el vehiculo mas barato
        System.out.println(veh[indice].toString());

    }
}
