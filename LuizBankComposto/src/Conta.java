public class Conta {
    //dados da conta
    private double saldo;
    int agencia;
    int numeroConta;
    double limiteTotal = 100;
   double limiteAtual = 100;
    double total = this.saldo + this.limiteAtual;
    Cliente titular;                                ///referencia a um objeto cliente


    //metodo de depositar
    public void deposita(double valor) {
        this.saldo += valor;
        this.total = this.saldo + this.limiteAtual;

    }

    //metodo de sacar

    public boolean saca(double valor) {
        //metodo que permite sacar inclusive o limite
        if (this.total >= valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                this.total = this.saldo + this.limiteAtual;
            } else {
                this.saldo -= valor;
                this.limiteAtual += this.saldo;
                this.total = this.limiteAtual;

            }

            return true;

        } else {
            this.total = this.saldo + this.limiteAtual;
            System.out.println("Você não pode sacar este valor, sua conta tem R$ " + this.saldo +
                    " e o seu limite atual é R$ " + this.limiteAtual);
            return false;
        }

    }


    public boolean transfere(double valor, Conta destino) { //metodo que faz transferencia

        //metodo que tira o valor da conta que está transferindo e passa para a conta que está recebendo
        if (this.total >= valor) {
            this.saca(valor);
            destino.deposita(valor);

            return true;
        } else {
            System.out.println("Você não pode transferir este valor, sua conta tem R$ " + this.saldo +
                    " e o seu limite atual é R$ " + this.limiteAtual);
            return false;
        }




    }

    public double getSaldo(){
        return this.saldo;

    }

}

