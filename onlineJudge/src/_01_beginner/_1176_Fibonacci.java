package _01_beginner;
import java.util.Scanner;
public class _1176_Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int teste = entrada.nextInt();
        long fibo;
        for (int i = 1; i <= teste; i++) {
            int n = entrada.nextInt();
            if (0 <= n && n <= 60) {
                fibo = fibonacci(n);
                System.out.printf("Fib(%d) = %d%n", n, fibo);
            }
        }
    }
    private static long fibonacci(int n) {
        long F = 0;     // atual
        long ant = 0;   // anterior

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }
}