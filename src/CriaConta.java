public class CriaConta {

    public static void main (String[]args){

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.00;
        primeiraConta.saldo += 100;



        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("O saldo da conta é " + primeiraConta.saldo);
        System.out.println("O saldo da conta é " + segundaConta.saldo);

        System.out.println(primeiraConta.titular);


        if(primeiraConta == segundaConta){
            System.out.println("são a mesma conta");

        }else {
            System.out.println("não são o mesmo");
        }

    }
}
