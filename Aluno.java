package br.sc.senac.perfil.model;

public class Aluno {
    private String nome;
    private String Date;
    private String Curso;
    private Integer Fase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public Integer getFase() {
        return Fase;
    }

    public void setFase(Integer fase) {
        Fase = fase;
    }
}
