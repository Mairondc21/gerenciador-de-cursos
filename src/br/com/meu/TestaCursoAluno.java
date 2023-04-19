package br.com.meu;

public class TestaCursoAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com arrayList",21));
        javaColecoes.adiciona(new Aula("Criando aula",20));
        javaColecoes.adiciona(new Aula("Modelando Colecoes",22));

        Aluno a1 = new Aluno("Rodrigo Turini", 346);
        Aluno a2 = new Aluno("Guilherme Silveira", 345);
        Aluno a3 = new Aluno("Mauricio Aniche", 343);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("todos os alunos matriculados");
        javaColecoes.getAlunos().forEach(alunos ->{
            System.out.println(alunos);
        });

        System.out.println(javaColecoes.estaMatriculado(a1));



    }
}
