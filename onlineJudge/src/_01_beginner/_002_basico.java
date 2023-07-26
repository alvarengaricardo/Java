package _01_beginner;

import java.util.Scanner;

public class _002_basico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int X = A + B;
        System.out.printf("X = %d%n", X);
    }
}
