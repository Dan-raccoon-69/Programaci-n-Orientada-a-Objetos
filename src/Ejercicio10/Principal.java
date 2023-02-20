/**
 * Una empresa de envio de paquetes tiene varias sucursales en todo el pais.
 * Cada sucursal esta definido por su numero de sucursal, direccion y ciudad.
 * Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen
 * en cuenta el precio del paquete y la prioridad, sabiendo que se cobra
 * un dolar por kilo, 10 dolares mas si la prioridad es alta y 20 si es express.
 * Cada paquete enviado tendra un numero de referencia y el DNI de la persona
 * que lo envia.
 */
package Ejercicio10;

/**
 *
 * @author Daniel
 */
public class Principal {

    public static void main(String[] args) {
        double precioEnvio;
        int nPaquetes = 5;

        Paquete paquetes[] = new Paquete[nPaquetes];
        Sucursal sucursales[] = new Sucursal[5];

        paquetes[0] = new Paquete(1, "AYNQ57328KQHCOLE3", 200);
        paquetes[1] = new Paquete(2, "WEND4LP521EMDFJO4", 500);
        paquetes[2] = new Paquete(3, "DINBAYW4189D1VB78", 700);
        paquetes[3] = new Paquete(4, "AQMFIA45722ADJQIA", 300);
        paquetes[4] = new Paquete(5, "NDUCOW284E2S89QNE", 1000);

        sucursales[0] = new Sucursal(5, "Benito Juarez", "CDMX", paquetes);
        System.out.println("\n" + paquetes[0].mostrarDatosPaquete() + sucursales[0].calcularPrecioEnvio(0, 5.0, 2) + 
                sucursales[0].mostrarDatosSucursal());
        sucursales[1] = new Sucursal(4, "Felipe Alvarez", "CDMX", paquetes);
        System.out.println("\n" + paquetes[1].mostrarDatosPaquete() + sucursales[1].calcularPrecioEnvio(2, 10, 1) + 
                sucursales[1].mostrarDatosSucursal());
        
    }
}
