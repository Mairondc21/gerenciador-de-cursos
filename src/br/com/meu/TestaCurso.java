package br.com.meu;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com arrayList",21));
        javaColecoes.adiciona(new Aula("Criando aula",20));
        javaColecoes.adiciona(new Aula("Modelando Colecoes",22));

        System.out.println(javaColecoes.getAulas());

    }
}
