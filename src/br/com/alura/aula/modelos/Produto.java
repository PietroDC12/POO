package br.com.alura.aula.modelos;

public class Produto {

    private double preco;
    private String nome;
    private double novoPreco;
    private double desconto;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }

}
