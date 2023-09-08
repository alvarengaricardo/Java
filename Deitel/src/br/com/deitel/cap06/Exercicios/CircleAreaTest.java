package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.circleArea;

public class CircleAreaTest {
    public static void main(String[] args) {
        System.out.printf("Teste com int:%n");
        System.out.printf("2: %.3f%n", circleArea(2));
        System.out.printf("3: %.3f%n", circleArea(3));
        System.out.printf("4: %.3f%n", circleArea(4));
        System.out.printf("5: %.3f%n", circleArea(5));

        System.out.printf("%nTeste com double:%n");
        System.out.printf("2.5: %.3f%n", circleArea(2.5));
        System.out.printf("3.5: %.3f%n", circleArea(3.5));
        System.out.printf("4.5: %.3f%n", circleArea(4.5));
        System.out.printf("5.5: %.3f%n", circleArea(5.5));
    }
}
