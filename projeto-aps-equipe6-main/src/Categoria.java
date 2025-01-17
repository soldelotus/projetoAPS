import java.util.ArrayList;

public class Categoria {
    private String nome;
    private String descricao;
    private ArrayList<Filme> listaDeFilmes;

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.listaDeFilmes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Filme> getListaDeFilmes() {
        return listaDeFilmes;
    }

    public void setListaDeFilmes(ArrayList<Filme> listaDeFilmes) {
        this.listaDeFilmes = listaDeFilmes;
    }
}
