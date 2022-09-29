public class Gerente extends Funcionario {

    private int senha;

    public Gerente(){

    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Autenticado, bem vindo senhor Gerente.");
            return true;
        }else{
            System.out.println("Senha incorreta!");
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonifica(){
        return super.getSalario();
    }



}