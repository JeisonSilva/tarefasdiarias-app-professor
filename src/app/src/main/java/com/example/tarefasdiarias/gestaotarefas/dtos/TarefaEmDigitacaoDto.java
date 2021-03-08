package com.example.tarefasdiarias.gestaotarefas.dtos;

import java.io.Serializable;

public final class TarefaEmDigitacaoDto implements Serializable {

    int id;
    String titulo;
    String aluno;
    String professor;
    String disciplina;
    double pontuacao;
    boolean tarefaEntregue;

    public TarefaEmDigitacaoDto(int id, String titulo, String aluno, String professor, String disciplina, double pontuacao) {
        this.id = id;
        this.titulo = titulo;
        this.aluno = aluno;
        this.professor = professor;
        this.disciplina = disciplina;
        this.pontuacao = pontuacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isTarefaEntregue() {
        return tarefaEntregue;
    }

    public void setTarefaEntregue(boolean tarefaEntregue) {
        this.tarefaEntregue = tarefaEntregue;
    }
}
