/**
 * Hacer un programa sencillo para realizar gestiones en un banco para lo cual tendremos
 * 2 clases (Cliente y Cuenta). Considerar que un cliente se caracteriza por su nombre,
 * apellido y DNI.
 * El cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas.
 * Ademas cada cuenta se caracteriza por un numero de cuenta y un saldo.
 */
package Ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 * @Github: Dan-raccoon-69
 */
public class Principal {

    public static void main(String[] args) {
        int numCuenta, x, opcion;
        double saldo, saldoIngresado, saldoaRetirar;
        String tamanioCuenta;

        // Inicializando X numero de cuentas segun el usuario
        x = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas cuentas deseas tener?"));
        Cuenta cuentas[] = new Cuenta[x];

        // inicializando la cuenta, saldo y numCuenta
        for (int i = 0; i < cuentas.length; i++) {
            do {
                tamanioCuenta = JOptionPane.showInputDialog("Ingresa Num de cuenta: \nDebe de contener 6 numeros");
            } while (tamanioCuenta.length() != 6);
            numCuenta = Integer.parseInt(tamanioCuenta);
            do {
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Saldo Inicial: \nMonto minimo: $100"));
            } while (saldo <= 99);
            cuentas[i] = new Cuenta(numCuenta, saldo);
        }

        //
        
        Cliente cliente1 = new Cliente("Daniel", "De La Cruz", "CUBD037896KLRPTQG0");

        // Menu de acciones
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Consultar Saldo\n2. Ingresar Saldo\n3. Retirar Saldo"
                    + "\n4. Salir\nSelecciona la opcion deseada:"));
            switch (opcion) {
                case 1 -> System.out.println("Saldo Actual: " + cuentas[0].consultarSaldo());
                case 2 -> {
                    do {
                        saldoIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Saldo: \nMonto minimo: $100"));
                    } while (saldoIngresado <= 99);
                    cuentas[0].ingresarSaldo(saldoIngresado);
                }
                case 3 -> {
                    do {
                        saldoaRetirar = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar: "));
                    } while (saldoaRetirar <= 99);
                    cuentas[0].retirarSaldo(saldoaRetirar);
                }
                default -> System.out.println("Opcion erronea");
            }
        } while (opcion != 4);

    }
}
