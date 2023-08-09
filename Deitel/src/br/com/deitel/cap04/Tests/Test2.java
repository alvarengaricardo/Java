package br.com.deitel.cap04.Tests;

public class Test2 {
    public static void main(String[] args) {
        int a = 0, c = 3, d = 5, e = 4, f = 6, g = 12;
        c += 7;
        d -= 4;
        e *= 5;
        f /= 3;
        g %= 9;
        System.out.printf("c = %d%n", c);
        System.out.printf("d = %d%n", d);
        System.out.printf("e = %d%n", e);
        System.out.printf("f = %d%n", f);
        System.out.printf("g = %d%n", g);

        System.out.printf("******%n");
        System.out.println("a " + a);
        System.out.println("++a " + ++a);
        System.out.println(a);
        System.out.println("a++ " + a++);
        System.out.println(a);
        System.out.println("--a " + --a);
        System.out.println(a);
        System.out.println("a-- " + a--);
        System.out.println(a);
        System.out.println("*****");
        while (a <= 10){
            System.out.println(a++);
        }
        System.out.println("a fora: " + a);
        System.out.println("***** - *****");
        a = 0;
        while (a <= 10){
            System.out.println(++a);
        }

    }
}
