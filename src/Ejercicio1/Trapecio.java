package Ejercicio1;

/**
 *
 * @author Daniel
 */
public class Trapecio implements Operaciones {

    private double Bmayor, Bmenor, altura, lado;

    public Trapecio(double Bmayor, double Bmenor, double altura, double lado) {
        this.Bmayor = Bmayor;
        this.Bmenor = Bmenor;
        this.altura = altura;
        this.lado = lado;
    }

    public Trapecio() {
        this.Bmayor = 1.41;
        this.Bmenor = 1.41;
        this.altura = 1;
        this.lado = lado;
    }

    public double getArea() {
        return ((Bmayor + Bmenor) / 2) * altura;
    }

    public double getPerimetro() {
        return Bmayor + Bmenor + (lado * 2);
    }

    public String mostrarDatos() {
        return "Figura: Trapecio\nValor de  B.Mayor: " + Bmayor + "\nValor de B.Menor: " + Bmenor
                + "\nValor de Lado: + " + lado + "\nvalor de altura: " + altura + " \nArea: " + getArea() + "\nPerimetro: " + getPerimetro();
    }
}
