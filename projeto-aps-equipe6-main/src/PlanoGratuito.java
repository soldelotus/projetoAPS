import java.util.Date;

public class PlanoGratuito extends Planos{
    public PlanoGratuito (String nome_plano, double preco, Date dataInicioPlano, Date dataTerminoPlano){
        super("Gratuito", 0, dataInicioPlano, dataTerminoPlano);
    }
}
