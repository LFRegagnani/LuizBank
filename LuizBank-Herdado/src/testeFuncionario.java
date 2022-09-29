public class testeFuncionario {

    public static void main(String[]args){

        Funcionario ze = new Gerente();
        ze.setSalario(2000);
        //ze.salario = 5000;
        System.out.println(ze.getSalario());
        System.out.println(ze.getBonifica());

        Funcionario luiz = new Gerente();
        luiz.setSalario(5000);

        System.out.println(luiz.getBonifica());
        System.out.println(ze.getBonifica());

        luiz.setSenha(92);
        luiz.autentica(92);

    }

}
