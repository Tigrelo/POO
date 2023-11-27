package POO;


class Disciplina {
    private String codigo;
    private String nome;
    private int semestre;
    private int ano;
    private int cargaHoraria;
    private int creditos;

    public Disciplina(String codigo, String nome, int semestre, int ano, int cargaHoraria, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
        this.ano = ano;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAno() {
        return ano;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void imprimirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Semestre: " + semestre);
        System.out.println("Ano: " + ano);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Créditos: " + creditos);
    }

}

