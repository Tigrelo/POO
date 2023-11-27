package POO;

public class main {
    public static void main(String[] args) {
        // Instanciar, inicializar e executar o sistema
        SistemaGestao sistema = new SistemaGestao();

        Endereco endereco = new Endereco("Rua A", "123", "Bairro X", "12345-678");
        Telefone telefone = new Telefone("31", "99999-9999");
        Curso curso = new Curso("C001", "Ciência da Computação", 8);
        HorarioAula horarioMatematica = new HorarioAula("Segunda-feira", "08:00", "10:00", "Calculo 2");

        sistema.cadastrarProfessor("Isaac", endereco, telefone, "123.456.789-00", 3, "Inteligência Artificial", 5000.0);
        sistema.cadastrarAluno("Maria", endereco, telefone, "987.654.321-00", "E01702", curso);
        sistema.cadastrarCurso("C002", "Engenharia Civil", 10);
        sistema.cadastrarDisciplina("D001", "Programação I", 1, 2022, 60, 4);
        sistema.cadastrarGradeHorarios(curso, 1, 2023, "Manhã");
        horarioMatematica.imprimirInformacoes();

        // Imprimir as informações de todos os objetos cadastrados
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Professores:");
        for (Professor professor : sistema.getProfessores()) {
            System.out.println("----------------------");
            professor.imprimirInformacoes();
            System.out.println("----------------------");
        }

        System.out.println("\nAlunos:");
        for (Aluno aluno : sistema.getAlunos()) {
            System.out.println("----------------------");
            aluno.imprimirInformacoes();
            System.out.println("----------------------");
        }

        System.out.println("\nCursos:");
        for (Curso ignored : sistema.getCursos()) {
            System.out.println("----------------------");
            curso.imprimirInformacoes();
            System.out.println("----------------------");
        }

        System.out.println("\nDisciplinas:");
        for (Disciplina disciplina : sistema.getDisciplinas()) {
            System.out.println("----------------------");
            disciplina.imprimirInformacoes();
            System.out.println("----------------------");
        }

        System.out.println("\nGrade de Horários:");
        for (GradeHorarios grade : sistema.getGradeHorarios()) {
            System.out.println("----------------------");
            grade.imprimirInformacoes();
            System.out.println("----------------------");
        }

        /* System.out.println("\nTécnicos Administrativos:");
        for (TecnicoAdministrativo tecnico : sistema.getTecnicosAdministrativos()) {
            System.out.println("----------------------");
            tecnico.imprimirInformacoes();
            System.out.println("----------------------");
        }*/


    }
}





