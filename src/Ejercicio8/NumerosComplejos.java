package Ejercicio8;

/**
 *
 * @author Daniel
 */
public class NumerosComplejos {

    private int numReal1;
    private int numImaginario1;
    private int numReal2;
    private int numImaginario2;
    private int numEntero;
    private int resultadoReal;
    private int resultadoImaginario;

    // Constructores
    public NumerosComplejos(int numReal1, int numImaginario1, int numReal2, int numImaginario2) {
        this.numReal1 = numReal1;
        this.numImaginario1 = numImaginario1;
        this.numReal2 = numReal2;
        this.numImaginario2 = numImaginario2;
    }

    public NumerosComplejos(int numReal1, int numImaginario1, int numEntero) {
        this.numReal1 = numReal1;
        this.numImaginario1 = numImaginario1;
        this.numEntero = numEntero;
    }

    // Metodos del menu 
    public String sumar2NumComplejos() {
        resultadoReal = numReal1 + numReal2;
        resultadoImaginario = numImaginario1 + numImaginario2;
        mostrarDatos();
        return "Suma = " + "(" + resultadoReal + "," + resultadoImaginario + "i)\n";
    }

    public String multiplicar2NumComplejos() {
        resultadoReal = (numReal1 * numReal2) + (numImaginario1 * numImaginario2 * (-1));
        resultadoImaginario = (numReal1 * numImaginario2) + (numImaginario1 * numReal2);
        mostrarDatos();
        return "Multiplicacion = " + "(" + resultadoReal + "," + resultadoImaginario + "i)\n";
    }

    public boolean comparar2NumComplejos() {
        mostrarDatos();
        return (numReal1 == numReal2) && (numImaginario1 == numImaginario2);
    }

    public String multiplicarComplejoPorEntero() {
        resultadoReal = (numReal1 * numEntero);
        resultadoImaginario = (numImaginario1 * numEntero);
        System.out.println("\nComplejo1: (" + numReal1 + "," + numImaginario1 + "i)");
        System.out.println("Escalar: " + numEntero);
        return "Multiplicacion = " + "(" + resultadoReal + "," + resultadoImaginario + "i)\n";
    }

    // metodo que se ejecuta cada vez que se ejecute algun metodo del menu
    private void mostrarDatos() {
        System.out.println("\nComplejo1: (" + numReal1 + "," + numImaginario1 + "i)"
                + "\nComplejo2: (" + numReal2 + "," + numImaginario2 + "i)");
    }

    public static void mostrarMenu() {
        System.out.println("""
                           \n1. Sumar 2 numeros complejos 
                           2. Multiplicar 2 numeros complejos 
                           3. Comparar 2 numeros complejos (iguales o no) 
                           4. Multiplicar un numero complejo por un entero""");
    }

}
