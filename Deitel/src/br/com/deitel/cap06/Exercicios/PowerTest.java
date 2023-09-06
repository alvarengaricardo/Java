package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.Power;

public class PowerTest {
    public static void main(String[] args) {
        System.out.printf("Teste com int:%n");
        System.out.printf("2^0: %d%n", Power(2, 0));
        System.out.printf("2^1: %d%n", Power(2, 1));
        System.out.printf("2^2: %d%n", Power(2, 2));
        System.out.printf("2^3: %d%n", Power(2, 3));
        System.out.printf("2^4: %d%n", Power(2, 4));

        System.out.printf("%n%n Teste com double:%n");
        System.out.printf("2.5^0: %.3f%n", Power(2.5, 0));
        System.out.printf("2.5^1: %.3f%n", Power(2.5, 1));
        System.out.printf("2.5^2: %.3f%n", Power(2.5, 2));
        System.out.printf("2.5^3: %.3f%n", Power(2.5, 3));
        System.out.printf("2.5^4: %.3f%n", Power(2.5, 4));
    }
}
