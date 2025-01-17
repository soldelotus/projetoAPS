import java.util.Date;

public class Planos {

    private String nome_Plano;
    private double preco;
    private Date dataInicioPlano;
    private Date dataTerminoPlano; 

    public Planos(String nome_plano, double preco, Date dataInicioPlano, Date dataTerminoPlano){
        this.nome_Plano =nome_plano;
        this.preco = preco;
        this.dataInicioPlano = dataInicioPlano;
        this.dataTerminoPlano = dataTerminoPlano;
    }

    public String getNome_Plano() {
        return nome_Plano;
    }
    public double getPreco(){
        return preco;
    }
    public Date getDataInicioPlano(){
        return dataInicioPlano;
    }
    public Date getDataTerminoPlano(){
        return dataTerminoPlano;
    }
    public void setNome_plano(String nome_Plano){
        this.nome_Plano = nome_Plano;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setDataInicioPlano(Date dataInicioPlano) {
        this.dataInicioPlano = dataInicioPlano;
    }
    public void setDataTerminoPlano(Date dataTerminoPlano) {
        this.dataTerminoPlano = dataTerminoPlano;
    }
}