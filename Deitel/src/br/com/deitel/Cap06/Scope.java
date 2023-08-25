package br.com.deitel.Cap06;

public class Scope {
    // acess[ivel para todos os métodos dessa classe
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); // useLocalVariable tem uma variável local x
        useField(); // useField utiliza o campo x da classe Scope
        useLocalVariable(); // useLocalVariable reinicializa a variável local x
        useField(); // campo x da classe Scope retém seu valor

        System.out.printf("%nlocal x in main is %d%n", x);
    }

    // cria e inicializa a variável local x durante cada chamada
    public static void useLocalVariable() {
        int x = 25; // inicializada toda vez que useLocalVariable é chamado
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x; // modifica a variável local x desse método
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }

    // modifica o campo x da classe Scope durante cada chamada
    public static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10; // modifica o campo x da classe Scope
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
}