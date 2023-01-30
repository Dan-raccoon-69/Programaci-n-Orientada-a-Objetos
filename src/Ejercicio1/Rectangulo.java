package Ejercicio1;

/**
 *
 * @author Daniel
 */
public class Rectangulo implements Operaciones {

    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public String mostrarDatos() {
        return "Figura: Rectangulo\nValor de Base: " + base + "\nValor de Altura: " + altura
                + "\nArea: " + getArea() + "\nPerimetro: " + getPerimetro();
    }
}
