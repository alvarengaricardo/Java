package br.com.deitel.cap06.Exercicios;

import java.util.Date;

import static br.com.deitel.cap06.Exercicios.Mathematics.isPerfect;

public class Perfect {
    public static void main(String[] args) {
        for (int i = 2; i <= 10000; i++) {
            if (isPerfect(i)) System.out.printf("%d%n", i);
        }
        System.out.printf("**********%n");
        System.out.printf("Relação dos 10 primeiros números perfeitos:%n%n");

        int contador = 0;
        long numero = 2;

        while (contador <= 10) {
            //System.out.printf("%s%n", numero);
            //if (numero == 33550336) System.out.printf("%d%n", numero);
            //if ((numero % 1000000) == 0) System.out.printf("%d%n", numero / 1000000);
            if (isPerfect(numero)) {
                Date horaAtual = new Date();
                System.out.println("-------------------- " + horaAtual);
                System.out.printf("******************** %d%n", numero);
                contador++;
            }
            numero++;
        }
    }
}
