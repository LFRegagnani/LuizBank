public class TestaGerente {

    public static void main (String[]args){





     Gerente luiz = new Gerente();
     Funcionario ze = new Gerente();
     ze.setSalario(2000);
     luiz.setSalario(4000);
     //luiz.salario = 7000;
     System.out.println(luiz.getSalario());

     luiz.setSenha(92892799);

     luiz.autentica(92892799);

        System.out.println(luiz.getBonifica());


    }
}
