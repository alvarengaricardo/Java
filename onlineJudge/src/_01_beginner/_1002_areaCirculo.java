package _01_beginner;

import java.util.Scanner;

public class _1002_areaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n = 3.14159;
        double raio = entrada.nextDouble();
        double area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);
    }
}
