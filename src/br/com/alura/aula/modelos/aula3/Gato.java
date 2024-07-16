package br.com.alura.aula.modelos.aula3;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("miau miau");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando o sofá!");
    }
}
