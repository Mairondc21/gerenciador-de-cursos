package br.com.meu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalahndp com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println(aula);
        }

        aulas.forEach(aula -> {
            System.out.println("percorrendo :" + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);


    }
}
