package _01_beginner;

import java.util.Scanner;

public class _1003_somaSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, soma;
        a = entrada.nextInt();
        b = entrada.nextInt();
        soma = a + b;
        System.out.printf("SOMA = %d%n", soma);
    }
}
