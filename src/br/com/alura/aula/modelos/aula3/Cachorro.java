package br.com.alura.aula.modelos.aula3;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("auauau");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo!");
    }
}
