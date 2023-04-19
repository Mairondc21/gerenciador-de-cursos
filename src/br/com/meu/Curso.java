package br.com.meu;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }
    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula : aulas){
            tempoTotal += aula.getTempo();

        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "Curso " + nome + " tempo total " + this.getTempoTotal();
    }
    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno outro){
        return this.alunos.equals(outro);
    }

    public Aluno buscaMatriculado(int nuemro) {
        if (!matriculaParaAluno.containsKey(nuemro)){
            throw new NoSuchElementException("nao está matriculado");
        }
        return matriculaParaAluno.get(nuemro);
    }
}
