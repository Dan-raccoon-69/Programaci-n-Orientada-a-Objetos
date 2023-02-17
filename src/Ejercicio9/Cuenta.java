package Ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Cuenta {

    private int numeroCuenta;
    private double saldo;

    // constructor que inicializa el saldo y numCuenta.
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarSaldo(double saldoIngresar) {
        saldo += saldoIngresar;
        System.out.println("Accion Realizada con exito!\nHaz ingresado $" + saldoIngresar + " a tu cuenta.");
    }

    public void retirarSaldo(double saldoRetirar) {
        while (saldoRetirar > saldo) {
            if (saldoRetirar > saldo) {
                JOptionPane.showMessageDialog(null, "No cuentas con el suficiente dinero a retirar."
                        + "\nCuentas con: $" + consultarSaldo());
            }
            saldoRetirar = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar:"));
        }
        saldo -= saldoRetirar;
        System.out.println("Accion Realizada con exito!\nRetiraste $" + saldoRetirar);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String mostrarDatosCuenta() {
        return "Numero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo;
    }

}
