import java.util.ArrayList;
import java.util.List;

public class Portfolio {
        
    private String biografiaDoAutor; 
    private ArrayList <String> premiosGanhos; 
    private ArrayList<String> projetosProduzidos; 
    private Usuario usuario; 

    public Portfolio(String biografiaDoAutor, List <String> premiosGanhos, Usuario usuario, List <String> projetosProduzidos){
        this.biografiaDoAutor = biografiaDoAutor;
        premiosGanhos = new ArrayList<>(); 
        this.usuario = usuario; 
        projetosProduzidos = new ArrayList<>(); 

    }

    public String getBiografiaDoAutor(){
        return biografiaDoAutor;
    }

    public void setBiografiaDoAutor(String bioAutor){
        this.biografiaDoAutor = bioAutor; 
    }

    public ArrayList<String> getProjetosProduzidos(){
        return projetosProduzidos; 
    }

    public void setProjetosProduzidos(ArrayList<String> projetosProduzidos){
        this.projetosProduzidos = projetosProduzidos; 
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario; 
    }

    public ArrayList<String> getPremiosGanhos(){
        return premiosGanhos; 
    }

    public void setPremiosGanhos(ArrayList<String> premiosGanhos){
        this.premiosGanhos = premiosGanhos; 
    }

}
