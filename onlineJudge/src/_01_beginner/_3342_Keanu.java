/*
apresentar o numero de casas brancas e pretas de um tabuleiro de n lados
 */


package _01_beginner;

import java.io.IOException;
import java.util.Scanner;

public class _3342_Keanu {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if (2 <= n && n <= 100) {
            int brancas = 0;
            int pretas = 0;
            int controle = 1;
            for (int linha = 1; linha <= n; linha++) {
                for (int coluna = 1; coluna <= n; coluna++) {
                    if (controle == 1) {
                        brancas++;
                    } else {
                        pretas++;
                    }
                    controle = controle * (-1);
                }
            }
            System.out.printf("%d casas brancas e %d casas pretas%n", brancas, pretas);
        }
    }
}
