public class MaisUmTesteDeAutenticacao {

    public static void main(String[]args){

        Designer Clodovil = new Designer();
        EditorDeVideo Dunha = new EditorDeVideo();
        Gerente Luiz = new Gerente();
        Administrador Chefinho = new Administrador();
        Cliente PaulinhoLoko = new Cliente();


        SistemaInterno sist = new SistemaInterno();


    Luiz.setSenha(92892799);
    sist.autenticaSistema(Luiz);

    Chefinho.autentica(92892799);//não retorna nada pois a autenticação tem que ser chamada pelo sistema

    PaulinhoLoko.setSenha(9289);
    sist.autenticaSistema(PaulinhoLoko);



    }

}
