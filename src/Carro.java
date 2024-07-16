public class Carro {
    String modelo;
    int ano;
    String cor;
    int idade;

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do veículo: " + ano);
        System.out.println("Cor do carro: " + cor);

    }

    int idadeCarro(){
        idade = 2024 - ano;
        return idade;
    }
}
