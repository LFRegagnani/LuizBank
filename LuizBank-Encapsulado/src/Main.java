public class Main {
    public static void main(String[] args) {

        Conta contadoRafa = new Conta(1, 1);
        Cliente rafa = new Cliente("Rafael", "26367483", "puto");
        rafa.setNome("Cordeirão");
        System.out.println(rafa.getNome());

        contadoRafa.setTitular(rafa);

        System.out.println(contadoRafa.getTitular().getNome());
    }
}