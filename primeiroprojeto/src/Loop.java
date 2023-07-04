import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        Scanner leitura = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Qual a sua avaliação (0 - 10)?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        mediaAvaliacao = mediaAvaliacao / 3;
        System.out.println("A médida da avaliação é: " + mediaAvaliacao);


    }
}
