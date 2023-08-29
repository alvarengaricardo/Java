package br.com.deitel.cap06.Random;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        // contadores
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int roll = 1; roll <= 6000000; roll++){

            int face = 1 + randomNumbers.nextInt(6);

            switch (face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Face\tFrequency"); // cabeçalhos de saída
        System.out.printf("1\t\t%7d%n2\t\t%7d%n3\t\t%7d%n4\t\t%7d%n5\t\t%7d%n6\t\t%7d%n",
            frequency1, frequency2, frequency3, frequency4,
            frequency5, frequency6);
    }
}