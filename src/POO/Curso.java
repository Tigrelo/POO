package POO;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nome;
    private int duracao;

    public Curso(String codigo, String nome, int duracao) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void imprimirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Duração: " + duracao + " semestres");
    }
}