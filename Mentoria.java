import java.time.LocalDate;

public class Mentoria extends Conteudo {
     private String titulo;
     private String descricao;
     private LocalDate data;

     @Override
     public double calcularXp(){
        return 0;
     }

     public Mentoria() {
     }

    
   
public LocalDate getData(){
    return data;
}

public void setData(LocalDate data) {
    this.data = data;
}

@Override
public String toString(){
    return "Curso{" +
           "titulo='"+ getTitulo() + '\'' + 
           ", descricao= '" + getDescricao() + '\'' +
           ", data=" + data +
           '}';
}

    
}


