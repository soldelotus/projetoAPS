import java.util.List;

public class Expectador extends Usuario { 

    public Expectador(String nome, String email , Planos tipoPlano, List<Filme> filmesQueroAssistir, List<Filme> filmesBaixados, List<Visualizacao> historicoDeFilmes, Filme filmeFavoritado){
        super(nome, email, tipoPlano, filmesQueroAssistir, filmesBaixados, historicoDeFilmes, filmeFavoritado); 
    }
}
