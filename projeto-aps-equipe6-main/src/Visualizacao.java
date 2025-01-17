import java.time.LocalDateTime;
public class Visualizacao{
   private LocalDateTime dataHora;
   private Filme filme;
   private Usuario usuario;


  public Visualizacao(LocalDateTime dataHora, Filme filme, Usuario usuario){
    this.dataHora = dataHora;
    this.filme = filme;
    this.usuario = usuario;
  }

  public LocalDateTime getDataHora(){
    return dataHora;
  }

  public void setLocalDateTime (LocalDateTime dataHora){
    this.dataHora = dataHora;
  }
  
  public Filme getFilme(){
    return filme;
  }

   public void setFilme (Filme filme){
    this.filme = filme;
  }

  public Usuario getUsuario(){
    return usuario;
  }

   public void setUsuario(Usuario usuario){
    this.usuario = usuario;
  }
}