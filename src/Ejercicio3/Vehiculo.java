package Ejercicio3;

/**
 *
 * @author Daniel
 */
public class Vehiculo {

    private String marca;
    private double precio;
    private String modelo;

    public Vehiculo(String marca, double precio, String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo {" + " marca = " + marca + ", precio = " + precio + ", modelo = " + modelo + '}';
    }

    public double getPrecio() {
        return precio;
    }

}
