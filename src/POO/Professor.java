package POO;

public class Professor extends Pessoa {
    private int titulacao;
    private String areaPesquisa;
    private double salario;
    public static final int TITULACAO_POS_GRAD = 1;
    public static final int TITULACAO_MESTRADO = 2;
    public static final int TITULACAO_DOUTORADO = 3;
    public static final int TITULACAO_POS_DOC = 4;
    public static final double FATOR_SALARIAL = 1.5;

    public Professor(String nome, Endereco endereco, Telefone telefone, String cpf, int titulacao, String areaPesquisa, double salario) {
        super(nome, endereco, telefone, cpf);
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;
        this.salario = salario;
    }

    // Getters e Setters para titulacao e areaPesquisa
    public int getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;

    }

    public double getSalario() {
        return salario;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        String titulacaoStr;
        switch (getTitulacao()) {
            case TITULACAO_POS_GRAD:
                titulacaoStr = "Pós-Graduação";
                break;
            case TITULACAO_MESTRADO:
                titulacaoStr = "Mestrado";
                break;
            case TITULACAO_DOUTORADO:
                titulacaoStr = "Doutorado";
                break;
            case TITULACAO_POS_DOC:
                titulacaoStr = "Pós-Doc";
                break;
            default:
                titulacaoStr = "Desconhecida";
                break;
        }

        System.out.println("Titulação: " + titulacaoStr);
        System.out.println("Área de Pesquisa: " + getAreaPesquisa());
        System.out.println("Salário: R$" + (getSalario() * FATOR_SALARIAL));
    }

    public Object getCPF() {
        return null;
    }
}

