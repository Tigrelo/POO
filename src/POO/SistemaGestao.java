package POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaGestao {
    private List<Professor> professores;
    private List<TecnicoAdministrativo> tecnicosAdministrativos;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private List<Disciplina> disciplinas;
    private Map<String, GradeHorarios> gradeHorarios;

    public SistemaGestao() {
        professores = new ArrayList<>();
        tecnicosAdministrativos = new ArrayList<>();
        alunos = new ArrayList<>();
        cursos = new ArrayList<>();
        disciplinas = new ArrayList<>();
        gradeHorarios = new HashMap<>();
    }


    public void cadastrarProfessor(String nome, Endereco endereco, Telefone telefone, String cpf, int titulacao, String areaPesquisa, double salario) {

        Professor professor = new Professor(nome, endereco, telefone, cpf, titulacao, areaPesquisa, salario);
        if (!professores.contains(professor)) {
            professores.add(professor);
            System.out.println("Professor cadastrado com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar professor. Professor já existe no sistema.");
        }
    }

    public void cadastrarTecnicoAdministrativo(String nome, Endereco endereco, Telefone telefone, String cpf, String cargo, String departamento) {
        TecnicoAdministrativo tecnicoAdministrativo = new TecnicoAdministrativo(nome, endereco, telefone, cpf, cargo, departamento);
        if (!tecnicosAdministrativos.contains(tecnicoAdministrativo)) {
            tecnicosAdministrativos.add(tecnicoAdministrativo);
            System.out.println("Técnico Administrativo cadastrado com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar Técnico Administrativo. Técnico Administrativo já existe no sistema.");
        }
    }

    public void cadastrarAluno(String nome, Endereco endereco, Telefone telefone, String cpf, String matricula, Curso curso) {
        Aluno aluno = new Aluno(nome, endereco, telefone, cpf, matricula, curso);
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar aluno. Aluno já existe no sistema.");
        }
    }

    public void cadastrarCurso(String codigo, String nome, int duracao) {
        Curso curso = new Curso(codigo, nome, duracao);
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Curso cadastrado com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar curso. Curso já existe no sistema.");
        }
    }

    public void cadastrarDisciplina(String codigo, String nome, int semestre, int ano, int cargaHoraria, int creditos) {
        Disciplina disciplina = new Disciplina(codigo, nome, semestre, ano, cargaHoraria, creditos);
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina cadastrada com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar disciplina. Disciplina já existe no sistema.");
        }
    }

    public void cadastrarGradeHorarios(Curso curso, int semestre, int ano, String turno) {
        String chave = curso.getCodigo() + "-" + semestre + "-" + ano + "-" + turno;
        GradeHorarios grade = new GradeHorarios(curso, semestre, ano, turno);
        if (!gradeHorarios.containsKey(chave)) {
            gradeHorarios.put(chave, grade);
            System.out.println("Grade de horários cadastrada com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar grade de horários. Grade de horários já existe no sistema!");
        }

    }

    public GradeHorarios buscarGradeHorarios(Curso curso, int semestre, int ano, String turno) {
        String chave = curso.getCodigo() + "-" + semestre + "-" + ano + "-" + turno;
        return gradeHorarios.get(chave);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<TecnicoAdministrativo> getTecnicosAdministrativos() {
        return tecnicosAdministrativos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<GradeHorarios> getGradeHorarios() {
        return new ArrayList<>(gradeHorarios.values());
    }

    public Professor buscarProfessorPorCPF(String cpf) {
        for (Professor professor : professores) {
            if (professor.getCPF().equals(cpf)) {
                return professor;
            }
        }
        return null; // Retorna null caso não encontre o professor com o CPF informado
    }

    public void excluirAluno(String matricula) {
        Aluno alunoParaExcluir = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunoParaExcluir = aluno;
                break;
            }
        }
        if (alunoParaExcluir != null) {
            alunos.remove(alunoParaExcluir);
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

}
