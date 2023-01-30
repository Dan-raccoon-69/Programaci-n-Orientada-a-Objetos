package Ejercicio1;

/**
 *
 * @author Daniel
 */
public class Romboide extends Rectangulo {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    public Romboide() {
        super();
    }

    public String mostrarDatos() {
        return "Figura: Romboide\nValor de Base: " + base + "\nValor de Altura: " + altura
                + "\nArea: " + getArea() + "\nPerimetro: " + getPerimetro();
    }
}
