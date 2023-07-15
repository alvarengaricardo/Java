/*
 * Exercicio 31
 * Tabela de Quadrados e Cubos
 */

package br.com.deitel.cap02;

public class SquareCube {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++){
            System.out.println(i + "\t\t" + (int)(Math.pow(i, 2)) + "\t\t" + (int)(Math.pow(i, 3)));
        }
    }
}
