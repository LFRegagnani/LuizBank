public class TestaGetESet {

    public static void main(String[]args){

     Conta contateste = new Conta(1,1);//cria o objeto conta
     contateste.setNumeroConta(1337);
     System.out.println(contateste.getNumeroConta());
     Cliente LuizFR = new Cliente("Luiz","40643281835","advogado"); //cria o objeto titular

     contateste.setTitular(LuizFR);//vincula o objeto Conta ao objeto titular

     System.out.println(contateste.getTitular().getNome());

    contateste.getTitular().setNome("Luiz Fernando Regagnani");

        System.out.println(contateste.getTitular().getNome());
        System.out.println(contateste.getAgencia());

        Cliente titularDaTeste = contateste.getTitular();

        if(LuizFR == titularDaTeste){
            System.out.println("São o mesmo");
        }

        LuizFR.setNome("EitaPreula");





    }
}
