package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.isPrime;

public class IsPrimeTest {
    public static void main(String[] args) {
        System.out.printf(" 3: %b%n", isPrime(3));
        System.out.printf(" 4: %b%n", isPrime(4));
        System.out.printf(" 5: %b%n", isPrime(5));
        System.out.printf(" 6: %b%n", isPrime(6));
        System.out.printf(" 7: %b%n", isPrime(7));
        System.out.printf(" 9: %b%n", isPrime(9));
        System.out.printf("10: %b%n", isPrime(10));
        System.out.printf("11: %b%n", isPrime(11));
    }
}
