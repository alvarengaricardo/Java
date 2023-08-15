package br.com.deitel.cap05;

public class ForCounter {
    public static void main(String[] args) {
        // o cabeçalho da instrução for inclui inicialização
        // condição de continuação do loop e incremento
        for (int counter = 1; counter <= 10; counter++)
            System.out.printf("%d ", counter);
        System.out.printf("%n");

        // exemplo de passo maior que 1
        for (int j = 2; j <= 80; j += 5) System.out.printf("j = %d%n", j);

        // exemplo de contador regressivo
        for (int x = 10; x >= 0; x--) System.out.printf("%d ", x);

    }
}
