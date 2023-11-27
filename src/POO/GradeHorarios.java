package POO;

import java.util.ArrayList;
import java.util.List;

class GradeHorarios<HorarioAula> {
    private Curso curso;
    private int semestre;
    private int ano;
    private String turno;

    private List<HorarioAula> horariosAula;

    public GradeHorarios(Curso curso, int semestre, int ano, String turno) {
        this.curso = curso;
        this.semestre = semestre;
        this.ano = ano;
        this.turno = turno;
        this.horariosAula = new ArrayList<>();
    }

    public void addHorarioAula(HorarioAula horario) {
        horariosAula.add(horario);
    }

    public Curso getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAno() {
        return ano;
    }

    public String getTurno() {
        return turno;
    }

    public List<Horario> getHorarios() {
        return new ArrayList<>();
    }

    public void adicionarHorario(HorarioAula horario) {
        horariosAula.add(horario);
    }

    public void imprimirInformacoes() {
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Semestre: " + semestre);
        System.out.println("Ano: " + ano);
        System.out.println("Turno: " + turno);
        for (HorarioAula horario : horariosAula) {
            System.out.println(horario.toString());
            System.out.println("--------");
        }
    }
}


