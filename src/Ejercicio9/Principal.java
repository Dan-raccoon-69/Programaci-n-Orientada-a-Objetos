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
        int numCuenta, x, opcion, numCuentaSeleccionado, opcion2;
        double saldo, saldoIngresado, saldoaRetirar;
        String tamanioCuenta, nombre, apellido, DNI;

        // Datos cliente
        Cliente cliente1 = new Cliente("Armando", "Sanchez", "PUJE45786QFTBTLQ4");

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

        do {
            numCuentaSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta que desea manupular"
                    + "\n6 digitos"));

            int indice = elegirCuenta(cuentas, numCuentaSeleccionado);
            if (indice == -1) {
                System.out.println("Numero de cuenta no encontrado\nVerifique su numero de cuenta.");
            } else {
                do {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Consultar Datos\n2. Ingresar Saldo\n3. Retirar Saldo"
                            + "\n4. Salir\nSelecciona la opcion deseada:"));
                    switch (opcion) {
                        case 1 ->
                            System.out.println("\nDatos cliente:"
                                    + "\n" + cliente1.mostrarDatosCliente()
                                    + "\nDatos Cuenta:" + cuentas[indice].mostrarDatosCuenta());
                        case 2 -> {
                            do {
                                saldoIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Saldo: \nMonto minimo: $100"));
                            } while (saldoIngresado <= 99);
                            cuentas[indice].ingresarSaldo(saldoIngresado);
                        }
                        case 3 -> {
                            do {
                                saldoaRetirar = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar: "));
                            } while (saldoaRetirar <= 99);
                            cuentas[indice].retirarSaldo(saldoaRetirar);
                        }
                    }
                } while (opcion != 4);
            }
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Salir: \nSi: 0 \nNo: 1"));
        } while (opcion2 == 1);

    }

    public static int elegirCuenta(Cuenta cuentas[], int numCuenta) {
        int indice = -1;
        for (int i = 0; i < cuentas.length; i++) {
            if (numCuenta == cuentas[i].getNumeroCuenta()) {
                indice = i;
                break;
            }
        }
        return indice;
    }
}
