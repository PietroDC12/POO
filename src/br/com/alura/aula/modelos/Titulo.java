package br.com.alura.aula.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNomeFilme() {
        return nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNomeFilme(String nome) {
        this.nome = nome;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do título:" + nome);
        System.out.println("Ano de lançamento do filme:" + anoLancamento);
        //System.out.println("Incluso no pacote de assinatura?" + incluidoPlano);
        //System.out.println("Notas do filme:" + avaliacao);
        //System.out.println("Quantidade de avaliações do filme:" + totalAvaliacao);
        System.out.println("Duração em minutos do filme:" + duracaoMinutos);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double mediaAvaliacao(){
        return somaAvaliacoes / totalAvaliacao;
    }
}
