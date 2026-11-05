public class Ingresso {

    private String nomeEvento;
    protected double valorBase;

    public Ingresso(String nomeEvento, double valorBase) {
        this.nomeEvento = nomeEvento;
        this.valorBase = valorBase;
    }

    public String getNomeevento(){
        return nomeEvento;
    }
    
    public double getValorBase(){
        return valorBase;
    }

    public double calcularValor(){
        return valorBase + 10;
    }

}
