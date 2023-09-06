package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Power.integerPower;

public class PowerTest {
    public static void main(String[] args) {
        System.out.printf("2^0: %d%n", integerPower(2, 0));
        System.out.printf("2^1: %d%n", integerPower(2, 1));
        System.out.printf("2^2: %d%n", integerPower(2, 2));
        System.out.printf("2^3: %d%n", integerPower(2, 3));
        System.out.printf("2^4: %d%n", integerPower(2, 4));
    }
}
