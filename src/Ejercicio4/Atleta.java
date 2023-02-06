package Ejercicio4;

/**
 *
 * @author Daniel
 */
public class Atleta {

    private int numeroAtleta;
    private String nombre;
    private double tiempo;

    public Atleta(int numeroAtleta, String nombre, double tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Atleta{" + " numeroAtleta = " + numeroAtleta + ", nombre = " + nombre + ", tiempo = " + tiempo + '}';
    }

    public double getTiempo() {
        return tiempo;
    }
}
