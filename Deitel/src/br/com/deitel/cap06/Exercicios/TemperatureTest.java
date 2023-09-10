package br.com.deitel.cap06.Exercicios;

import static br.com.deitel.cap06.Exercicios.Mathematics.celsius;
import static br.com.deitel.cap06.Exercicios.Mathematics.fahrenheit;

public class TemperatureTest {
    public static void main(String[] args) {
        System.out.printf("   ºC -> ºF:%n");
        System.out.printf("  0ºC = %.1fºF %n", fahrenheit(0.0));
        System.out.printf(" 25ºC = %.1fºF %n", fahrenheit(25.0));
        System.out.printf("100ºC = %.1fºF %n", fahrenheit(100.0));
        System.out.printf(" -8ºC = %.1fºF %n", fahrenheit(-8.0));

        System.out.printf("%n");

        System.out.printf("    ºF -> ºC:%n");
        System.out.printf("  32ºF = %.1fºC %n", celsius(32));
        System.out.printf("  77ºF = %.1fºC %n", celsius(77));
        System.out.printf(" 212ºF = %.1fºC %n", celsius(212));
        System.out.printf("17.6ºF = %.1fºC %n", celsius(17.6));


    }
}
