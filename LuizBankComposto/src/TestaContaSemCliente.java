public class TestaContaSemCliente {

    public static void main(String[]args){

        Conta contaDoEliel = new Conta();

        System.out.println(contaDoEliel.titular);

        contaDoEliel.titular = new Cliente();

        contaDoEliel.titular.profissao = "Doidão";

        System.out.println(contaDoEliel.titular.profissao);



    }
}
