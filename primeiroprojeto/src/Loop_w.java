import java.util.Scanner;

public class Loop_w {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeAvaliacoes = 0;
        int contador = 1;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Quantas avaliações?");
        quantidadeAvaliacoes = leitura.nextInt();

        while (contador <= quantidadeAvaliacoes) {

            System.out.println("Qual a sua avaliação (0 - 10)?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            contador++;

        }
        mediaAvaliacao = mediaAvaliacao / quantidadeAvaliacoes;
        System.out.println("A médida da avaliação é: " + mediaAvaliacao);
    }
}
