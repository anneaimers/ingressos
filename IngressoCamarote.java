public class IngressoCamarote extends Ingresso{

    protected double valorReserva;

    public IngressoCamarote(String nomeEvento, double valorBase, double valorReserva) {
        super(nomeEvento, valorBase);
        this.valorReserva = valorReserva;
    }

    public double getValorReserva(){
        return valorReserva;
    }

    @Override
    public double calcularValor() {
        return super.calcularValor() + valorReserva;
    }

    

}
