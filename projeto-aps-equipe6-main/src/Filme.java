import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nomeDoFilme;
    private String autor;
    private String duracao;
    private double notaAvaliacao;
    private String sinopse;
    private ArrayList<Categoria> categoria;
    private Usuario usuario;
    private Visualizacao visualizacao;
   
    public Filme() {
        this.categoria = new ArrayList<>();
    }

    
    public Filme(String nomeDoFilme, String autor, String duracao, double notaAvaliacao,
                  String sinopse, ArrayList<Categoria> categoria, Usuario usuario, Visualizacao visualizacao) {
        this.nomeDoFilme = nomeDoFilme;
        this.autor = autor;
        this.duracao = duracao;
        this.notaAvaliacao = notaAvaliacao;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.usuario = usuario;
        this.visualizacao = visualizacao;
    }

    
    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Visualizacao getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(Visualizacao visualizacao) {
        this.visualizacao = visualizacao;
    }
}
