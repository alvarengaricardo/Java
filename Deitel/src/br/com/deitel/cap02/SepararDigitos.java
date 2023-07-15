/*
 * Exercicio 30
 * Separar digitos de um inteiro de 5 posições
 */

package br.com.deitel.cap02;

import java.util.Scanner;

public class SepararDigitos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor entre 11111 e 99999: ");
        int numero = entrada.nextInt();

        if ((numero > 99999) || (numero < 11111)){
            System.out.println("Valor incorreto!");
        } else {
            int n1, n2, n3, n4, n5;
            n5 = (int)(numero % 10);
            n4 = (int)(numero - n5) % 100 / 10;
            n3 = (int)(numero - n4 * 10) % 1000 / 100;
            n2 = (int)(numero - n3 * 100) % 10000 / 1000;
            n1 = (int)(numero - n2 * 1000) % 100000 / 10000;
            System.out.println(n1 + "   " + n2 + "   " + n3 + "   " + n4 + "   " + n5);

        }

    }
}
