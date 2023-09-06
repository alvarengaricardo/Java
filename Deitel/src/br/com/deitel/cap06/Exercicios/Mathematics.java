package br.com.deitel.cap06.Exercicios;

/*
Criar uma classe com métodos estáticos para cálculos matemáticos
 */
public class Mathematics {
    public static int power(int base, int expoent) {
        // calcula a potencia de um inteiro
        if (expoent == 0) return 1;
        int power = base;
        for (int i = 2; i <= expoent; i++) {
            power = power * base;
        }
        return power;
    }

    public static double power(double base, int expoent) {
        // calcula a potencia de um double
        if (expoent == 0) return 1;
        double power = base;
        for (int i = 2; i <= expoent; i++) {
            power = power * base;
        }
        return power;
    }

    public static double hypotenuse(double side1, double side2) {
        // calcula a hipotenusa a partir dos valores dos catetos
        return Math.sqrt(power(side1, 2) + power(side2, 2));
    }

    public static boolean isMultiple(int a, int b) {
        // verifica se b é multiplo de a
        return (b % a == 0);
    }

    public static boolean isMultiple(double a, double b) {
        // verifica se b é multiplo de a
        return (b % a == 0);
    }

    public static boolean isEven(int a) {
        // verifica se "a" é par
        return (a % 2 == 0);
    }

    public static boolean isEven(double a) {
        // verifica se "a" é par
        return (a % 2 == 0);
    }
}
