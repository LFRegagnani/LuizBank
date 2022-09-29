public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){

        this.soma += f.getBonifica();
    }

    public double getSoma() {
        return this.soma;
    }




}
