package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        // Curso 1
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        // Curso1
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        // Mentoria

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        // Print
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFilipe = new Dev();
        
        devFilipe.setNome("Filipe");
        devFilipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devFilipe.getConteudosInscritos());
        
        
        devFilipe.progredir();
        
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devFilipe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devFilipe.getConteudosConcluidos());

        System.out.println("----------");

        Dev devJoao = new Dev();
        
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosInscritos());
        
        
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devJoao.getConteudosConcluidos());
        
    }
}
