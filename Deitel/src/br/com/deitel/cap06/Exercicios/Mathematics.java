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

    public static double circleArea(int raio) {
        return (Math.PI * power(raio, 2));
    }

    public static double circleArea(double raio) {
        return (Math.PI * power(raio, 2));
    }

    public static double minimum3(double a, double b, double c) {
        double miminum;
        /*
        if (a >= b) miminum = b;
        if (b >= c) miminum = c;
         */

        miminum = Math.min(a, b);
        return (Math.min(miminum, c));
    }

    public static boolean isPerfect(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
            if (sum > number) return false;
        }
        return (sum == number);
    }

    public static boolean isPerfect(long number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
            if (sum > number) return false;
        }
        return (sum == number);
    }

    public static double celsius(double fahrenheit) {
        return (5.0 / 9.0 * (fahrenheit - 32));
    }

    public static double fahrenheit(double celsius) {
        return ((9.0 / 5.0 * celsius) + 32);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}
