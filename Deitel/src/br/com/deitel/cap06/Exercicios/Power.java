package br.com.deitel.cap06.Exercicios;

/*
Criar um método que calcule a potencia de inteiros
 */
public class Power {
    public static int integerPower(int base, int expoent){
        if (expoent == 0) return 1;
        int power = base;
        for (int i = 2; i <= expoent; i++){
            power = power * base;
        }
        return power;
    }
}
