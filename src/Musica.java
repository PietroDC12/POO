public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int totalAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("Nome do artista: " + artista);
        System.out.println("Nome do álbum: " + titulo);
        System.out.println("Ano de lançamento do álbum: " + anoLancamento);

    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    double mediaAvaliacao(){
        return somaAvaliacoes / totalAvaliacao;
    }
}
