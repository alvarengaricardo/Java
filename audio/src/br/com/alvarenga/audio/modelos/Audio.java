package br.com.alvarenga.audio.modelos;

public class Audio {
    protected String titulo;
    protected int duracao;
    protected int totalReproducoes;
    protected int curtidas;
    protected String classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void exibirFicha(){
        System.out.println("Título: " + titulo);
        System.out.println("Duracao: " + duracao);
        System.out.println("Total de reproduções: " + totalReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
    }
}
