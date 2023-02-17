package Ejercicio9;

import Ejercicio9.Cuenta;

/**
 *
 * @author Daniel
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;

    public Cliente(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String mostrarDatosCliente() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + DNI;
    }

}
