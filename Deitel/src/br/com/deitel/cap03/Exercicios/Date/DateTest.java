package br.com.deitel.cap03.Exercicios.Date;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        int dia = 0;
        int mes = 0;
        int ano = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        dia = entrada.nextInt();
        System.out.println("Digite o mês: ");
        mes = entrada.nextInt();
        System.out.println("Digite o ano: ");
        ano = entrada.nextInt();

        Date date = new Date(dia, mes, ano);
        System.out.printf("A data é: ");
        date.displayDate();
        System.out.printf("%n");
    }
}
