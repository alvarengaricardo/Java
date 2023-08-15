/*
Exemplo de utilização de "for" para executar uma tabuada
 */

package br.com.deitel.cap05;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada;

        System.out.printf("Qual a tabuada?%n");
        tabuada = entrada.nextInt();

        System.out.printf("*************%n");
        System.out.printf("Tabuada do %d%n", tabuada);
        System.out.printf("*************%n");

        for(int i = 1; i <= 10; i++) System.out.printf("%d x %d = %d%n", tabuada, i, tabuada * i);

        System.out.printf("*************%n");
    }
}
