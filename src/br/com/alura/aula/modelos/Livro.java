package br.com.alura.aula.modelos;

public class Livro {
    private String nomeAutor;
    private  String nomelivro;

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public String getNomelivro() {
        return nomelivro;
    }

    public void exibirDetalhes(){
        System.out.println("O livro " +nomelivro +" foi escrito por "+ nomeAutor +".");
    }
}
