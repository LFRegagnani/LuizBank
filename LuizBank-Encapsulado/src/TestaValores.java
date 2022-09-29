public class TestaValores {

 public static void main(String[] args) {

  Conta contaTeste = new Conta(1, 1);
  Cliente luiz = new Cliente("Luiz Fernando Regagnani", "40643281835", "Advogado");
  contaTeste.setTitular(luiz);
  contaTeste.setNumeroConta(-333);
  contaTeste.setLimiteDaConta(1000);
  System.out.println(contaTeste.getSaldo() + " " + contaTeste.getLimiteDaConta());
  contaTeste.saca(500);
  System.out.println(contaTeste.getSaldo() + " " + contaTeste.getLimiteDaConta());
  contaTeste.deposita(1000);
  System.out.println(contaTeste.getSaldo() + " " + contaTeste.getLimiteDaConta());
  Conta contateste2 = new Conta(1, 1);


  if (contateste2 == contaTeste) {
   System.out.println("São sim iguaiszinhas");
  } else {
   System.out.println("NOUUU");

  }
 }
}