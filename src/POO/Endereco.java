package POO;

class Endereco {
    private String avenidaRua;
    private String numero;
    private String bairro;
    private String cep;

    public Endereco(String avenidaRua, String numero, String bairro, String cep) {
        this.avenidaRua = avenidaRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getAvenidaRua() {
        return avenidaRua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }
}