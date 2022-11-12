import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev {
private String nome;
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>() ;
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

public void inscreverBootcamp(Bootcamp bootcamp){
     this.conteudosInscritos.addAll(bootcamp.getConteudos());
     bootcamp.getDevsInscritos().add(this);
}

public void progredir(){
   Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
   if(conteudo.isPresent()){
    this.conteudosConcluidos.add(conteudo.get());
    this.conteudosInscritos.remove(conteudo.get());
   }else {
    System.err.println("Voce não está matriculado em nenhum dos nossos conteudos");

   }

}


public double calcularXp(){
    this.conteudosConcluidos
    stream().mapToDouble(conteudo -> conteudo.calcularXp())
    sum();
}


public int getNome(){
    return  nome;
}

public void setNome(String  nome) {
   this.nome = nome;
}
    
public Set<Conteudo> getConteudosInscritos(){
      return ConteudosInscritos;
}

public void setConteudosInscritos(){
    this.conteudosInscritos = conteudosInscritos;
}
    
public Set<Conteudo> getConteudosConcluidos(){
      return ConteudosConcluidos;
}

public void setConteudosConcluidos(){
    this.conteudosConcluidos = conteudosConcluidos;
}

@Override
public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass()) return false;
    Dev dev =(Dev) o;
    return Objects.equals(nome, dev, nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);}
    
@Override
public int hashCode(){
    return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
} 

}



