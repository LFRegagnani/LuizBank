public class TesteSacaNegativo {

    public static void main(String[]args){

    Conta conta1 = new Conta();
    conta1.deposita(50);
    conta1.saca(100);
    System.out.println(conta1.getSaldo());
    conta1.deposita(101);
    System.out.println(conta1.getSaldo());

    }
}
