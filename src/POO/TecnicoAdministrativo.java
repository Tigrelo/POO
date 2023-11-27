package POO;

class TecnicoAdministrativo extends Pessoa {
    private String cargo;
    private String departamento;

    public TecnicoAdministrativo(String nome, Endereco endereco, Telefone telefone, String cpf, String cargo, String departamento) {
        super(nome, endereco, telefone, cpf);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }


    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento: " + departamento);
    }
}