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

        System.out.println("Face\tFrequency"); // cabeçalhos de saída
        System.out.printf("1\t\t%7d%n2\t\t%7d%n3\t\t%7d%n4\t\t%7d%n5\t\t%7d%n6\t\t%7d%n",
                frequency[0], frequency[1], frequency[2], frequency[3],
                frequency[4], frequency[5]);
    }
}