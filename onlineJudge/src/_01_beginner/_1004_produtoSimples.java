package _01_beginner;

import java.util.Scanner;

public class _1004_produtoSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, produto;
        a = entrada.nextInt();
        b = entrada.nextInt();
        produto = a * b;
        System.out.printf("SOMA = %d%n", produto);
    }
}