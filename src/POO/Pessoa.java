package POO;

class Pessoa {
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String cpf;

    public Pessoa(String nome, Endereco endereco, Telefone telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}





