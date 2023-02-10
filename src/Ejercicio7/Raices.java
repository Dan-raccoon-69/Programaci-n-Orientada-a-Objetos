package Ejercicio7;

/**
 *
 * @author Daniel
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminante() {
        return (Math.pow(b, 2)) - (4 * a * c);
    }

    private boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    private boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    private String calcular() {
        double x1, x0;
        if (tieneRaices()) {
            x0 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            x1 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            return "x0 = " + x0 + ", x1 = " + x1;
        } else if (tieneRaiz()) {
            x0 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            return "x0 = " + x0;
        } else if (getDiscriminante() < 0) {
            return "No hay solucion a esta ecuacion";
        }
        return null;
    }

    // Adicionalmente opte por crear un metodo en donde retorne todos los datos
    public String mostrarSolucion() {
        return "\nDiscriminante: " + getDiscriminante()
                + "\nTiene Raices: " + tieneRaices()
                + "\nTiene Raiz: " + tieneRaiz()
                + "\nSolucion: " + calcular();
    }

}
