/**
 * Construir un programa una competencia de atletismo, el programa
 * debe gestionar una serie de atletas caracterizados por su:
 * numero de atleta, nombre y tiempo de carrera, al final el
 * programa debe mostrar los datos del atleta ganador de la carrera.
 *
 */
package Ejercicio4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 * @Github: Dan_raccoon_69
 */
public class Principal {

    public static void main(String[] args) {
        int cantidadAtletas, numeroAtleta;
        String nombre;
        double tiempo;
        Scanner datos = new Scanner(System.in);

        // inicializando el tamaño del arreglo - cantidad de atletas
        cantidadAtletas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de atletas a competir: "));
        Atleta atle[] = new Atleta[cantidadAtletas];

        // pidiendo datos
        for (int i = 0; i < atle.length; i++) {
            JOptionPane.showMessageDialog(null, "Atleta: " + (i + 1));
            numeroAtleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del atleta"));
            nombre = JOptionPane.showInputDialog("Ingresa el nombre del atleta");
            tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el tiempo"));
            atle[i] = new Atleta(numeroAtleta, nombre, tiempo);
        }

        // mostrando todos los vehiculos
        System.out.println("\nAtletas: ");
        for (Atleta eachAtleta : atle) {
            System.out.println(eachAtleta.toString());
        }

        // mostrando el atleta ganador: 
        int atletaGanador = indice(atle);
        System.out.println("\nAtleta ganador: ");
        System.out.println(atle[atletaGanador].toString());

    }

    // metodo que retorna el indice del atleta ganador
    public static int indice(Atleta atle[]) {
        int atletaGanador = 0;
        double tiempo = atle[0].getTiempo();
        for (int i = 0; i < atle.length - 1; i++) {
            if (tiempo > atle[i + 1].getTiempo()) {
                atletaGanador = i + 1;
                tiempo = atle[i + 1].getTiempo();
            }
        }
        return atletaGanador;
    }

}
