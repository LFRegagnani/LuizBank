public class SistemaInterno {

    private int senhaCorreta = 92892799;



    public void autenticaSistema(Autenticavel funcionario){
    boolean autenticou = funcionario.autentica(this.senhaCorreta);

        if (autenticou){
            System.out.println("Bem vindo ao sistema!");

        }else{
            System.out.println("A senha do usuario não está correta");
        }
    }

        //GETTs e SETTs

    public int getSenhaCorreta(){
        return this.senhaCorreta;
    }

    public void setSenhaCorreta(int novaSenhaCorreta){
        this.senhaCorreta = novaSenhaCorreta;
    }

}
