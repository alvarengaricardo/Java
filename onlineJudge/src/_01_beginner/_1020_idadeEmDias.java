/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere ano com 365 dias e mês com 30 dias.
      Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias,
      como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio
      matemático simples.

entrada 400
saida
1 ano(s)
1 mes(es)
5 dia(s)
 */

package _01_beginner;

import java.util.Scanner;

public class _1020_idadeEmDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano = 0;
        int mes = 0;
        int dia = entrada.nextInt();

        ano = dia / 365;
        dia = dia - (ano * 365);
        mes = dia / 30;
        dia = dia - (mes * 30);
        System.out.printf("%d ano(s)%n", ano);
        System.out.printf("%d mes(es)%n", mes);
        System.out.printf("%d dia(s)%n", dia);
    }
}
