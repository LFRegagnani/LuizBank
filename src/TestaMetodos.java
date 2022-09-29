public class TestaMetodos {

    public static void main (String[]args){

        Conta contaTeste = new Conta();

        System.out.println(contaTeste.saldo);

        contaTeste.deposita(300);

        System.out.println(contaTeste.saldo);

        contaTeste.saca(250);

        System.out.println(contaTeste.saldo);

        Conta contaTeste2 = new Conta();

        contaTeste2.deposita(200);

        contaTeste2.transfere(200,contaTeste);

        System.out.println("Saldo da primeira conta " + contaTeste.saldo);
        System.out.println("Saldo da segunda conta " + contaTeste2.saldo);

    }
}
