package br.com.deitel.cap06.Exercicios;

/*
Criar uma classe com métodos estáticos para cálculos matemáticos
 */
public class Mathematics {
    public static int Power(int base, int expoent) {
        // calcula a potencia de um inteiro
        if (expoent == 0) return 1;
        int power = base;
        for (int i = 2; i <= expoent; i++) {
            power = power * base;
        }
        return power;
    }

    public static double Power(double base, int expoent) {
        // calcula a potencia de um double
        if (expoent == 0) return 1;
        double power = base;
        for (int i = 2; i <= expoent; i++) {
            power = power * base;
        }
        return power;
    }
}
