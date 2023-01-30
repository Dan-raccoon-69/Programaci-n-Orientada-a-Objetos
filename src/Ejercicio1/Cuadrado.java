package Ejercicio1;

/**
 *
 * @author Daniel
 */
public class Cuadrado implements Operaciones {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //valor por defecto del lado = 1
    public Cuadrado() {
        this.lado = 1;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return lado * 4;
    }

    public String mostrarDatos() {
        return "Figura: Cuadrado\nValor de Lados: " + lado + "\nArea: " + getArea() + "\nPerimetro: " + getPerimetro();
    }

}
