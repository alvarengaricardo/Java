/*
   Estatística de jogo de dados usando array
 */

package br.com.deitel.cap07;

import java.security.SecureRandom;

public class RollDieArray {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        // contador
        int[] frequency = {0, 0, 0, 0, 0, 0};

        for (int roll = 1; roll <= 6000000; roll++) {

            int face = 1 + randomNumbers.nextInt(6);

            frequency[face - 1]++;

        }

        System.out.printf("%s%10s%n", "Face", "Frequency"); // cabeçalhos de saída
        for (int face = 0; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face + 1, frequency[face]);
    }
}