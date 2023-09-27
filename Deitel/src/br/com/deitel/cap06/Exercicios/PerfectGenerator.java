// Gerador de números perfeitos a partir de uma fórmula

package br.com.deitel.cap06.Exercicios;

public class PerfectGenerator {
    public static void main(String[] args) {

        long numero, p1, p2;
        boolean flag;
        for (int n = 2; n <= 100; n++) {
            flag = Mathematics.isPrime(n);
            if (flag) {
                p1 = (long) Math.pow(2, n - 1);
                p2 = (long) Math.pow(2, n) - 1;
                numero = p1 * p2;
                if (Mathematics.isPerfect(numero))
                    System.out.printf("%d - %d%n", n, numero);
            }
        }
    }

}
