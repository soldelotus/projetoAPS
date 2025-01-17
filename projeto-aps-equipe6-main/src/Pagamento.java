public class Pagamento {

    private boolean temPlano;
    private double preco;
    private String tipoPagamento;
    private Planos tipoPlano;

    public Pagamento(boolean temPlano, double preco, String tipoPagamento, Planos tipoPlano){
        this.temPlano = temPlano;
        this.preco = preco;
        this.tipoPagamento = tipoPagamento;
        this.tipoPlano = tipoPlano;
    }

    public double getPreco() {
        return preco;
    }
    public String getTipoPagamento() {
        return tipoPagamento;
    }
    public Planos getTipoPlano() {
        return tipoPlano;
    }
    public boolean getTemPlano(){
        return this.temPlano;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTemPlano(boolean temPlano) {
        this.temPlano = temPlano;
    }
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public void setTipoPlano(Planos tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}