public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvalicoes;
    int totalDeAvaliacoes = 0;
    int duracaoEmMinutos;

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Média das avaliações: " + calcularMedia());
    }

    void avaliar(double nota){
        somaDasAvalicoes += nota;
        totalDeAvaliacoes ++;

    }

    double calcularMedia(){
        return somaDasAvalicoes / totalDeAvaliacoes;
    }
}
