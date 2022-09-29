public class Designer extends Funcionario{


    public double getBonifica(){
        System.out.println("Pegando a bonificação do designer");
        return this.getSalario() +200;
    }

}
