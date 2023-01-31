package Ejercicio2;

/**
 *
 * @author Daniel
 */
public class Objeto {

    private int x;
    private int y;

    // Coordenadas exactas tecleadas por el usuario
    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Coordenadas por defecto (0,0)
    public Objeto() {
        this.x = 0;
        this.y = 0;
    }

    //Metodos
    public String moverArriba() {
        y++;
        return "\nDireccion: Arriba\n" + mostrarDatos();
    }

    public String moverAbajo() {
        y--;
        return "\nDireccion: Abajo\n" + mostrarDatos();
    }

    public String moverDerecha() {
        x++;
        return "\nDireccion: Derecha\n" + mostrarDatos();
    }

    public String moverIzquierda() {
        x--;
        return "\nDireccion: Izquierda\n" + mostrarDatos();
    }

    private String mostrarDatos() {
        return "Posicion: (" + this.x + "," + this.y + ")";
    }

}
