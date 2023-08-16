package br.com.deitel.cap05;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada, i;

        System.out.printf("Qual a tabuada?%n");
        tabuada = entrada.nextInt();

        System.out.printf("*************%n");
        System.out.printf("Tabuada do %d%n", tabuada);
        System.out.printf("*************%n");

        i = 1;
        while (i <= 10){
            System.out.printf("%d x %d = %d%n", tabuada, i, tabuada * i);
            i++;
        }

        System.out.printf("*************%n");
    }
}
