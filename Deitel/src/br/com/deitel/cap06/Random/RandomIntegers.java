package br.com.deitel.cap06.Random;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {

        // o objeto será o gerador de inteiros aleatórios
        SecureRandom randomNumbers = new SecureRandom();

        // loop para "lançar" o dado 20 vezes
        for (int counter = 1; counter <= 20; counter++){
            int face = 1 + randomNumbers.nextInt(6);
            System.out.printf("%d ", face);

            // quebra a saida a cada 5 lances
            if(counter % 5 == 0) System.out.println();
        }
    }
}
