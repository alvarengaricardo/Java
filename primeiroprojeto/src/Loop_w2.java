import java.util.Scanner;

public class Loop_w2 {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeAvaliacoes = 0;

        Scanner leitura = new Scanner(System.in);

        while (nota != -1) {
            System.out.println("Qual a sua avaliação? (-1 para sair)");
            nota = leitura.nextDouble();
            if (nota >= 0){
                mediaAvaliacao += nota;
                quantidadeAvaliacoes++;
            }
        }
        mediaAvaliacao = mediaAvaliacao / quantidadeAvaliacoes;
        System.out.println("A médida da avaliação é: " + mediaAvaliacao);
    }
}
