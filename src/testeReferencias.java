public class testeReferencias {

    public static void main(String[]args){

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 301;

    System.out.println("o saldo da primeira conta é " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        primeiraConta.saldo += 102;

        System.out.println("o saldo da segunda conta é " + segundaConta.saldo);
        System.out.println("o saldo da primeira conta dnv é " + primeiraConta.saldo);


        if(primeiraConta == segundaConta){
            System.out.println("são a mesma conta");

        }

    }

}
