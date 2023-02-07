package Ejercicio5;

/**
 *
 * @author Daniel
 */
public class Triangulo {

    private double base;
    private double lado;
    private double altura;
    private double area = 0;
    private double perimetro = 0;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
        this.altura = Math.sqrt((Math.pow(lado, 2)) - (Math.pow(base / 2, 2)));
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public String toString() {
        return "Triangulo {" + " base = " + base + ", lado = " + lado + ", altura = " + altura
                + ", area = " + area + ", perimetro = " + perimetro + '}';
    }

    private void calcularArea() {
        area = (base * altura) / 2;
    }

    private void calcularPerimetro() {
        perimetro = (base + lado * 2);
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

}
