package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.minimum3;

public class Minimum3Test {
    public static void main(String[] args) {
        System.out.printf("2.5, 3.0, 4.7: %.1f%n", minimum3(2.5, 3.0, 4.7));
        System.out.printf("3.0, 1.1, 4.7: %.1f%n", minimum3(3.0, 1.1, 4.7));
        System.out.printf("4.7, 3.0, 0.5: %.1f%n", minimum3(4.7, 3.0, 0.5));
    }
}
