public class App {
    public static void main(String[] args) throws Exception {

    Ingresso comum = new Ingresso("The eras tour", 50);
    IngressoVip vip= new IngressoVip("Lover", 50, 30);
    IngressoCamarote camarote = new IngressoCamarote("Reputation", 50, 40);

    System.out.println(comum.calcularValor());
    System.out.println(vip.calcularValor());
    System.out.println(camarote.calcularValor());
    






    }
}
