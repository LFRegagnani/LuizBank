public class Conta {

    double saldo;
    int agencia;
    int numeroConta;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {

            this.saldo -= valor;
            return true;

        } else {
            System.out.println("Sua conta não tem esse valor para sacar");
            return false;
        }
    }


    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("fundos insuficientes para realizar esta transferencia");
            return false;
        }

    }
}