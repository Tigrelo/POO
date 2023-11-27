package POO;

import java.util.ArrayList;
import java.util.List;

class Horario {
    private Disciplina disciplina;
    private String horaInicial;
    private String horaFinal;
    private String diaSemana;
    private String sala;
    private Professor professor;
    private List<Aluno> alunos;

    public Horario(Disciplina disciplina, String horaInicial, String horaFinal, String diaSemana, String sala, Professor professor) {
        this.disciplina = disciplina;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.diaSemana = diaSemana;
        this.sala = sala;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getSala() {
        return sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void imprimirInformacoes() {
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Hora Inicial: " + horaInicial);
        System.out.println("Hora Final: " + horaFinal);
        System.out.println("Dia da Semana: " + diaSemana);
        System.out.println("Sala: " + sala);
        System.out.println("Professor: " + professor.getNome());
    }
}
