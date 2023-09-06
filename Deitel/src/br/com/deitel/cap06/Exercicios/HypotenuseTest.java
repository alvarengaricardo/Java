package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.hypotenuse;

public class HypotenuseTest {
    public static void main(String[] args) {

        System.out.printf("lado1: 3, lado2:  4 -> %.3f%n", hypotenuse(3, 4));
        System.out.printf("lado1: 5, lado2: 12 -> %.3f%n", hypotenuse(5, 12));
        System.out.printf("lado1: 8, lado2: 15 -> %.3f%n", hypotenuse(8, 15));
    }
}
