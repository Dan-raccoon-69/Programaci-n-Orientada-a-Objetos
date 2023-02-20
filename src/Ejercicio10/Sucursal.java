package Ejercicio10;

/**
 *
 * @author Daniel
 */
public class Sucursal {

    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    Paquete paquetes[];

    public Sucursal(int numeroSucursal, String direccion, String ciudad, Paquete[] paquetes) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquetes = paquetes;
    }

    public String calcularPrecioEnvio(int x, double peso, int prioridad) {
        double precio, montoPrioridad = 0, precioProducto;
        String datos;
        precio = paquetes[x].getPrecioPaquete();
        precioProducto = precio;
        if (prioridad == 0) {
            // prioridad alta
            montoPrioridad = 10;
            prioridad = 10;
            precio += prioridad;
        } else if (prioridad == 1) {
            montoPrioridad = 20;
            prioridad = 20;
            // prioridad express
            precio += prioridad;
        }
        precio += peso;
        return "\nPrecio Producto: $" + precioProducto +"\nPrecio peso: $" + peso + "\nPrioridad : $" + montoPrioridad + "\nPrecio Total: $" + precio;
    }

    public String mostrarDatosSucursal() {
        return "\n---Datos Sucursal: \nNumeroSucursal: " + numeroSucursal
                + "\nDireccion: " + direccion + "\nCiudad: " + ciudad;
    }

}
