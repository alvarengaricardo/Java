package br.com.deitel.cap07;

/*
    Efetuando a soma dos elementos de um Array -> O(n)
 */
public class SumArray {
    public static void main(String[] args) {

        int[] array = {12, 15, 3, 85, 64, 32, 78, 11, 40, 88};
        int sum = 0;

        for (int i : array) sum += i;

        System.out.printf("Total: %d%n", sum);

        double[] array2 = {12.75, 15.05, 3.12, 85.00, 64.71, 32.65, 78.19, 11.99, 40.03, 88.40};
        double sum2 = 0;

        for (double x : array2) sum2 += x;

        System.out.printf("Total: %.2f%n", sum2);

    }
}
