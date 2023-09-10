package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.isPrime;

public class PrimeTo10k {
    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            if (isPrime(i)) System.out.printf("%d%n", i);
        }
    }
}
