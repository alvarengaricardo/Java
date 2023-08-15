package br.com.deitel.cap05;

/*
Exemplo básico de while
 */
public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;
        int i = 0;
        while (counter <= 10){
            System.out.printf("Counter = %d%n", counter);
            counter++;
        }

        while(++i <=10) System.out.printf("%d ", i); // while com apenas uma linha

    }
}
