package br.com.alura.aula.modelos;

public class Aluno {

    private String nome;
    //int idade;
    private double notas;
    private double somaNotas;
    private int totalNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void avalia(double notas){
        somaNotas += notas;
        totalNotas++;
    }

    public double mediaAvaliacao(){
        return somaNotas / totalNotas;
    }
}

