package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.isEven;

public class IsEvenTest {
    public static void main(String[] args) {
        System.out.printf("Teste com int:%n");
        System.out.printf("4: %b%n", isEven(2));
        System.out.printf("7: %b%n", isEven(7));

        System.out.printf("%nTeste com double:%n");
        System.out.printf("2.0: %b%n", isEven(2.0));
        System.out.printf("2.5: %b%n", isEven(2.5));
    }
}
