public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoCodigo autentica;


    Administrador(){
        this.autentica = new AutenticacaoCodigo();
    }


    @Override
    public double getBonifica() {
        return this.getSalario()*2;
    }


    public boolean autentica(int senha) {
        return this.autentica.autentica(senha);
    }


    public void setSenha(int senha) {
        this.autentica.setSenha(senha);
    }
}
