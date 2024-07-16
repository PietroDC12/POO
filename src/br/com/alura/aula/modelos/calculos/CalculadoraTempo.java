package br.com.alura.aula.modelos.calculos;

import br.com.alura.aula.modelos.Filme;
import br.com.alura.aula.modelos.Serie;
import br.com.alura.aula.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclusao(Filme f){
//        tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclusao(Serie s){
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclusao(Titulo titulo){
        tempoTotal += titulo.getDuracaoMinutos();
    }
}
