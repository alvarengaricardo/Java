/*
 * Exercicio 32
 * Contador de valores de entrada - conta positivos, negativos e zeros
 */

package br.com.deitel.cap02;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int contaNegativo = 0;
        int contaPositivo = 0;
        int contaZero = 0;
        Double numero;
        Scanner entrada = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.print("Digite um valor: ");
            numero = entrada.nextDouble();

            if(numero > 0) contaPositivo++;
            if(numero < 0) contaNegativo++;
            if(numero == 0) contaZero++;
        }
        System.out.println("Foram digitados " + contaPositivo + " números positivos.");
        System.out.println("Foram digitados " + contaNegativo + " numeros negativos.");
        System.out.println("Foram digitados " + contaZero + " zeros");
    }
}
