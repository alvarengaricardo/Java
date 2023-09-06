package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.power;

public class PowerTest {
    public static void main(String[] args) {
        System.out.printf("Teste com int:%n");
        System.out.printf("2^0: %d%n", power(2, 0));
        System.out.printf("2^1: %d%n", power(2, 1));
        System.out.printf("2^2: %d%n", power(2, 2));
        System.out.printf("2^3: %d%n", power(2, 3));
        System.out.printf("2^4: %d%n", power(2, 4));

        System.out.printf("%nTeste com double:%n");
        System.out.printf("2.5^0: %.3f%n", power(2.5, 0));
        System.out.printf("2.5^1: %.3f%n", power(2.5, 1));
        System.out.printf("2.5^2: %.3f%n", power(2.5, 2));
        System.out.printf("2.5^3: %.3f%n", power(2.5, 3));
        System.out.printf("2.5^4: %.3f%n", power(2.5, 4));
    }
}
