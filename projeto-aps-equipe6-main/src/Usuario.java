import java.util.List;
import java.util.ArrayList;
public class Usuario {
    
    private String nome; 
    private String email; 
    private Planos tipoPlano; 
    private List<Filme> filmesQueroAssistir; 
    private List<Filme> filmesBaixados; 
    private List<Visualizacao> historicoDeFilmes;
    private Filme filmeFavoritado;  

    public Usuario(String nome, String email , Planos tipoPlano, List<Filme> filmesQueroAssistir, List<Filme> filmesBaixados, List<Visualizacao> historicoDeFilmes, Filme filmeFavoritado){
        this.nome = nome;
        this.email = email; 
        this.tipoPlano = tipoPlano; 
        filmesQueroAssistir = new ArrayList<>(); 
        filmesBaixados = new ArrayList<>(); 
        historicoDeFilmes = new ArrayList<>();
        this.filmeFavoritado = filmeFavoritado; 
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getNome(){
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

     
    public void setTipoPlano(Planos tipoPlano) {
        this.tipoPlano = tipoPlano; 
    }

    public Planos getTipoPlano() {
        return tipoPlano;
    }

    public List<Filme> getFilmesQueroAssistir(){
        return filmesQueroAssistir; 
    }

    public void setFilmesQueroAssistir(ArrayList<Filme> filmesQueroAssistir){
        this.filmesQueroAssistir = filmesQueroAssistir; 
    }

    public List<Filme> getFilmesBaixados(){
        return filmesBaixados; 
    }

    public void setFilmesBaixados(ArrayList<Filme> filmesBaixados){
        this.filmesBaixados = filmesBaixados; 
    }

    public List<Visualizacao> getHistoricoDeFilmes(){
        return historicoDeFilmes; 
    }

    public void setHistoricoDeFilmes(ArrayList<Visualizacao> historicoDeFilmes){
        this.historicoDeFilmes = historicoDeFilmes; 
    }

    public void setFilmeFavoritado(Filme filmeFavoritado) {
        this.filmeFavoritado = filmeFavoritado; 
    }

    public Filme getFilmeFavoritado() {
        return filmeFavoritado;
    }


    
}

    


     

