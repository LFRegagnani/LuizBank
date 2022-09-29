public class TestaBanco {
    public static void main(String[] args) {

        Cliente luizFR = new Cliente();

        luizFR.nome = "Luiz Fernando Regagnani";
        luizFR.cpf = "40643281835";
        luizFR.profissao = "Advogado";

        Conta contaDoLuizFR = new Conta();

        contaDoLuizFR.titular = luizFR;


        System.out.println(contaDoLuizFR.titular.cpf);


        Conta contaDoEliel = new Conta();
        contaDoEliel.titular = new Cliente();
        contaDoEliel.deposita( 500);
        System.out.println("depositado 500 pro eliel " +contaDoEliel.getSaldo());
        System.out.println("Saldo com limite do eliel " + contaDoEliel.total);
        System.out.println("Saldo com limite do luiz " + contaDoLuizFR.total + " disso o dinheiro em conta é " +
                contaDoLuizFR.getSaldo() + " e limite é " + contaDoLuizFR.limiteAtual);

        contaDoEliel.transfere(541,contaDoLuizFR);


        System.out.println("apos a primeira transf saldo do luiz " + contaDoLuizFR.getSaldo() + " disso o dinheiro em conta é " +
                contaDoLuizFR.getSaldo() + " e limite é " + contaDoLuizFR.limiteAtual + " sendo o total " + contaDoLuizFR.total);
        System.out.println("apos a primeira transf saldo do eliel " + contaDoEliel.getSaldo() + " disso o dinheiro em conta é " +
                contaDoEliel.getSaldo() + " e limite é " + contaDoEliel.limiteAtual+ " sendo o total " + contaDoEliel.total);

        System.out.println("Agora o Eliel tentará transferir mais 51 reais para o luiz");
        System.out.println("neste momento o total de Eliel é "+ contaDoEliel.total);
        contaDoEliel.transfere(53,contaDoLuizFR);
        System.out.println("neste momento o total de Eliel é "+ contaDoEliel.total);

        System.out.println("Saldo do luiz apos eliel tentar transferir mais q o limite é " + contaDoLuizFR.getSaldo());
        System.out.println("saldo final do eliel " + contaDoEliel.getSaldo());
        System.out.println("limite final eliel " + contaDoEliel.limiteAtual);








    }
}