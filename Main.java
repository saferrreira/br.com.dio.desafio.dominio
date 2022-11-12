import java.time.LocalDate;

public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(4);
        
       
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSabrina = new Dev();
        devSabrina.setNome("Sabrina");
        devSabrina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Sabrina:" + devSabrina.getConteudosInscritos());
        devSabrina.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Sabrina:" + devSabrina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Sabrina:" + devSabrina.getConteudosConcluidos());

        System.out.println("------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());








    }

