package br.com.alvarenga.screenmatch.modelos;

public class Titulo {
    protected String nome;
    protected int anoDeLancamento;
    protected boolean incluidoNoPlano;
    private double somaDasAvalicoes;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvalicoes(double somaDasAvalicoes) {
        this.somaDasAvalicoes = somaDasAvalicoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Média das avaliações: " + calcularMedia());
    }

    public void avaliar(double nota){
        somaDasAvalicoes += nota;
        totalDeAvaliacoes ++;
    }

    public double calcularMedia(){
        return somaDasAvalicoes / totalDeAvaliacoes;
    }
}
