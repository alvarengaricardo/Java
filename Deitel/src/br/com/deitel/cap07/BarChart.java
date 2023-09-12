package br.com.deitel.cap07;

import java.security.SecureRandom;

public class BarChart {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        int value;
        int[] array = new int[10];

        // alimenta as posições do array
        for (int counter = 0; counter < array.length; counter++) {
            value = randomNumbers.nextInt(11);
            array[counter] = value;
        }

        System.out.printf("%3s%10s%n", "Pos", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%3d ", counter);
            for (int stars = 1; stars <= array[counter]; stars++) {
                System.out.printf("*");
            }
            System.out.printf(" - %d%n", array[counter]);
        }
    }
}
