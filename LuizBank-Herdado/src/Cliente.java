public class Cliente implements Autenticavel{

    private AutenticacaoCodigo autentica;


    Cliente(){
        this.autentica = new AutenticacaoCodigo();
    }


    public boolean autentica(int senha) {
        return this.autentica.autentica(senha);
    }


    public void setSenha(int senha) {
        this.autentica.setSenha(senha);
    }
}
