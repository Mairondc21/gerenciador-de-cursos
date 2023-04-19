package br.com.meu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com arrayList",21));
        javaColecoes.adiciona(new Aula("Criando aula",20));
        javaColecoes.adiciona(new Aula("Modelando Colecoes",22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


    }
}
