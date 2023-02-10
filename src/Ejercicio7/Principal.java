/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuacion de 2do grado.
 * Tendremos los 3 coeficientes como atributos, llamemosles a, b y c.
 * Hay que insertar estos tres valores para construir el objeto.
 * Las operaciones que se podran hacer son las siguientes:
 * -getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene
 * la sig. formula, b2-4ac;
 * -tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto
 * ocurra, el discriminante debe ser mayor o igual que 0.
 * -tieneRaiz(): devuelve un booleano indicando si tiene una unica solucion, para que esto
 * ocurra, el discriminante debe ser igual que 0.
 * -calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuacion
 * en caso de no existir solucion, mostrarlo tambien.
 */
package Ejercicio7;

/**
 *
 * @author Daniel
 * @Github: Dan-raccoon-69
 */
public class Principal {

    public static void main(String[] args) {
        //2 raices
        //Raices ej1 = new Raices(5, 7, 2);
        Raices ej1 = new Raices(2, 9, 10);
        //Raices ej1 = new Raices(-10, 1, 11);

        // 1 raiz
        Raices ej2 = new Raices(-9, 12, -4);
        //Raices ej2 = new Raices(49, -70, 25);

        // sin solucion
        //Raices ej3 = new Raices(1, 2, 6);
        Raices ej3 = new Raices(3, -8, 6);

        System.out.println(ej1.mostrarSolucion());
        System.out.println(ej2.mostrarSolucion());
        System.out.println(ej3.mostrarSolucion());
    }
}
