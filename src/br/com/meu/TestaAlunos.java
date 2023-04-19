package br.com.meu;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        System.out.println(alunos.size());
        alunos.add("Mauricio Aniche");

        System.out.println(alunos.size());


    }
}
