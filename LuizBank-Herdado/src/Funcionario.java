public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;


public Funcionario(){

}



    public boolean autentica(int senha){//FUNCIONALIDADE DO GERENTE
        if(this.senha == senha){
        return false;
        }else{
        return false;
        }
    }
    public void setSenha(int senha) {// FUNCIONALIDADE DO GERENTE

    }


//GETS E SETTS

    public abstract double getBonifica();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}