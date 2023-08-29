package br.com.deitel.cap06;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom(); //gerador de numeros aleatórios

    private enum Status {CONTINUE, WON, LOST};

    // tipo enum representando estado do jogo

    // constantes para lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    // partida de craps
    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus; // CONTUNUE, WON ou LOST
        int sumOfDice = rollDice(); // primeira rolagem

        // determina estado e pontuação após primeiro lançamento
        switch (sumOfDice) { // ganha com 7 no primeiro lançamento
            case SEVEN, YO_ELEVEN -> // ganha com 11 no primeiro lançamento
                    gameStatus = Status.WON;
            // perde com 2 no primeiro lançamento
            // perde com 3 no primeiro lançamento
            case SNAKE_EYES, TREY, BOX_CARS -> // perde com 12 no primeiro lançamento
                    gameStatus = Status.LOST;
            default -> { // continua jogando, contando a pontuação
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice; // informa a pontuação
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        // continua jogando
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            // determina o Status do Jogo
            if (sumOfDice == myPoint) gameStatus = Status.WON; // vitória por pontuação
            else if (sumOfDice == SEVEN) gameStatus = Status.LOST; // Perde em caso de 7 antes de atingir pontuação
        }
        // exibe WIN ou LOST
        if (gameStatus == Status.WON) System.out.println("Player wins!");
        else System.out.println("Player loses!");
    }

    // lança dados, calcula a soma e exibe os resultados
    public static int rollDice() {
        // lança
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        // soma
        int sum = die1 + die2;

        // exibe
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}