import java.time.LocalDate;

import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

public class Main {


    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da Mentoria de Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);


        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("Conteudos Inscritos: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devGabriel.getConteudosConcluidos());
        devGabriel.progredir();
        System.out.println("Conteudos Inscritos: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devGabriel.getConteudosConcluidos());

        System.out.println("XP = " + devGabriel.calcularTotalXp());






    }
    
}
