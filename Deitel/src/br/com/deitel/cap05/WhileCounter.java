package br.com.deitel.cap05;

/*
Exemplo básico de while
 */
public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10){
            System.out.printf("Counter = %d%n", counter);
            counter++;
        }
    }
}
