package br.com.deitel.cap07;

/*
    Efetuando a soma dos elementos de um Array -> O(n)
 */
public class SumArray {
    public static void main(String[] args) {

        int[] array = {12, 15, 3, 85, 64, 32, 78, 11, 40, 88};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        System.out.printf("Total: %d%n", sum);
    }
}
