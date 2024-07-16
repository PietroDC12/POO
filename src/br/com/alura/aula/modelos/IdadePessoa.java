package br.com.alura.aula.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void confere(int idade){
        if (idade >= 18){
            System.out.println(nome+" é maior de idade.");
        } else {
            System.out.println(nome+" é menor de idade.");
        }
    }
}
