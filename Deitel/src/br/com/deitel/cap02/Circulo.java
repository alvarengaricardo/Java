/*
 * Exercicio 28
 * Calcular diâmetro, circunferência e área de um círculo
 */

package br.com.deitel.cap02;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        float raio = input.nextFloat();

        System.out.println("Diâmetro: " + (2 * raio));
        System.out.println("Circunferência: " + (2 * Math.PI * raio));
        System.out.println("Área: " + (Math.PI * Math.pow(raio, 2)));

    }
}
