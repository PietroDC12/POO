import br.com.alura.aula.modelos.*;
import br.com.alura.aula.modelos.ContaBancaria;
import br.com.alura.aula.modelos.aula3.*;
import br.com.alura.aula.modelos.aula4.*;
import br.com.alura.aula.modelos.calculos.CalculadoraTempo;
import br.com.alura.aula.modelos.calculos.FiltroRecomendacao;


public class Principal {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.setNomeFilme("Meu Malvado Favorito");
        novoFilme.setAnoLancamento(2012);
        //novoFilme.incluidoPlano = "True";
        novoFilme.setDuracaoMinutos(98);


        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(8);
        novoFilme.avalia(7);
        novoFilme.avalia(9);
        novoFilme.avalia(10);

        System.out.println("Total de avaliações: " + novoFilme.getTotalAvaliacao());

        System.out.println(novoFilme.mediaAvaliacao());


        Serie serie1 = new Serie();

        serie1.setMinutosPorEpisodio(10);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setTemporadas(2);


        System.out.println("Tempo de visualização da série: "+serie1.getDuracaoMinutos());

        CalculadoraTempo calculadora = new CalculadoraTempo();

        calculadora.inclusao(novoFilme);
        calculadora.inclusao(serie1);
        System.out.println("Tempo total: "+calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(novoFilme);

        //Ex. 1 - Aula 1.

        Pessoa mensagem = new Pessoa();

        mensagem.imprimeMensagem();

        //Ex. 2 - Aula 1.

        Calculadora conta1 = new Calculadora();

        conta1.numero = 5;

        System.out.println(conta1.contaDobro());

        //Ex. 3 - Aula 1.

        Musica artista1 = new Musica();

        artista1.artista = "Twenty One Pilots";
        artista1.titulo = "Clancy";
        artista1.anoLancamento = 2023;

        artista1.exibeFichaTecnica();

        artista1.avalia(10);
        artista1.avalia(9);

        System.out.println("Nota do álbum: " + artista1.mediaAvaliacao());

        //Ex. 4 - Aula 1.

        Carro carro1 = new Carro();

        carro1.modelo = "Fiat Mobi";
        carro1.ano = 2022;
        carro1.cor = "Branco";

        carro1.exibeFichaTecnica();

        System.out.println("Idade do carro: " + carro1.idadeCarro() + " ano(s)");

        //Ex. 5 - Aula 1.

        Aluno aluno1 = new Aluno();

        //aluno1.nome = "Pietro";
        //aluno1.idade = 23;

        //aluno1.exibeFichaAluno();


        //Ex. 1 - Aula 2.

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(122);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());

        //Ex. 2 - Aula 2.

        IdadePessoa identidade = new IdadePessoa();

        identidade.setIdade(12);
        identidade.setNome("Mário");

        identidade.confere(identidade.getIdade());

        //  Ex. 3 - Aula 2.

        Produto novoProduto = new Produto();

        novoProduto.setNome("Bola");
        novoProduto.setPreco(20);
        novoProduto.aplicarDesconto(10);

        System.out.println("O produto "+ novoProduto.getNome() + " está com o novo valor de: "+novoProduto.getPreco());


        // Ex. 4 - Aula 2

        Aluno aluno3 = new Aluno();

        aluno3.setNome("Roberto");
        aluno3.avalia(8.5);
        aluno3.avalia(7);
        aluno3.avalia(6);
        aluno3.avalia(10);

        System.out.println("A média de "+ aluno3.getNome() + " foi de: "+aluno3.mediaAvaliacao());

    //Ex. 5 - Aula 2.

        Livro livro1 = new Livro();

        livro1.setNomeAutor("João Barbosa");
        livro1.setNomelivro("O vento levou");

        livro1.exibirDetalhes();

        //Ex. 1 - Aula 3.

        ModeloCarro carro5 = new ModeloCarro();
        carro5.definirModelo("Hatch");
        carro5.definirPrecos(30000, 32000, 35000);
        carro5.setNomeModelo("Palio Track");
        carro5.exibirInfo();
        System.out.println(carro5.getNomeModelo());

        //Ex. 2 - Aula 3.

        Cachorro cachorro1 = new Cachorro();

        cachorro1.emitirSom();
        cachorro1.abanarRabo();

        Gato gato1 = new Gato();

        gato1.emitirSom();
        gato1.arranharMoveis();

        // Ex. 3 - Aula 3.
        br.com.alura.aula.modelos.aula3.ContaBancaria conta10 = new br.com.alura.aula.modelos.aula3.ContaBancaria();
        conta10.depositar(1000);
        conta10.consultarSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(50);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(20);
        contaCorrente.consultarSaldo();

        //Ex. 4 - Aula 3.

        VerificadorPrimo verifica1 = new VerificadorPrimo();

        verifica1.verificarSeEhPrimo(17);
        verifica1.verificarSeEhPrimo(32);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

        //Ex. 1 - Aula 4.

        ConversorMoeda converte = new ConversorMoeda();

        converte.converterDolarParaReal(100);

        //Ex. 2 - Aula 4.

        CalculadoraSalaRetangular calculadora1 = new CalculadoraSalaRetangular();
        calculadora1.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora1.calcularPerimetro(5, 8);

        //Ex. 3 - Aula 4.

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);


        //Ex. 4 - Aula 4.

        ConversorTemperatura conversor = new ConvresorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");

    }
}

