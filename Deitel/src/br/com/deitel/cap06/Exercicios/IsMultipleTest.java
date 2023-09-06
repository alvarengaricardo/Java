package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.isMultiple;

public class IsMultipleTest {
    public static void main(String[] args) {
        System.out.printf("Teste com int:%n");
        System.out.printf("2 e 6: %b%n", isMultiple(2, 6));
        System.out.printf("2 e 7: %b%n", isMultiple(2, 7));
        System.out.printf("3 e 9: %b%n", isMultiple(3, 9));
        System.out.printf("3 e 8: %b%n", isMultiple(3, 17));

        System.out.printf("%nTeste com double:%n");
        System.out.printf("2.5 e 7.5: %b%n", isMultiple(2.5, 7.5));
        System.out.printf("2.5 e 9.0: %b%n", isMultiple(2.5, 9.0));
        System.out.printf("1.5 e 3.0: %b%n", isMultiple(1.5, 3.0));
        System.out.printf("1.5 e 4.2: %b%n", isMultiple(1.5, 4.2));
    }
}
