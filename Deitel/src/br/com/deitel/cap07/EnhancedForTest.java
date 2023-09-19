/*
    Exemplo de utilização do for aprimorado
 */
package br.com.deitel.cap07;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = {11, 52, 96, 77, 25, 35, 63, 41, 59, 65, 44, 55, 23, 11, 98, 15, 2, 3, 9};
        int total = 0;

        for (int number : array)
            total += number;

        System.out.printf("Total of array: %d%n", total);
    }
}
