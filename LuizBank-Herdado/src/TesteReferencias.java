public class TesteReferencias {

    public static void main(String[]args){

    Gerente g1 = new Gerente();
    g1.setNome("Luiz");
    g1.setSalario(4000);
    System.out.println(g1.getNome());

    Funcionario d2 = new Designer();
    d2.setSalario(2000);

    Funcionario e2 = new EditorDeVideo();
    e2.setSalario(2000);

    EditorDeVideo e1 = new EditorDeVideo();
    e1.setSalario(3000);

    Designer d1 = new Designer();
    d1.setSalario(3500);

ControleBonificacao controle = new ControleBonificacao();
    controle.registra(g1);
    controle.registra(d2);
    controle.registra(e2);
    controle.registra(e1);
    controle.registra(d1);

    System.out.println(controle.getSoma());


    }
}
