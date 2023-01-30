package Ejercicio1;

/**
 *
 * @author Daniel
 */
public class Rombo implements Operaciones {

    private double Dmayor, Dmenor, lado;

    public Rombo(double Dmayor, double Dmenor, double lado) {
        this.Dmayor = Dmayor;
        this.Dmenor = Dmenor;
        this.lado = lado;
    }

    public Rombo() {
        this.Dmayor = 1.41;
        this.Dmenor = 1.41;
        this.lado = 1;
    }

    public double getArea() {
        return (Dmayor * Dmenor) / 2;
    }

    public double getPerimetro() {
        return lado * 4;
    }

    public String mostrarDatos() {
        return "Figura: Rombo\nValor de D.Mayor: " + Dmayor + "\nValor de D.Menor: " + Dmenor
                + "\nValor de Lado: + " + lado + " \nArea: " + getArea() + "\nPerimetro: " + getPerimetro();
    }
}
