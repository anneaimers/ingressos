public class IngressoVip extends Ingresso{

    protected double adicionalVip;

    public IngressoVip(String nomeEvento, double valorBase, double adicionalVip) {
        super(nomeEvento, valorBase);
        this.adicionalVip = adicionalVip;
    }

    public double getAdicionalVip(){
        return adicionalVip;
    }

    @Override
    public double calcularValor() {
        return super.calcularValor() + adicionalVip;
    }

    

}
