package br.com.alvarenga.screenmatch.calculos;

import br.com.alvarenga.screenmatch.modelos.Filme;
import br.com.alvarenga.screenmatch.modelos.Serie;
import br.com.alvarenga.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    /*
    public void incluir(Filme filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }

    // sobrecarga de método
    public void incluir(Serie serie){
        tempoTotal += serie.getDuracaoEmMinutos();
    }
    */

    // Polimorfismo -> Pode receber tanto Filme quanto Série
    public void incluir(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
