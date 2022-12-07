import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("mentoria de java");
    mentoria1.setDescricao("descrição mentoria java");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devBianca = new Dev();
    devBianca.setNome("Bianca");
    devBianca.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Bianca: " + devBianca.getConteudosInscritos());
    devBianca.progredir();
    devBianca.progredir();
    System.out.println("-");
    System.out.println("Conteúdos concluídos Bianca: " + devBianca.getConteudosConcluidos());
    System.out.println("-");
    System.out.println("XP: " + devBianca.calcularTotalXp());
    
    System.out.println("-----------------------");

    Dev devLeticia = new Dev();
    devLeticia.setNome("Leticia");
    devLeticia.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Leticia: " + devLeticia.getConteudosInscritos());
    devLeticia.progredir();
    devLeticia.progredir();
    devLeticia.progredir();
    System.out.println("-");
    System.out.println("Conteúdos inscritos Leticia: " + devLeticia.getConteudosInscritos());
    System.out.println("Conteúdos concluídos Leticia: " + devLeticia.getConteudosConcluidos());
    System.out.println("-");
    System.out.println("XP: " + devLeticia.calcularTotalXp());


  }
}
