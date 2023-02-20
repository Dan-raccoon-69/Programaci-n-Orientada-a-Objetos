package Ejercicio10;

/**
 *
 * @author Daniel
 */
public class Paquete {

    private int numeroReferencia;
    private String DNI;
    private double precioPaquete;

    public Paquete(int numeroReferencia, String DNI, double precioPaquete) {
        this.numeroReferencia = numeroReferencia;
        this.DNI = DNI;
        this.precioPaquete = precioPaquete;
    }

    public double getPrecioPaquete() {
        return precioPaquete;
    }

    public String mostrarDatosPaquete() {
        return "\n---Datos Paquete: \nNumeroReferencia: " + numeroReferencia
                + "\nDNI: " + DNI;
    }

}
