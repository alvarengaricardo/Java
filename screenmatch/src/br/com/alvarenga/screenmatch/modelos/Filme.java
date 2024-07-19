package br.com.alvarenga.screenmatch.modelos;

import br.com.alvarenga.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) calcularMedia()/2;
    }

    @Override
    public String toString() {
        String string = "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        return string;
    }
}
