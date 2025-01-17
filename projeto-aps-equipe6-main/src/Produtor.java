import java.util.List;

public class Produtor extends Usuario {
    
    private Portfolio portfolio; 

    public Produtor(String nome, String email , Planos tipoPlano, List<Filme> filmesQueroAssistir, List<Filme> filmesBaixados, List<Visualizacao> historicoDeFilmes, Filme filmeFavoritado, Portfolio portfolio){
        super(nome, email, tipoPlano, filmesQueroAssistir, filmesBaixados, historicoDeFilmes, filmeFavoritado); 
        this.portfolio = portfolio;  
    }

    
    public Portfolio getPortfolio(){
        return portfolio; 
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio; 
    }
    


}
