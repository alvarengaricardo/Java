/*
   Estatística de jogo de dados usando array, exibindo dados em tempo real (RT)
 */

package br.com.deitel.cap07;

import java.security.SecureRandom;

public class RollDieArray_RT {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        // contador
        int[] frequency = {0, 0, 0, 0, 0, 0};

        System.out.printf("%5s%5s%5s%5s%5s%5s%n", "1", "2", "3", "4", "5", "6"); // cabeçalhos de saída
        System.out.printf("******************************%n");
        for (int roll = 1; roll <= 1000; roll++) {
            int face = 1 + randomNumbers.nextInt(6);
            frequency[face - 1]++;
            for (int i = 0; i < frequency.length; i++)
                System.out.printf("%5d", frequency[i]);
            System.out.printf("%n");
        }
    }
}