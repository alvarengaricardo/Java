package br.com.deitel.cap06;

/*
Declaração de métodos sobrecarregados
 */
public class MethodOverload {
    public static void main(String[] args) {
        // chamada de métodos sobrecarregados
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));

    }

    // método com int
    public static int square(int intValue){
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    // método com double
    public static double square(double doubleValue){
        System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
