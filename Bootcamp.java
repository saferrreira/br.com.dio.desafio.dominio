import java.time.LocalDate;
import java.util.HashSet;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial. plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    public Bootcamp() {
    }

    private LinkedHashSet conteuds = new LinkedHashSet();

    public String getNome(){
        return nome;
    }

     public void setNome(String nome) {
        this.nome = nome;
     }

     public String getDescricao(){
        return descricao;
    }

     public void setDescricao(String descricao) {
        this.descricao = descricao;
     }

    public LocalDate getDataInicial(){
        return dataInicial;
    }
    public Set<Dev> getDevsInscritos(){
        return devsInscritos;
    }
    public void setDevsInscritos (){
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

    
@Override
public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass()) return false;
    Dev dev =(Dev) o;
    return Objects.equals(nome, bootcamp, nome) && Objects.equals(descricao, bootcamp, descricao)  && Objects.equals(dataFinal, bootcamp, dataFinal) && Objects.equals(devsInscritos, bootcamp, devsInscritos) && Objects.equals(conteudos, bootcamp, conteudos);}
    
@Override
public int hashCode(){
    return Objects.hash(nome, descricao, dataInicial, dataFinal,devsInscritos, conteudos);
} 
}




