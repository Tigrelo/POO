package POO;

import java.util.ArrayList;
import java.util.List;


class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private double mediaGeral;
    private int status;
    private List<Disciplina> disciplinasCursadas;
    private java.util.List<Disciplina> disciplinasACursar;

    public Aluno(String nome, Endereco endereco, Telefone telefone, String cpf, String matricula, Curso curso) {
        super(nome, endereco, telefone, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.mediaGeral = 0.0;
        this.status = 1;
        this.disciplinasCursadas = new ArrayList<>();
        this.disciplinasACursar = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getStatus() {
        return status;
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public List<Disciplina> getDisciplinasACursar() {
        return disciplinasACursar;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Média Geral: " + mediaGeral);
        System.out.println("Status: " + status);
    }
}