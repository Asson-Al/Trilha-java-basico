package CondicionaisSimples;

public class SistemaSaque {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
    }
}
