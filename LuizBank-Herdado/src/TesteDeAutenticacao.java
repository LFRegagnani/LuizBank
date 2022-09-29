public class TesteDeAutenticacao {

    public static void main(String[]args){

        Gerente luiz = new Gerente();
        SistemaInterno sistema = new SistemaInterno();
        luiz.setSenha(92892799);

        sistema.autenticaSistema(luiz);

        Administrador dunha = new Administrador();
        dunha.setSenha(92892799);
        sistema.autenticaSistema(dunha);

        Cliente paulinhoLoko = new Cliente();
        sistema.autenticaSistema(paulinhoLoko);







    }
}
